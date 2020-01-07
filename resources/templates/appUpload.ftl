<#-- @ftlvariable name="data" type="cn.lonsun.appDistribution.model.AppInfo" -->
<html>
<head>
    <title>首页-欢迎来到Berlin的世界</title>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/js/mdui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/css/mdui.min.css">
    <script src="/dist/js/appUpload.js" type="application/javascript" defer="true"></script>
    <script src="/dist/js/login.js" type="application/javascript" defer="true"></script>
    <link rel="stylesheet" href="/dist/css/appUpload.css">
</head>
<body class="mdui-theme-primary-indigo mdui-theme-accent-red">

<div class="mdui-container">

    <div class="mdui-progress mdui-m-t-5">
        <div class="mdui-progress-determinate" style="width: 0;" id="progressBar"></div>
    </div>

    <div class="mdui-m-t-5 mdui-p-a-5 app-form" id="app-form">
        <button class="mdui-btn mdui-color-theme mdui-center" id="upload-btn">立刻上传</button>
        <div class="mdui-m-t-2 mdui-text-center mdui-text-center mdui-text-color-gray"
             style="font-size: 14px;line-height: 1.6">
            点击按钮选择应用的安装包，或拖拽文件到此区域
            <br/>
            （支持ipa或apk文件，支持中断后续传）
        </div>

        <input id="file-input" type="file" multiple="multiple" accept=".apk,.ipa"
               style="visibility: hidden; position: absolute; top: 0px; left: 0px; height: 100px; width: 100px;">
    </div>

    <p><strong>注意：</strong> 贷款、吸储类应用禁止上传，同时请确保您的 App 符合berlin的 <a href="/about/rules" target="_blank">berlin应用审核规则</a>，违反该规则的 App 将被删除，屡次上传者将被封禁账号。</p>

</div>
</body>
</html>
