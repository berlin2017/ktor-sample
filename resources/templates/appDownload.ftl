<#-- @ftlvariable name="data" type="cn.lonsun.appDistribution.model.AppInfo" -->
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<head>
    <title>  ${data.apps[0].appName} </title>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="蒲公英,内测分发托管,pgyer,app内测,app托管分发,app测试,ios内测,android内测,beta test,Beta app,testflight,免费内测,app下载,内测SDK,udid获取，pgy,安卓内测,苹果内测,企业签名,苹果企业签名,app企业签名,蒲公英企业签名,超级签名,ios企业证书，苹果企业证书,企业证书签名,apple企业签名, iOS企业签名,iOS 企业签名,iOS企业账号,iOS 企业账号,apple企业账号,apple 企业账号,apple企业证书,apple 企业证书,苹果企业账号,ios企业分发,ios 企业分发,苹果企业分发,ios超级签名,ios专属签名">
    <meta name="description" content="蒲公英app内测分发平台(pgyer.com)提供免费的苹果ios|安卓android应用app内测分发托管|ios苹果app企业证书签名,功能强大的内测SDK,实现摇一摇提交反馈、crash、版本自动更新等功能，解决开发者app内测分发托管时繁杂低效的问题">
    <meta property="og:type" content="webpage">
    <meta property="og:url" content="https://www.pgyer.com">
    <meta property="og:title" content="蒲公英">
    <meta property="og:description" content="蒲公英 为开发者提供简洁迅速的内测程序分发服务">
    <meta name="apple-mobile-web-app-title" content="蒲公英">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no minimal-ui">

    <link rel="dns-prefetch" href="//www.pgyer.com">
    <link rel="dns-prefetch" href="//appicon.pgyer.com">
    <link rel="dns-prefetch" href="//www.pgyer.com">
    <link rel="dns-prefetch" href="//static.pgyer.com">
    <link rel="shortcut icon" href="https://static.pgyer.com/static-20200109/assets/img/favicon.ico" />


    <link rel="stylesheet" href="https://static.pgyer.com/static-20200109/assets/build/header_include.min.css">
    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-52814215-1"></script>
    <script src="/dist/js/qrcode.js"/>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());
        gtag('config', 'UA-52814215-1', {
            'link_attribution': true,
            'custom_map': {
                'dimension1': 'register_and_unregister_users',
                'dimension2': 'app_page_with_ad',
                'dimension3': 'is_app_page'
            }
        });
    </script>
    <link rel="stylesheet" href="https://static.pgyer.com/static-20200109/assets/css/appView.css">
    <link rel="stylesheet" href="https://static.pgyer.com/static-20200109/assets/css/viewColorful.css">
    <style>
    </style>

</head>

<body>

<!-- wechat share icon -->
<div style="display:none;" id="wechatShareImg">
    <img src="https://appicon.pgyer.com/image/view/app_icons/690dd516529ffe073b5e6a2c3e27adb0/f300" onerror="javascript:this.src='https://static.pgyer.com/static-20200109/assets/img/default-icon.png';" />
</div>




<div class="row-fluid  margin-bottom-20" style="z-index:-2;">
    <div id="header"></div>
</div>


<!--=== Content Part ===-->
<div class="container content">


    <div class="view row">
        <div class="span12 margin-bottom-30 " id="appicon-bg">
            <img src="${data.apps[0].icon}" class="appicon" onerror="javascript:this.src='https://static.pgyer.com/static-20200109/assets/img/default-icon.png';" />
        </div>
        <div class="span12" style="text-align:center;padding-top:10px;">
            <h2 style="color:#333;size:24px;margin-bottom: -5px;">
                ${data.apps[0].appName}                            <span class="label label-danger signature-label signature_in_house">企业版</span>
            </h2>
        </div>

        <div class="span12 gray-text" style="text-align:center;">
            <ul class="breadcrumb pb-20" >
                <li>版本：${data.apps[0].versionName} (build ${data.apps?size})</li>
                <li>大小：36.7 MB</li>
                <li >更新时间：2 天前</li>
            </ul>
        </div>

    </div>

    <div id="" class="view row margin-bottom-30 col-md-6 col-md-offset-3" >
        <div class="col-md-6 col-md-offset-3">
            <div class="span12 gray-text" style="text-align:center;">
                <p style="padding-top:10px;color:#969b9d;">用手机扫描二维码安装</p>
            </div>
            <div class="span12 gray-text" style="text-align:center;">
                <div id="qrcode"></div>
                <script type="text/javascript">
                    new QRCode(document.getElementById("qrcode"), "http://jindo.dev.naver.com/collie");
                </script>
<#--                <div id="qrcode"></div>-->
<#--                <img src="https://www.pgyer.com/app/qrcode/U4aj?sign=wF%252Bc6xrYboWAhyWphK3CKaWOG1nWnPOjUOr4k%252BytWldoocjigflqfWRpq5XyUhNM&auSign=&code=" class="qrcode-merge" />-->
            </div>
        </div>
    </div>

    <!-- Start install -->
    <div id="" class="view row" style="margin-top:30px;">

        <div class="span12 margin-bottom-20" style="text-align:center;display:none;">
            <div class="spinner">
                <div id="showtext">正在安装，请按 Home 键在桌面查看</div>
                <div class="loading"></div>
                <a href="javascript:void(0);" onclick="javascript:install_loading();" id="down_load"  class="btn-u btn-u-lg btn-u-green"><i class="fa fa-download"></i> 点击安装</a>
            </div>
        </div>

    </div>
    <!-- Dnd install -->

    <!-- ====== Start appStore ==== -->


    <!-- Start Merge App info -->
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <hr class="devider devider-dotted" />
        </div>
    </div>
    <div id="" class="view row margin-bottom-30">
        <div class="col-md-8 col-md-offset-2 pt-20">
            <div class="col-md-6" style="border-right:1px solid #e7ebed;">
                <div class="row text-center" >

                    <div class="margin-bottom-20">
                        <i class="fa fa-apple" aria-hidden="true" style="font-size:36px;color:#666d71;"></i>
                    </div>
                    <p style="color:#969b9d;">
                        <span style="padding-right:15px;">版本：1.0.8 (build 9)</span>
                        大小：36.7 MB                                    </p>
                    <div class="margin-bottom-20 mt-40">
                        <a href="javascript:void(0);"  onclick="javascript:install_merge_loading('ios');" id="down_load"  class="btn-u btn-u-lg " style="padding:8px 40px;">
                            <img src="https://static.pgyer.com/static-20200109/images/dl.png" class="hide">
                            下载 iOS 版                        </a>
                    </div>
                </div>
            </div>
            <div class="col-md-6" style="border-left:0px solid #ccc;">
                <div class="row text-center" >

                    <div class="margin-bottom-20">
                        <i class="fa fa-android" aria-hidden="true" style="font-size:36px;color:#666d71;"></i>
                    </div>
                    <p style="color:#969b9d;">
                        <span style="padding-right:15px;">版本：1.1.9 (build 17)</span>
                        大小：75.8 MB                </p>
                    <div class="margin-bottom-20 mt-40">
                        <a href="javascript:void(0);" onclick="javascript:install_merge_loading('android');" id="down_load"  class="btn-u btn-u-lg " style="padding:8px 24px;" >
                            <img src="https://static.pgyer.com/static-20200109/images/dl.png" class="hide">
                            下载 Android 版                    </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Merge App Info -->

    <!-- ====== End appStore ==== -->



    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <hr class="devider devider-dotted" />
        </div>
    </div>

    <div class="row">
        <div class="col-md-8 col-md-offset-2" style="word-break:break-all;">
            <div class="tag-box ">
                <h2 class="content-title">历史版本</h2>
                <table class="table table-striped table-hover app_view_history">
                    <tbody>
                    <input type="hidden" id="pageNum" value="1">
                    <tr appkey="1c5c0e1b36d00ced00b80f92659a8924" class="history_row">
                        <td   class="history-item" >1.0.7 (build 8)</td>
                        <td class="text-left " style="min-width:100px;">
                        </td>
                        <td  nowrap="nowrap" class="text-right pr-50"  >
                            2 天前                        </td>
                    </tr>
                    <tr appkey="98721d19476fd85c59376624890eb71c" class="history_row">
                        <td   class="history-item" >1.0.6 (build 7)</td>
                        <td class="text-left " style="min-width:100px;">
                        </td>
                        <td  nowrap="nowrap" class="text-right pr-50"  >
                            2020-01-02                        </td>
                    </tr>
                    <tr appkey="62f77e9b04960345347f19e48c1dd388" class="history_row">
                        <td   class="history-item" >1.0.5 (build 6)</td>
                        <td class="text-left " style="min-width:100px;">
                        </td>
                        <td  nowrap="nowrap" class="text-right pr-50"  >
                            2019-12-31                        </td>
                    </tr>
                    <tr appkey="a1cca7393c11f36d276c04302c9cca93" class="history_row">
                        <td   class="history-item" >1.0.4 (build 5)</td>
                        <td class="text-left " style="min-width:100px;">
                            1.修复详情页地址含有空格转码失败的问题                                                </td>
                        <td  nowrap="nowrap" class="text-right pr-50"  >
                            2019-12-16                        </td>
                    </tr>
                    <tr appkey="4eedaf782e35bb37e8456d457bd780eb" class="history_row">
                        <td   class="history-item" >1.0.3 (build 4)</td>
                        <td class="text-left " style="min-width:100px;">
                            1.解决已审核刷新角标问题
                            2.主页搜索修改为搜索内容                                                </td>
                        <td  nowrap="nowrap" class="text-right pr-50"  >
                            2019-12-13                        </td>
                    </tr>

                    <tr class="history_show_more" id="ajaxMore">
                        <td class="text-center warning" colspan="3"><i class="fa fa-angle-double-down" aria-hidden="true"></i> 查看更多</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>





</div><!--/container-->
<!--=== End Content Part ===-->


<!--=== Copyright ===-->
<link rel="stylesheet" href="https://static.pgyer.com/static-20200109/assets/plugins/sky-forms/version-2.0.1/css/custom-sky-forms.css">
<link href="https://static.pgyer.com/static-20200109/fineuploader/fineuploader.css" rel="stylesheet" type="text/css"/>
<div class="copyright"  style="display:none">
    <div class="container" style="z-index:-1;">
        <div class="row">
            <div class="col-lg-8  col-xs-12 col-md-6 col-sm-6 text-left" style="z-index:0;">
                <a href="/" target='_blank'>蒲公英</a>｜
                <a href="/about/disclaimer" target="_blank">免责声明</a>｜
                <a data-toggle="modal" data-modal='reportAppModal' id="reportClick" style="cursor: pointer;">举报</a>
            </div>
            <div class="col-lg-4  col-xs-12 col-md-6 col-sm-6 text-right" style="z-index:0;">
                <a href="/lang/select?l=cn&redi=https%3A%2F%2Fwww.pgyer.com%2FU4aj%3Fsig%3DwF%252Bc6xrYboWAhyWphK3CKaWOG1nWnPOjUOr4k%252BytWldoocjigflqfWRpq5XyUhNM"><img src="https://static.pgyer.com/static-20200109/assets/img/language_chinese.png"> 中文</a>
                &nbsp;&nbsp;&nbsp;<a href="/lang/select?l=en&redi=https%3A%2F%2Fwww.pgyer.com%2FU4aj%3Fsig%3DwF%252Bc6xrYboWAhyWphK3CKaWOG1nWnPOjUOr4k%252BytWldoocjigflqfWRpq5XyUhNM"><img src="https://static.pgyer.com/static-20200109/assets/img/language_english.png"> English</a>
            </div>
        </div><!--/row-fluid-->
    </div><!--/container-->
</div>
<div id="reportAppModal"></div>
<div id="feedbackAppModal"></div>
<div id="freeModal"></div>
<div id="loginTelModalDiv"></div>
<div class="modal fade addmodel in" id="inhouseTip" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false" style="display: none;">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title font-16">"未受信任的企业级开发者"的解决办法</h4>
            </div>
            <div class="modal-body" style="background:#f2f2f2;height:600px;overflow-y: scroll;">
                <section>
                    <div style="padding:0 20px 20px;color:#333;">
                        <p>因苹果公司的政策原因，在iOS系统中首次安装企业版应用时会出现"未受信任的企业级开发者"提示</p>
                    </div>
                    <div style="padding:0 10px 20px;">
                        <img class="img-responsive center-block mt-20 mb-20" src="https://static.pgyer.com/static-20200109/images/resovelFlow1_cn.png" style="width:80%;">
                        <br/>
                        <h4 class="font-16">解决办法如下（以iOS11系统为例）：</h4>
                        <li style="list-style:none;color:#333;">1、在手机中打开设置功能，选择"通用"</li>
                        <img class="img-responsive center-block mt-20 mb-20" src="https://static.pgyer.com/static-20200109/images/resovelFlow2_cn.png" style="width:80%;">
                        <li style="list-style:none;color:#333;">2、在通用中，选择"描述文件与设备管理"功能</li>
                        <img class="img-responsive center-block mt-20 mb-20" src="https://static.pgyer.com/static-20200109/images/resovelFlow3_cn.png" style="width:80%;">
                        <li style="list-style:none;color:#333;">3、在描述文件与设备管理中的企业级应用分类中，选择要安装的企业应用的文件名称（与打开时的提示一致），点击进入</li>
                        <img class="img-responsive center-block mt-20 mb-20" src="https://static.pgyer.com/static-20200109/images/resovelFlow4_cn.png" style="width:80%;">
                        <li style="list-style:none;color:#333;">4、进入企业签名页面后，确认企业签名中的公司名称与应用名称后，点击信任"企业签名公司名称"</li>
                        <img class="img-responsive center-block mt-20 mb-20" src="https://static.pgyer.com/static-20200109/images/resovelFlow5_cn.png" style="width:80%;">
                        <img class="img-responsive center-block mt-20 mb-20" src="https://static.pgyer.com/static-20200109/images/resovelFlow6_cn.png" style="width:80%;">
                        <li style="list-style:none;color:#333;">5、回到桌面，重新打开应用即可使用</li>
                        <br/>
                    </div>
                </section>
            </div>
            <div class="modal-footer" style="margin-top:0px">
                <a data-dismiss="modal" href="javascript:void(0)" class="btn btn-u btn-u btn-u-default" id="cancle" style="border-radius:0;width:auto;height:auto;">关闭</a>
            </div>
        </div>
    </div>
</div>

<div id="appInstallConfirmModal">
    <div>
        <img src="https://static.pgyer.com/static-20200109/images/app_install_confirm_pic1.png">
        <p>该应用可能涉及金融风险，请谨慎下载</p>
        <img src="https://static.pgyer.com/static-20200109/images/app_install_confirm_pic2.png" onclick="$('#appInstallConfirmModal').css('top', '-100px');">
    </div>
</div>


<!--=== End Copyright ===-->
<!-- JS Global Compulsory -->
<script type="text/javascript">
    var userKey = "";
    const maxImageCount = '5';
    var feedbackImageCounter = 0;
    const imageCountOutTips = "反馈截图最多不能超过5张";
</script>
<script type="text/javascript" src="https://static.pgyer.com/static-20200109/assets/build/app_view.min.js"></script>
<script type="text/javascript" src="https://static.pgyer.com/static-20200109/assets/js/plugins/ua-parser.min.js"></script>
<script>
    // baidu tongji
    var _hmt = _hmt || [];
    _hmt.push(['_setUserTag', '5820', 'developers']);
    (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?8748fc8d44d4c96b145053b62e3788fe";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
<script src="https://static.pgyer.com/static-20200109/fineuploader/jquery.fine-uploader.min.js"></script>
<script type="text/javascript" src="https://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<!--[if lt IE 9]>
<script src="https://static.pgyer.com/static-20200109/assets/plugins/respond.js"></script>
<![endif]-->
<script>
    aType = 'ios',
        aKey = '34d0c0c8dfa8f1dbe8f6af1906782876',
        agKey = '2c9f9b090038d424798d2fe55b464ce8',
        isMergeApp = '',
        submiting = '请稍候...',
        submitText = '立即进入',
        isMobileRequest = false == true?true:isiPad(),
        isMobilePhone = false,
        askBrowserAlert = '请在手机上使用浏览器打开本页面，或者扫描下面的二维码，即可安装',
        forIosAlert = '您的手机是Android系统，无法安装iOS应用',
        forAndroidAlert = '您的手机是iOS系统，无法安装Android应用',
        isWechatRequest = false,
        isQQRequest = false,
        isUCRequest = false,
        isWeiboRequest = false,
        isAdDisplayed = false,
        needInstallInOutBrowser = false,
        remindOpenBrowserText = '',
        browseType = 'other',
        appInstallPasswordAlert = '请输入密码',
        appStoreUrl = '',
        reminderWechatDownloadContent = '请点击微信右上角按钮，然后在弹出的菜单中，点击在浏览器中打开，即可下载',
        reminderUCDownloadContent = '您当前使用的是 UC 浏览器，该浏览器不支持安装App。请在浏览器中打开，即可下载',
        reminderWeiboDownloadContent = '请点击微博右上角按钮，然后在弹出的菜单中，点击在浏览器中打开，即可下载',
        reminderQQDownloadContent = '请点击QQ右上角按钮，然后在弹出的菜单中，点击在浏览器中打开，即可下载',
        downloadOnlyForCertification = 1,
        userIsCertification = true,
        isIOS = false,
        unableDownload = '应用提供者未进行实名认证，无法下载',
        reportFileDeleteBtn = '删除',
        downloadPayMoney = '',
        deleteFileConfirm = '确定要删除文件',
        appTemplate = 'colorful',
        loginFirst = '请先登录',
        appReportIsreason = '请输入举报原因',
        appReportMinreason = '举报原因不能少于10个字符',
        appReportMaxreason = '举报原因不能超过500个字符',
        appReportIsemail = '请输入正确的邮箱地址',
        appReportIsEmailOrMobile = '请输入正确的手机号/邮箱地址',
        shortcutUrl = 'U4aj',
        mustDisplayAdSense = 0,
        showAppAd = 1,
        aKeyForAdSense = '34d0c0c8dfa8f1dbe8f6af1906782876',
        appReportResult = '感谢您的举报，我们会尽快核实您的举报内容并处理。\n\n作为第三方内测分发平台，我们一直致力于打击违规应用，保护知识产权。非常感谢您的举报，我们会在第一时间安排专人处理您举报的问题，并在处理之后向您反馈处理结果。\n\n感谢您对我们的支持，如果有更多问题欢迎拨打我们的热线电话：4008660210',
        appFeedbackResult = '反馈成功',
        isAutoToAppStore = false,
        iphoneXTips = '正在安装，请从屏幕底部边缘上滑返回桌面查看',
        testFlightTips = '请在 TestFlight 中查看',
        isTestFlight = '',
        isSignatureInhouse = true,
        trustProvisionText = '信任开发者',
        isInstallStart = true,
        installIsNotStart = '安装未开始',
        isInstallEnd = false,
        installIsEnd = '安装已结束',
        isInstallValided = true,
        appFeedbackRequired = '请填写反馈信息',
        appFeedbackEmailRequired = '请填写您的邮箱或手机号',
        appFeedbackMaxLength = '反馈信息不能超过2000个字符',
        isChrome = false,
        channelId = 0;
    isFinanceCates = false;
    reportAppType = '1';

    if (isTestFlight) {
        isQQRequest = false;
    }

    var isUserLogged = false;
    if ('') {
        isUserLogged = true;
    }

    $(document).ready(function() {
        App.init();

        if (isFinanceCates == true) {
            $('#appInstallConfirmModal').css('top', '10px');
        }

        if (true) {
            if (isNeedCheckUC()) {
                if (false) {
                    return false;
                } else if (checkIsUc()) {
                    isUCRequest = false;
                    needInstallInOutBrowser = false;
                    remindOpenBrowserText = '';
                    reminderUCDownloadContent = '您当前使用的是 UC 浏览器，该浏览器不支持安装App。请在浏览器中打开，即可下载';

                    var html = '<div class="row view-alert"  style="display:none;z-index:99;width:100%;background:#343434;margin-left:0;margin-right:0;padding-top:30px;padding-bottom:30px;box-shadow:inset 0px -10px 16px rgba(22, 22, 23, 0.62);"><div class="col-md-12 text-left" style="padding-right:30px;padding-left:30px;"><p style="color:#7f7e7e;margin:0px;"></p></div></div>';

                    $(html).insertAfter("#wechatShareImg");

                    setTimeout(function () {
                        $('.view-alert').slideDown(1000);
                    }, 200);
                }
            }
        }

        $('#reportClick, #feedbackClick').click(function () {
            var modal = $(this).attr('data-modal');
            ajaxLoadModal(modal);
        });

        $('#inhouseClick').click(function () {
            $("#inhouseTip").modal('show');
        });

        $('#form').submit(function() {
            if ($('#password').val() == '') {
                alert(appInstallPasswordAlert);
                return false;
            }

            saveData();
            return false;
        });

        initView();

        $('.history_show_more').click(function() {
            loadOtherApps();
        });

        if (needInstallInOutBrowser) {
            setTimeout(function () {
                $('.view-alert').slideDown(1000);
            }, 500);
        }

        $("#lastest-li .close-tips").on('click', function() {
            $("#lastest-li").removeClass('hide').addClass('hide');
            // 使fashion模板背景变小
            $("div.view-fashion-mobile-body .app-info-mobile.mobile-app-content").css('background-size', 'auto 330px');
            $(".view-fashion-app-info + .row.detail").css('margin-top', '20px');
            $("div.view-fashion-body").css('background-size', 'auto 170px');
        });

        $('#loginTelModal').on('shown.bs.modal',
            function() {
                console.log('bind');
                $("#getCode").unbind('click', bindFun).bind('click', bindFun);
            });
    });

    // wechat
    wx.config({
        debug: false,
        appId: 'wx5c466490aaef0cc3',
        timestamp: 1578640634,
        nonceStr: '2c5368efcd484d7e675faa50eccb4cd6',
        signature: 'badde2b69d03eb34c26dac9c0b76e2519e32d488',
        jsApiList: ['onMenuShareTimeline', 'onMenuShareAppMessage', 'onMenuShareQQ']
    });

    wx.ready(function(){
        wx.onMenuShareAppMessage({
            title: "政务新媒体",
            desc: decodeURIComponent('%E7%89%88%E6%9C%AC%3A+1.0.8+%28build+9%29+%E5%A4%A7%E5%B0%8F%3A+36.7+MB'.replace(/\+/g, '%20')),
            link: 'https://www.pgyer.com/U4aj?sig=wF%2Bc6xrYboWAhyWphK3CKaWOG1nWnPOjUOr4k%2BytWldoocjigflqfWRpq5XyUhNM',
            imgUrl: 'https://appicon.pgyer.com/image/view/app_icons/690dd516529ffe073b5e6a2c3e27adb0/f300'
        });
        wx.onMenuShareTimeline({
            title: '政务新媒体',
            link: 'https://www.pgyer.com/U4aj?sig=wF%2Bc6xrYboWAhyWphK3CKaWOG1nWnPOjUOr4k%2BytWldoocjigflqfWRpq5XyUhNM',
            imgUrl: 'https://appicon.pgyer.com/image/view/app_icons/690dd516529ffe073b5e6a2c3e27adb0/f300'
        });
        wx.onMenuShareQQ({
            title: '政务新媒体',
            desc: decodeURIComponent('%E7%89%88%E6%9C%AC%3A+1.0.8+%28build+9%29+%E5%A4%A7%E5%B0%8F%3A+36.7+MB'.replace(/\+/g, '%20')),
            link: 'https://www.pgyer.com/U4aj?sig=wF%2Bc6xrYboWAhyWphK3CKaWOG1nWnPOjUOr4k%2BytWldoocjigflqfWRpq5XyUhNM',
            imgUrl: 'https://appicon.pgyer.com/image/view/app_icons/690dd516529ffe073b5e6a2c3e27adb0/f300'
        });
    });
</script>
<script src="https://static.pgyer.com/static-20200109/assets/js/adAdsense.js"></script>
<script type="text/javascript"> (function (w) { w.frontjsConfig = {token: 'c68f352d79ca00ed4b38afe12d899f6a', behaviour: 15, origin: ['pgyer.com', 'google-analytics.com', 'bdstatic.com', 'google.com', 'googlesyndication.com', 'baidu.com', 'meiqia.com', 'qiniup.com', 'googletagmanager.com'], exclude: ['meiqia.com', 'baidu.com']} })(window); </script>

<script type="text/javascript" src="https://static.frontjs.com/dist/current/tracker.min.js" crossorigin="true"></script>

<script>
    // 处理页面数据太少，页面底部留白的问题, 手机显示不处理
    $(function() {
        var copyrightHeight = document.querySelector('.copyright').offsetHeight;
        var offsetTop = $(window).height() - $(".copyright").offset().top
        if(offsetTop - copyrightHeight > 0) {
            if (!isMobileRequest) {
                $(".copyright").css({'position': 'fixed', 'bottom': '0px', 'width': '100%'});
            }
        }

    });
    $('.copyright').show();

    $(function(){
        $('#descriptionLoad').click(function(){
            $('#description').height('100%');
            $(this).hide();
            return false;
        })
    })

    function checkIsUc() {
        var browser = navigator.userAgent;

        // 是否为safari
        if (/Safari/.test(browser) && !isChrome) {

            var ua = browser.toLowerCase();
            var m = ua.match(/cpu iphone os (.*?) like mac os/);
            var ver;

            if (!m) {
                return false;
            } else {
                ver = m[1].replace(/_/g,".");
            }

            var osVer = ver.split('.')[0] + '.' + ver.split('.')[1]

            // 是否有apple
            if (typeof window.ApplePaySession === 'function') {
                return false;
            } else if ( osVer && osVer <= 11.2){
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
</script>
<script>
    gtag('event', 'app_page_load', {'is_app_page': 1});
</script>
<script>
    var telErrorTips = '请正确填写您的手机号码';
    var codeRegain = '重新获取';
    var second = '秒';
    var telHolder = '请输入手机号码';
    var emailHolder = '请输入邮箱地址';
    var pwdHolder = '请输入密码';
    var telIncorrectTips = '输入的手机号码与绑定手机号不相符';
    var emailErrorTips = '请正确填写您的邮箱';
    var CNCALLINGCODE = '86';
    var mobileRegCN = /^1[3-9][0-9]{9}$/;
    var mobileRegEN = /[\d\-\s]+/;
    const TENCENT_CAPTCHA_ERROR_CODE = [100];
</script>
<script>
    const TENCENT_CAPTCHA_APP_ID = '2097264343';
    const CONTROLLER = 'user';
</script>
<script type="text/javascript" src="https://static.pgyer.com/static-20200109/assets/js/tencentVerify.js"></script>
<script type="text/javascript" src="https://static.pgyer.com/static-20200109/assets/js/getCode.js"></script>
<script type="text/javascript" src="https://static.pgyer.com/static-20200109/assets/plugins/intl-tel-input/js/intlTelInput.js"></script>
<script src="https://ssl.captcha.qq.com/TCaptcha.js"></script>
<script type="text/javascript">
    if(isiPad()){
        $.ajax({
            url:'/app/isiPad',
            method:'post',
            success:function(){
                location.reload();
            }
        });
    }
    var androidAKey = 'a157d227e6eb0155807fba7961d6a654';
    var isdownloadPay = '';
    isFinanceCates = false || false;
</script>
<script type="text/javascript" src="https://static.pgyer.com/static-20200109/assets/js/appMerge.js"></script>
</body>
</html>
