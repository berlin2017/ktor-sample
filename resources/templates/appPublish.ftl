<#-- @ftlvariable name="data" type="cn.lonsun.appDistribution.model.AppItem" -->
<html>
<head>
    <title>首页-欢迎来到Berlin的世界</title>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/js/mdui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/css/mdui.min.css">
    <script src="/dist/js/appPublish.js" type="application/javascript" defer="true"></script>
    <script src="/dist/js/login.js" type="application/javascript" defer="true"></script>
    <link rel="stylesheet" href="/dist/css/appUpload.css">
    <script src="https://app-info-parser.quincychen.cn/js/app-info-parser.min.js"></script>
</head>
<body class="mdui-theme-primary-indigo mdui-theme-accent-red">

<#if data??>
<div class="mdui-container">


    <div class="mdui-card mdui-p-a-2 mdui-m-t-5">

        <div class="mdui-p-a-1">
            <img style="width: 120px; height: 120px;" src="${data.icon}" alt="" class="mdui-center">
            <div class="mdui-text-center mdui-m-t-2">版本:${data.versionName}</div>
        </div>

        <div class="mdui-m-t-3">
            <label class="mdui-text-color-black">应用名称</label>
            <input class="mdui-textfield-input mdui-m-t-1" type="text" name="appName" id="appName" disabled value=${data.appName}>
        </div>

        <div class="mdui-m-t-3">
            <label class="mdui-text-color-black">发布时间</label>
            <select class="mdui-select mdui-m-t-1" style="width:100%"  id="timeSelect">
                <option value="now" selected>即时发布</option>
                <option value="later">定时发布</option>
            </select>
            <input class="mdui-textfield-input mdui-m-t-1" type="time" name="time" id="timeInput">
        </div>

        <div class="mdui-m-t-3">
            <label class="mdui-text-color-black">更新说明</label>
            <textarea class="mdui-textfield-input mdui-m-t-1" rows="4" placeholder="请填写更新说明" name="updateDesc"
                      id="updateDesc"></textarea>
        </div>

        <div class="mdui-m-t-3">
            <label class="mdui-text-color-black">应用介绍</label>
            <textarea class="mdui-textfield-input mdui-m-t-1" rows="4" placeholder="请填写应用介绍" name="appInfo"
                      id="appInfo"></textarea>
        </div>


        <button class="mdui-btn mdui-btn-block mdui-color-theme mdui-ripple mdui-m-t-5" id="publish-btn" onclick="publish(${data.id})">发布</button>

    </div>


</div>
</#if>

</body>
</html>
