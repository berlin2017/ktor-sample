<#-- @ftlvariable name="data" type="cn.lonsun.appDistribution.model.AppInfo" -->
<html>
<head>
    <title>首页-欢迎来到Berlin的世界</title>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/js/mdui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/css/mdui.min.css">
    <script src="dist/js/appIndex.js" type="application/javascript" defer="true"></script>
    <script src="dist/js/login.js" type="application/javascript" defer="true"></script>
    <link rel="stylesheet" href="dist/css/appIndex.css">
</head>
<body class="mdui-theme-primary-indigo mdui-theme-accent-red">

<div class="mdui-container">
    <div class="mdui-table-fluid mdui-m-t-5">
        <table class="mdui-table">
            <thead>
            <tr>
                <th>应用名称</th>
                <th>版本</th>
                <th>下载方式</th>
                <th>更新时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>

            <#list data as item>
                <tr>
                    <td class="mdui-valign">
                        <img src="https://appicon.pgyer.com/image/view/app_icons/cf54234c9d371bc6db61b2fd71874dd4/60"
                             class="mdui-img-circle">
                        <div class="mdui-m-l-1">
                            <div class="mdui-text-color-black app-name">${item.name}</div>
                            <div class="mdui-text-color-grey">${item.type}</div>
                        </div>

                    </td>
                    <td>${item.apps[0].versionName}</td>
                    <td>
                        ${item.apps[0].path}
                    </td>
                    <td>${item.apps[0].time}</td>
                    <td >
                        <div class="mdui-valign">
                            <button class="mdui-btn mdui-ripple mdui-color-green">详情</button>
                            <button class="mdui-btn mdui-ripple mdui-color-theme mdui-m-l-1">编辑</button>
                        </div>
                    </td>
                </tr>
            </#list>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>
