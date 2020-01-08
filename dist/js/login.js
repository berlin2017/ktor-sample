$$('#loginBtn').on('click',function () {
    login()
});

$$('.register-btn').on('click',function () {
    register()
});

function register() {
   window.location.href = "/user/register"
}

function login() {
    var username = $$("#nameInput").val();
    var password = $$("#passInput").val();
    $$.ajax({
        method: 'POST',
        url: '/user/login',
        data:{
            "username":username,
            "password":password
        },
        success: function (str) {
            var data = JSON.parse(str)
            if(data.status === 1){
                showSuccess()
            }else{
                showPassError(data.message)
            }
        }
    });
}

function showPassError(message) {
    var $error = $$('#passError');
    var usernameField = $$('#passField');
    $error.text(message);
    usernameField.addClass('mdui-textfield-invalid');
}

function showSuccess() {
    mdui.snackbar({
        message:'已登录，正在跳转首页',
        timeout:1000,
        onClose:function () {
            window.location.href="/"
        }
    });
}
