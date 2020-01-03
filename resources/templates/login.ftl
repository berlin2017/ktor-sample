<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/js/mdui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/css/mdui.min.css">
    <link rel="stylesheet" type="text/css" href="/dist/css/login.css">
</head>

<body class="mdui-theme-primary-indigo mdui-theme-accent-red">
<div class="mdui-dialog" id="login_dialog" style="border-radius: 10px;">
    <div class="mdui-card" style="border-radius: 10px;">
        <div class="mdui-row">

            <div class="mdui-col-xs-3" style="overflow: hidden;">
                <img src="/static/login_bg_left.png">
            </div>


            <div class="mdui-col-xs-6 mdui-p-a-3">
                <h1 class="mdui-center mdui-text-center">Sign in</h1>
                <label class="mdui-center mdui-text-center mdui-text-color-grey">Sign in to get personalized story recommendations, follow authors and topics you love, and interact with stories.</label>
                <div class="mdui-textfield mdui-textfield-floating-label">

                    <label class="mdui-textfield-label">用户名</label>
                    <input type="text" name="username" class="mdui-textfield-input" id="nameInput" required/>
                    <div class="mdui-textfield-error">用户名不能为空</div>
                </div>

                <div class="mdui-textfield mdui-textfield-floating-label" id="passField">

                    <label class="mdui-textfield-label">密码</label>
                    <input type="password" name="password" class="mdui-textfield-input" pattern="^.*(?=.{6,})(?=.*[a-z])(?=.*[A-Z]).*$"  id="passInput" required/>
                    <div class="mdui-textfield-error" id="passError">密码至少 6 位，且包含大小写字母</div>
                </div>

                <div class="mdui-float-right">No account? <button class="mdui-text-color-theme register-btn">Create one</button></div>

                <button class="mdui-btn mdui-btn-block mdui-m-t-4 mdui-ripple mdui-text-center" id="loginBtn">登录</button>

            </div>


            <div class="mdui-col-xs-3" style="overflow: hidden;">
                <img src="/static/login_bg_right.png">
            </div>


        </div>
    </div>

</div>
</body>
</html>