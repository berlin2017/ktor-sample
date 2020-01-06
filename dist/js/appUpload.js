var $$ = mdui.JQ;

$$("#app-form").on('click', function (e) {
    chooseFile()
});

$$("#file-input").on('change', function (e) {
    uploadFile($$("#file-input")[0].files)
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
        cache      : false,
        processData: false,
        data: formData,
        beforeSend        : function (XMLHttpRequest)
        {

            //Upload progress
            XMLHttpRequest.upload.addEventListener( "progress", function ( evt )
            {
                if ( evt.lengthComputable )
                {
                    var percentComplete = Math.round( (evt.loaded * 100) / evt.total );
                    //Do something with upload progress
                    console.log( 'Uploaded percent', percentComplete );
                    $$("#progressBar").css("width",percentComplete+"%")
                }
            }, false );
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

