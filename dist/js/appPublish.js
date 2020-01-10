var $$ = mdui.JQ;

$$(function () {
    var id = getQueryVariable("id");

});

function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) {
            return pair[1];
        }
    }
    return (false);
}

function getAppItem(id) {
    $$.ajax({
        method: 'GET',
        url: './getAppItem',
        data: {
            "id": id
        },
        success: function (result) {
            console.log(result);
            const data = JSON.parse(result);
            if (data.status === 1) {

            }
        }
    })
}

$$("#timeInput").hide();

$$("#timeSelect").on("change", function () {
    const value = $$("#timeSelect").val();
    if (value === "later") {
        $$("#timeInput").show()
    } else {
        $$("#timeInput").hide()
    }
});

function publish(id) {
    const date = new Date();
    $$.ajax({
        method: 'POST',
        url: './publish',
        data: {
            "id": id,
            "updateDesc": $$("#updateDesc").val(),
            "appInfo": $$("#appInfo").val()
        },
        success: function (result) {
            console.log(result);
            const data = JSON.parse(result);
            if (data.status === 1) {
                showPublishSuccess()
            }
        }
    })
}

function showPublishSuccess() {
    mdui.snackbar({
        message:'发布成功,请等待审核完成',
        timeout:1000,
        onClose:function () {
            window.location.href="./"
        }
    });
}









