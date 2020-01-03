var $$ = mdui.JQ;

$$('#register-btn').on('click',function (e) {
    register()
});

$$('#nameInput').on('input',function (e) {
    var value = $$('#nameInput').val();
    if(value.trim() !== ""){
        isUsernameValid(value)
    }
    // else {
    //     showUsernameError("用户名不能为空")
    // }
});

function isUsernameValid(name) {
    $$.ajax({
        method: 'POST',
        url: '/user/isUserExist',
        data:{
            "username":name
        },
        success: function (str) {
            var data = JSON.parse(str);
            if(data.status === 1){
                showUsernameCurrect()
            }else{
                showUsernameError(data.message)
            }
        }
    });
}

function showUsernameCurrect() {
    var usernameField = $$('#usernameField');
    usernameField.removeClass('mdui-textfield-invalid')
}

function showUsernameError(message) {
    var $error = $$('#usernameError');
    var usernameField = $$('#usernameField');
    $error.text(message);
    usernameField.addClass('mdui-textfield-invalid');
}

function register() {
    var form = $$('#register-form');
    var formData = getFormData(form);
    $$.ajax({
        method: 'POST',
        url: '/user/register',
        data:formData,
        success: function (str) {
            var data = JSON.parse(str)
            if(data.status === 1){
                registerSuccess()
            }else{
                showUsernameError(data.message)
            }
        }
    });
}

function getFormData(form){
    var unindexed_array = form.serializeArray();
    var indexed_array = {};

    $$.map(unindexed_array, function(n, i){
        indexed_array[n['name']] = n['value'];
    });

    return indexed_array;
}

function registerSuccess() {
    mdui.snackbar({
        message:'注册成功',
        timeout:1000,
        onClose:function () {
            window.location.href="/"
        }
    });
}