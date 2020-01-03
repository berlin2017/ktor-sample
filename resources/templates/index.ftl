<#-- @ftlvariable name="data" type="cn.lonsun.IndexData" -->
<html>
<head>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/js/mdui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/css/mdui.min.css">
    <script src="dist/js/index.js" type="application/javascript" defer="true"></script>
    <script src="dist/js/login.js" type="application/javascript" defer="true"></script>

    <link rel="stylesheet" href="https://unpkg.com/mescroll.js@1.4.1/mescroll.min.css">
    <script src="https://unpkg.com/mescroll.js@1.4.1/mescroll.min.js" charset="utf-8"></script>
</head>
<body>
<div id="mescroll" class="mescroll">
    <div>
        <ul>
            <#list data.items as item>
                <li>${item}</li>
            </#list>
        </ul>
    </div>
</div>

<#include "login.ftl"/>
<button class="loginBtn">login</button>
</body>
</html>
