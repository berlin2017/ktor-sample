const $$ = mdui.JQ;

$$(".mdui-progress").hide();

$$("#app-form").on('click', function (e) {
    chooseFile()
});

$$("#file-input").on('change', function (e) {
    uploadFile($$("#file-input")[0].files)
});

//拖拽文件刚到目标上
$$('#app-form').on('dragenter', function () {
    console.log("dragenter");
});

//拖拽在目标上，一直执行
$$('#app-form').on('dragover', function () {
    console.log("dragover");
    $$('#app-form').css("background", "green");
    return false;
});

//拖拽时离开目标
$$('#app-form').on("dragleave", function () {
    console.log("dragleave");
    $$('#app-form').css("background", "none");
});

//拖拽到目标并释放
$$('#app-form').on("drop", function (ev) {
    console.log("drop");
    $$('#app-form').css("background", "none");
    var fs = ev.dataTransfer.files;
    uploadFile(fs);
    return false;
});


function chooseFile() {
    $$("#file-input")[0].click();
}

function uploadFile(files) {
    $$(".mdui-progress").show();
    const formData = new FormData();
    for (const i in files) {
        formData.append("crowd_file", files[i]);
        formData.append("crowd_name", files[i].name);
    }
    $$.ajax({
        method: 'POST',
        url: './upload',
        contentType: false,
        cache: false,
        processData: false,
        data: formData,
        beforeSend: function (XMLHttpRequest) {

            //Upload progress
            XMLHttpRequest.upload.addEventListener("progress", function (evt) {
                if (evt.lengthComputable) {
                    var percentComplete = Math.round((evt.loaded * 100) / evt.total);
                    //Do something with upload progress
                    console.log('Uploaded percent', percentComplete);
                    $$("#progressBar").css("width", percentComplete + "%")
                }
            }, false);
            // //Download progress
            // XMLHttpRequest.addEventListener( "progress", function ( evt )
            // {
            //     if ( evt.lengthComputable )
            //     {
            //         var percentComplete = Math.round( (evt.loaded * 100) / evt.total );
            //         //Do something with download progress
            //         console.log( 'Downloaded percent', percentComplete );
            //     }
            // }, false );
        },
        success: function (result) {
            console.log(result);
            var data = JSON.parse(result);
            if (data.status === 1) {
                const path = data.data[0].filePath;
                // window.location.href = './publish?path=' + path

                analysicApp(files[0], path)
            }
        }
    });
}

function analysicApp(file, path) {
    const parser = new AppInfoParser(file);
    parser.parse().then(result => {
            const apkInfo = JSON.parse(JSON.stringify(result));
            console.log(result);
            const div = document.createElement('div');
            div.innerHTML = `
            <div style="padding: 20px; margin-bottom: 10px; background: #fff; border-radius: 4px; font-size: 16px; color: #717171; border: 1px solid #d9d9d9; border-color: #e9e9e9;">
              <p style="padding: 10px 0; display: flex; overflow: hidden;">
                <span style="color: #000; text-align: right; width: 100px; font-weight: 600; padding-right: 20px;">filename: </span>
                <span style="width: 0; flex: 1; overflow-wrap: break-word; word-wrap: break-word;">${file.name}</span>
              </p>
                  <p style="padding: 10px 0; display: flex; overflow: hidden;">
                <span style="color: #000; text-align: right; width: 100px; font-weight: 600; padding-right: 20px;">app name: </span>
                <span style="width: 0; flex: 1; overflow-wrap: break-word; word-wrap: break-word;">${result['application'].label[0] || result['CFBundleDisplayName']}</span>
              </p>
              <p style="padding: 10px 0; display: flex; overflow: hidden;">
                <span style="color: #000; text-align: right; width: 100px; font-weight: 600; padding-right: 20px;">app icon: </span>
                <img style="width: 80px; height: 80px;" src="${result.icon}" alt="">
              </p>
              <p style="padding: 10px 0; display: flex; overflow: hidden;">
                <span style="color: #000; text-align: right; width: 100px; font-weight: 600; padding-right: 20px;">app bundle: </span>
                <span style="width: 0; flex: 1; overflow-wrap: break-word; word-wrap: break-word;">${result['package'] || result['CFBundleName']}</span>
              </p>
              <p style="padding: 10px 0; display: flex; overflow: hidden;">
                <span style="color: #000; text-align: right; width: 100px; font-weight: 600; padding-right: 20px;">app version: </span>
                <span style="width: 0; flex: 1; overflow-wrap: break-word; word-wrap: break-word;">${result['versionName'] || result['CFBundleShortVersionString']}</span>
              </p>
            </div>
          `;

            document.getElementById('result-list').appendChild(div);
            if (file.name.endsWith("apk")
            ) {
                getAppInfo(result['package'], "Android", path, apkInfo)
            } else {
                getAppInfo(result['CFBundleName'], "IOS", path)
            }
        }
    )
}

function getAppInfo(bundleId, type, path, apkInfo) {
    $$.ajax({
        method: 'POST',
        url: './getAppInfo',
        data: {
            "bundleId": bundleId,
            "type": type
        },
        success: function (result) {
            console.log(result);
            const data = JSON.parse(result);
            if (data.status === 1) {
                const file = dataURLtoFile(apkInfo.icon,bundleId+apkInfo.versionName)
                saveAppItem(data.data.appId, path, apkInfo.versionName, apkInfo.versionCode, apkInfo.application.label[0], file)
            }
        }
    })
}

function dataURLtoFile(dataurl, filename = 'file') {
    let arr = dataurl.split(',')
    let mime = arr[0].match(/:(.*?);/)[1]
    let suffix = mime.split('/')[1]
    let bstr = atob(arr[1])
    let n = bstr.length
    let u8arr = new Uint8Array(n)
    while (n--) {
        u8arr[n] = bstr.charCodeAt(n)
    }
    return new File([u8arr], `${filename}.${suffix}`, {
        type: mime
    })
}

function saveAppItem(appId, path, versionName, versionCode, appName, icon) {
    const formData = new FormData();
    formData.append("appId", appId);
    formData.append("path", path);
    formData.append("versionName", versionName);
    formData.append("versionCode", versionCode);
    formData.append("appName", appName);
    formData.append("icon", icon);
    $$.ajax({
        method: 'POST',
        url: './saveAppItem',
        data: formData,
        contentType: false,
        cache: false,
        processData: false,
        success: function (result) {
            console.log(result);
            const data = JSON.parse(result);
            if (data.status === 1) {
                const id = data.data.id;
                window.location.href = './publish?id=' + id
            }
        }
    })
}












