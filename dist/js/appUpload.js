var $$ = mdui.JQ;

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
    $$('#app-form').css("background","green");
    return false;
});

//拖拽时离开目标
$$('#app-form').on("dragleave", function () {
    console.log("dragleave");
    $$('#app-form').css("background","none");
});

//拖拽到目标并释放
$$('#app-form').on("drop", function (ev) {
    console.log("drop");
    $$('#app-form').css("background","none");
    var fs = ev.dataTransfer.files;
    uploadFile(fs);
    return false;
});


function chooseFile() {
    $$("#file-input")[0].click();
}

function uploadFile(files) {
    var formData = new FormData();
    for (var i in files) {
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
        success: function (data) {
            console.log(data);
        }
    });
}

