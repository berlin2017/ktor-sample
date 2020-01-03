var $$ = mdui.JQ;

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
    mdui.snackbar({
        message:'已登录，正在跳转首页',
        timeout:1000,
        onClose:function () {
            window.location.href="/"
        }
    });
}
