<!DOCTYPE html>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="https://cdnjs.loli.net/ajax/libs/mdui/0.4.3/css/mdui.min.css">
    <script src="https://cdnjs.loli.net/ajax/libs/mdui/0.4.3/js/mdui.min.js"></script>
    <script src="/dist/js/register.js" defer="true"></script>
</head>
<body class="mdui-theme-primary-indigo mdui-theme-accent-red">

<div class="mdui-container">
    <div class="mdui-p-a-5 mdui-m-t-5">
        <form id="register-form" method="get">
        <h1 class="mdui-center mdui-text-center">Join Medium</h1>
        <label class="mdui-center mdui-text-center mdui-text-color-grey">Create an account to receive great stories in
            your inbox, personalize your homepage, and follow authors and topics that you love.</label>

        <div class="mdui-textfield mdui-textfield-floating-label" id="usernameField">
            <label class="mdui-textfield-label">用户名</label>
            <input class="mdui-textfield-input" type="text" name="username" id="nameInput" required/>
            <div class="mdui-textfield-error" id="usernameError">用户名不能为空</div>
        </div>

        <div class="mdui-textfield mdui-textfield-floating-label">
            <label class="mdui-textfield-label">邮箱</label>
            <input class="mdui-textfield-input" type="email" name="email" required/>
            <div class="mdui-textfield-error">邮箱格式错误</div>
        </div>

        <div class="mdui-textfield mdui-textfield-floating-label">
            <label class="mdui-textfield-label">密码</label>
            <input class="mdui-textfield-input" type="password" pattern="^.*(?=.{6,})(?=.*[a-z])(?=.*[A-Z]).*$" name="password"
                   required/>
            <div class="mdui-textfield-error">密码至少 6 位，且包含大小写字母</div>
            <div class="mdui-textfield-helper">请输入至少 6 位，且包含大小写字母的密码</div>
        </div>

        </form>

        <button class="mdui-btn mdui-btn-block mdui-color-theme mdui-ripple mdui-m-t-5" id="register-btn">注册</button>
    </div>

</div>

</body>
</html>