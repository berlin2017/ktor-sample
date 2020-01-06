<#-- @ftlvariable name="data" type="cn.lonsun.IndexData" -->
<html>
<head>
    <title>首页-欢迎来到Berlin的世界</title>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/js/mdui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/mdui/0.4.3/css/mdui.min.css">
    <script src="dist/js/index.js" type="application/javascript" defer="true"></script>
    <script src="dist/js/login.js" type="application/javascript" defer="true"></script>
    <link rel="stylesheet" href="dist/css/index.css">
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/chart.js@2.9.3/dist/Chart.min.js"></script>

    <#--    <link rel="stylesheet" href="https://unpkg.com/mescroll.js@1.4.1/mescroll.min.css">-->
    <#--    <script src="https://unpkg.com/mescroll.js@1.4.1/mescroll.min.js" charset="utf-8"></script>-->
</head>
<body class="mdui-theme-primary-indigo mdui-theme-accent-red">
<#--<div id="mescroll" class="mescroll">-->
<#--    <div>-->
<#--        <ul>-->
<#--            <#list data.items as item>-->
<#--                <li>${item}</li>-->
<#--            </#list>-->
<#--        </ul>-->
<#--    </div>-->
<#--</div>-->


<div>
    <div class="mdui-appbar mdui-appbar-scroll-hide">

        <div class="mdui-toolbar mdui-color-white">
            <a href="javascript:;" class="mdui-typo-headline title-text">Medium</a>
            <div class="mdui-toolbar-spacer"></div>
            <div class="mdui-textfield mdui-textfield-expandable">
                <button class="mdui-textfield-icon mdui-btn mdui-btn-icon"><i
                            class="mdui-icon material-icons">search</i></button>
                <input class="mdui-textfield-input" type="text" placeholder="Search"/>
                <button class="mdui-textfield-close mdui-btn mdui-btn-icon"><i
                            class="mdui-icon material-icons">close</i></button>
            </div>
            <a href="javascript:;" class="mdui-btn mdui-btn-icon mdui-ripple"><i class="mdui-icon material-icons">refresh</i></a>
            <a href="javascript:;" class="mdui-btn mdui-btn-icon mdui-ripple"><i class="mdui-icon material-icons">more_vert</i></a>
            <a href="javascript:;" class="mdui-btn mdui-color-green mdui-text-color-white mdui-ripple">Get Started</a>
        </div>
    </div>

</div>

<h2 class="mdui-text-color-black mdui-text-center top-title">Get smarter about what matters to you.</h2>


</div>

<#include "login.ftl"/>
<button class="loginBtn mdui-center mdui-btn mdui-color-green mdui-text-color-white mdui-ripple ">Get Started<i
            class="mdui-icon material-icons">share</i></button>

<canvas id="myChart" width="100" height="100" class="mdui-m-t-5">
    <p>Hello Fallback World</p>
</canvas>

</body>
</html>
