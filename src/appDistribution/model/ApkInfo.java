package appDistribution.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApkInfo {


    /**
     * versionCode : 20191206
     * versionName : 0.9.2_合肥办公-20191206181403
     * compileSdkVersion : 28
     * compileSdkVersionCodename : 9
     * package : cn.lonsun.goa.dev_bangong
     * platformBuildVersionCode : 28
     * platformBuildVersionName : 9
     * usesPermissions : [{"name":"android.permission.ACCESS_NETWORK_STATE"},{"name":"android.permission.ACCESS_WIFI_STATE"},{"name":"android.permission.READ_PHONE_STATE"},{"name":"android.permission.INTERNET"},{"name":"android.permission.CALL_PHONE"},{"name":"android.permission.SEND_SMS"},{"name":"android.permission.USE_BIOMETRIC"},{"name":"android.permission.USE_FINGERPRINT"},{"name":"android.permission.WRITE_EXTERNAL_STORAGE"},{"name":"android.permission.READ_EXTERNAL_STORAGE"},{"name":"android.permission.CAMERA"},{"name":"android.permission.RECORD_AUDIO"},{"name":"android.permission.ACCESS_COARSE_LOCATION"},{"name":"android.permission.REQUEST_INSTALL_PACKAGES"}]
     * permissions : []
     * permissionTrees : []
     * permissionGroups : []
     * instrumentation : null
     * usesSdk : {"minSdkVersion":19,"targetSdkVersion":28}
     * usesConfiguration : null
     * usesFeatures : [{"name":"android.hardware.camera","required":false},{"name":"android.hardware.camera.front","required":false},{"name":"android.hardware.camera.autofocus","required":false},{"name":"android.hardware.camera.flash","required":false},{"name":"android.hardware.screen.landscape","required":false},{"name":"android.hardware.wifi","required":false}]
     * supportsScreens : null
     * compatibleScreens : []
     * supportsGlTextures : []
     * application : {"label":["合肥办公"],"icon":["res/mipmap-ldpi-v4/ic_launcher.png","res/mipmap-mdpi-v4/ic_launcher.png","res/mipmap-hdpi-v4/ic_launcher.png","res/mipmap-xhdpi-v4/ic_launcher.png","res/mipmap-xxhdpi-v4/ic_launcher.png","res/mipmap-xxxhdpi-v4/ic_launcher.png"],"name":"cn.lonsun.goa.MyApplication","allowBackup":false,"hardwareAccelerated":true,"largeHeap":true,"supportsRtl":true,"usesCleartextTraffic":true,"networkSecurityConfig":["res/xml/network_security_config.xml"],"roundIcon":["res/mipmap-ldpi-v4/ic_launcher_round.png","res/mipmap-mdpi-v4/ic_launcher_round.png","res/mipmap-hdpi-v4/ic_launcher_round.png","res/mipmap-xhdpi-v4/ic_launcher_round.png","res/mipmap-xxhdpi-v4/ic_launcher_round.png","res/mipmap-xxxhdpi-v4/ic_launcher_round.png"],"appComponentFactory":"androidx.core.app.CoreComponentFactory","activities":[{"name":"cn.lonsun.goa.SplashActivity","configChanges":1184,"windowSoftInputMode":18,"intentFilters":[{"actions":[{"name":"android.intent.action.MAIN"}],"categories":[{"name":"android.intent.category.LAUNCHER"}],"data":[]}],"metaData":[]},{"name":"cn.lonsun.goa.MainActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.guide.activity.GuideActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactListActivity","screenOrientation":1,"configChanges":1184,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactCenterWithIndicatorActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactCenterWithTabbarActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.message.activity.MessageListActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactInfoActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactSearchActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocCenterActivity","launchMode":2,"screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocBHEditActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocLogActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocBackActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.SignSuccessActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocRegisterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocNextStepActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.CollApprovalDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.OneEditActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.base.activity.FilePreviewActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.preson.activity.SelectPersonActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.preson.activity.PersonEditActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.theme.ThemeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.HomeSearchActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.message.activity.MessageCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.userinfo.activity.UserInfoActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.AccountSafeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.ChangePassWordActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.IdVerifyActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.FingerPrintActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.about.activity.AboutActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.partment.activity.SwitchPartmentctivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.preson.activity.PersonSearchActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailHomeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.SendEmailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailFeedBackActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.ReadConditionActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.ReadConditionMoreActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailSelectPersonActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.file.ui.FileSelectorActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeReplyActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeConditionActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeConditionMoreActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.SendNoticeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeSelectHomeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeCustomSelectorActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeNotAttendActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.login.activity.LoginHomeActivity","launchMode":2,"screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.login.activity.FingerLoginActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.dzxx.activity.DZXXActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.zwjb.activity.ZWJBActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.ApprovalCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.RecordActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.RecordListActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.RecordDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.WriteRecordActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalTypeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalFormActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalFormTypeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalMoneyFormActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.ApprovalNextStepActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.ApprovalLogActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.HomeSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.DocSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.NoticeSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.EmailSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.ApprovalSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.DZXXSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.ZWJBSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.signature.activity.SignatrueActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"com.journeyapps.barcodescanner.CaptureActivity","clearTaskOnLaunch":true,"stateNotNeeded":true,"screenOrientation":10,"windowSoftInputMode":3,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingSegmentActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingDetailActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.base.activity.FileQuickPreviewActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.base.activity.BrowserActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.PersonsNameActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingFilesActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingThingsActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingLogActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingForwardActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingPresentActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingFeedBackActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingLeaveActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.UnitMeetingFeedBackActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.UnitFeedUserActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingConditionActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingAuditActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingApproveActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"com.blankj.utilcode.util.PermissionUtils$PermissionActivity","multiprocess":true,"configChanges":1184,"windowSoftInputMode":3,"intentFilters":[],"metaData":[]},{"name":"com.zhihu.matisse.ui.MatisseActivity","intentFilters":[],"metaData":[]},{"name":"com.zhihu.matisse.internal.ui.AlbumPreviewActivity","intentFilters":[],"metaData":[]},{"name":"com.zhihu.matisse.internal.ui.SelectedPreviewActivity","intentFilters":[],"metaData":[]}],"activityAliases":[],"launcherActivities":[{"name":"cn.lonsun.goa.SplashActivity","configChanges":1184,"windowSoftInputMode":18,"intentFilters":[{"actions":[{"name":"android.intent.action.MAIN"}],"categories":[{"name":"android.intent.category.LAUNCHER"}],"data":[]}],"metaData":[]}],"services":[{"name":"com.sangfor.ssl.l3vpn.service.EasyappSvpnService","permission":"android.permission.BIND_VPN_SERVICE","intentFilters":[{"actions":[{"name":"com.sangfor.ssl.l3vpn.service.EasyappSvpnService"}],"categories":[],"data":[]}],"metaData":[]},{"name":"com.sangfor.ssl.service.timeqry.TimeQryService","exported":false,"intentFilters":[{"actions":[{"name":"com.sangfor.ssl.vpn.sdk.action.ACTION_TIMEQRY"}],"categories":[],"data":[]}],"metaData":[]}],"receivers":[],"providers":[{"name":"androidx.core.content.FileProvider","exported":false,"authorities":"cn.lonsun.goa.dev_bangong.FileProvider","grantUriPermissions":[],"metaData":[{"name":"android.support.FILE_PROVIDER_PATHS","resource":["res/xml/file_path.xml"]}],"pathPermissions":[]},{"name":"com.blankj.utilcode.util.Utils$FileProvider4UtilCode","exported":false,"multiprocess":true,"authorities":"cn.lonsun.goa.dev_bangong.utilcode.provider","grantUriPermissions":[],"metaData":[{"name":"android.support.FILE_PROVIDER_PATHS","resource":["res/xml/util_code_provider_paths.xml"]}],"pathPermissions":[]},{"name":"com.pgyersdk.PgyerProvider","exported":false,"authorities":"cn.lonsun.goa.dev_bangong.com.pgyer.provider","grantUriPermissions":[],"metaData":[],"pathPermissions":[]}],"usesLibraries":[{"name":"org.apache.http.legacy","required":false}],"metaData":[{"name":"PGYER_APPID","value":"af5d19d855b89c5ef70bbd649cbe447f"}]}
     * icon : data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMAAAADACAYAAABS3GwHAAAgAElEQVR42u29eXxcZb34//6ccyaTpE3SJWmb7nvZpAUpewtYZEeURVAQuIiKyxVB9HuX7+9ev9d7Xa67eAERBVnEq2yCbGqltAjSUqBl7d6mW7qladKmSWbOeX5/nOesM0km6UybtucD5zVpMnPmOc/z2VehH0Fq1lwTqAbG6msUMAKoA4YAg/TfBwCVQAWQBlL6MgFDvxJ6TWDfwA69Ovo1o68OYC/QBuwBWoBmoAnYBjQCG4AGfbVmFsyx+8uDyQFEdtFIfiIwE5gBHKERPpXg3CEJGWAz8D7wJrAIeBXYkFkwRx3yBJCaNTcFnAVcDJwDTEq49GEPWWAl8CfgKWBeZsGc7CFDAJrTzwBuAD4BDE3OPIFuYBvwMPArYGmpJYOUEPEN4Hzg68DpWjdPIIFCwQHmA98DnsssmOMcNASQmjX3Q8C3tH4vyVkmsA+ggL8D/5JZMGdevyaA1Ky5Y4AfApcn55ZACeB/gdsyC+Zs6FcEoPX864Hv47orE0igVLAD+CpwfzHsAykC8lcDdwFXJepOAvtRLfoN8IXMgjktB4wAUrPmTgMeA45KziSBAwDvAh/LLJizvK83MPYB+WcBLyXIn8ABhKOAv6VmzZ29XwkgNWvuxcCzQG1yBgkcYKgFntE4WXoCSM2aeznwCG4+TgIJ9AcYADyicbN0NkBq1tyPAL8HypI9T6AfQidweWbBnKeKTgBaz3om4fwJ9HPYA5yfWTBnQdEIQHt7Xkp0/gQOEtgBnJZZMGfZPhNAatbcKuAV4OhkXxM4iOA94OSe4gRGD8gvwJ0J8idwEMKRwM81DveNAIBrgU8me5nAQQpXAv/QJxUoNXvuaBRvkuTvJ3Bww06EGZn5cxry/dHq5oM/QBLkT+Cgh8G4SZofL1gCpGbPPRN4Idm7BA4h+FBm/pwXeiSA1Oy5Bq7L85RkzxI4hOBV4NTM/GhlWY4KJCLnAicn+5XAIQYnAhcAfwz/MuIFKjvjrwJ8jSSvP4FDDwT4msbx/AQAHAuckexVAoconA4c1x0BfJqke0MChy4YuO15co3gsjP/agGbcNsQJpDAoQo7gPrOeR/KxCXAGQnyJ3AYwFDc7oQ5KtBHkr1J4DCBiyMqUNlZLwhugfERyd4kcBjAcuCIzhfOUp4EGA1MTvYlgcMEJuF2JvdVoJPoPi8ogQQOJTBxA2Mu0oswM9mTBA4zmAn83pMAM5L9SOAwgxkAkp4zz0Sx2tOJEkjgMIH1wAQLqEKoT/YjgcMM6oFqAxhDMpMrgcMPLGCsAYxL9iKBwxTGWgijkn1I4DCFUYbWhRJI4HCEERYi+ykBTrljDbyf+x1IKDdWun4G/0X1jzX7L1L4OdDTc+7LuUkv13NAoc6Sko408hBGhf6tYgik+gECifuzyodQ+Z7BQwzVDXKVcL3+mgmtW0V/1+UZxNab9zPdnV0Xz+jtIcpdj/SGyA4YDLGAQaVDfm/DvJ+d6L9zOMz+xn/v0AQwQAyNUOFzCxNsaP3K6QLpVemRHzSS6bX76zby4Ft4/Sr3npFnzUf0TjdnR5QIpau19FsiGGQhVJVG3VEhpHFA2YDD2OHlfGBiFbU1ZZSnD3TxmWhmb7B+awdP/307iBlwMkKI7z+HQ0VaOHLcAEbXlVNVaSEi+1GSCbat2Lk7w7KGPazZ3B4iXkVuQZ+KEK+ZyjJi+lY2Lh6pP+cRf/xjCsR9XlE2V84ZgWXmk4SBBLEdeGTeFjKOdz+jv2tC1RYwsDSaj/IRP20pPvuRsXz+o+OZMLKyX+7EX17bztMvbwFDgsPzEEE5CDYXnlLLFy8dz2kfGELK6h+Vo6s27uF7D6/i/uc2BSTocWH/DNxzqBzaxszPLWHw+BZqp+7grf89GsexAnqXPOfnZDl75hDu/efpBa0nk32DR+ZtAcNyiUuF1bV+BwMtRIqLkUqBeBLAZkC54olvzeT0Y/v79FSFwkYwNOdSIRXA5rufn8Y/Xjah36160qgB3HXbsUyor+Dff7USESt6FspBqSzDjtzOCTe+Q7qqE4DxszfQ+NYwtrw9wn3WiBNAhaR2lluvnFjwem69aiKPzd+E46tEZsxm6VdQaQDlpdH9HZSy+aerJx0EyI9WEewQx1T+704+qoovXjqhX6/+1isnMaG+DOVkwMm6l8oCnUw9dzWnfPlNH/mVgiUPTWXLW0NzVTcVPb+Z06qZPb3wDpnHTanhwx8cglJZbSd1ZTf0Cyg3gHTRvT643B+V5ZMfHs1BAQr30GM6s8LmtA8MxujnXr2UZTDrA4NAZVD6stJ7OfGzSzn6slUYpns2ji28fu9U1rw4Mpczhw185Z7frVdNwujlw3/96qku8XkMpX8iP0DaEin2vC8FjoPCNZ5G1pZzsFCAaI+HiIpIhfKyg6NP2IByEKcTxKBq5F5m3vQe1SPbAhmXMVj8y8lsfG04YrgeGxGJqSea+2NzxNgKLjy193HSUz8wlNM/MJi/vdPqqpSegd7/4gMpA8QKXIHFuML6p+LggrBPXDTfOoiew7HByTDyuK3M/qclEeS3MwYL75zCxteG6SO3ENH2TvjsVGA4f/nyyX029r/2yanueiJ4IP3tSllICUohJew+PFhwX0JXGPEVjnNwPIeYWY66rIGpF26J8KJsu8mrP5vCtveHgmGCYSLivgYeoyj3rx9icfW5fc+TPHvmcI6fWsXrq9oQzP4qBUyLknSC69eGTzcYFOaGvXuGf/7Zyyxb1xLyq8u+76Hy1DCHi04fxw2XHNXlu1vs3ZjnLGJqakvULdlm8vefTmXHysGua9JIIZLSbspc5Pf0/y9eOo10qu+oYRrCrVdN4Zpvvg5i68CY9DcVyLC036+4NjC5GlGXB7enk3dWN8VUkP2n7og+lHfXtoJhIIYRcKleLOeVt7bx93d3aNXCLMJhB54YnCwTR9V0+c41HRv4UeO9bEs1RX7fudvilR9NZee6QWCkXOQ3Uq4KZBgx3qd8o3/wQIMbLhq/zzv8kdNHMm3s+yzb2NlfpYAXrSgWTqlQ4KOw2761cgdzvvCk1kvjIrmUGo8O24upEaLMRRJfL3Y0EQi2owrjJUZa38MMIsp9fRSlQNmIyoJkAn96BGUVL7Yu5N5tj9KpMpG/tTenePlH02jZWO0/mxgprfaYRKK0np6uuf8NF45ncFX3vpG29iwdnVkGV5d365m65eOTuekHb+mosupv6RFiuaRZLAkgoehfoc8oYKYDziSe12A/SAARwPSRQgwrQNzwYUmBvMRMucjmP4fkMa57vqXyPFCODUqvx4geU0ZleWD7E/yl5WXtug0h544yXv7RVHZvqQYzjPyh55OQ0Sv43L8yDZ//2KQeH/eZl1azfN1O/uXTJ3X7vk+cPZb/vH8ZG5rskBSQ/qIJmZYUGac81VUKZ8WIkUJ8Drz/pEBYXxfve8XQxq/06qAEQ98jblx6+UYh70MPQle08a3IajPEjnymKdvMT7fcz7L2NTmf3bOtjJe/P422poHBnhqpKHGHMzfBV7VE2Vz1oVGMqq3o8Xl//cf3WbpyB1/91Amky7rmoWUpg5svn8TX73ofxEaUGXKSHHgqsIq6BhXsr+oF1UiEe2oPxf6yAySElD7SOhE2XZAX1Fep3PsZlqLuiG1seWcY0aQzyaMiSq4RpRwEhXJs11+v3/Pu3pXcvuV+mu3WnCW0birn5R9OoX3XQDDTAfL76mXsu5WntrrJfqbY3PLxKT0+6tpNrcx7YwtZW/G/f17JtRdO6/b9118wnu//70q27rIBmyD79sATgFFU/3/8TAt6QPH90q4e7R4aZsoV32aZ/jnlH6jrzQhfZh8uK+DUhhH1AEUQVFCFUEDkWR2OuuR9Tr5pMTM+8RZmWQdKI1nUQ2AEUse3R4y8ksJB8eyuF/n25rvyIv+uhgr+9v1ptLdUuchvliFGWUjvjz1jyPD1dP+LTxvB5NE950Y+9PxKssq1m/7n0fd6tJEGVlh8/pIJWtKEI8MHPj5gFO9eYU7aCw+I4CKg75v2EDNkFPuqhRH11+e4nvrqsgpz8ZAHSKQP1VYOI2c0MvHMBhAYd9oGZn31VQYOa9b5MaH0gMh35TFxNdFY6QzLxszl/u1PkFV2zrfuXFPJ334wjY7dAzTyp7X6E97DeJwjbEq72a63XNFze1hHKR54fo3PnN5as5t5r2/u8XOfuXgCNQMklh8U2uMDdBnF1igKsvK6UkUkVKElElMriKVZZ1FFuFyEtH1/e9/jF+7nrHSGY69ahhjBPapHtXLG/3mVMTMbUKozRghOKFrqXbZ+T4YBda3M+j9LqDomP5JtXzaQl384jUx7ZYjzpwJJl8Mw4nEa9/nPmD6EE47oOWlx3uJG1m3tcKWLNrBvf2RZj58bUl3GjReOA7Kua7dfVASWyAbolfckh3Bi6lQEMRxqqw0+e+EYokU3fdlIiRDf8g17eWTBttyqql658xXZDpO3fjeR469fjmEFEWQrbXP8te9SO2UnSx85EjuT1skWYa+X9v07NqgMI45p5Lhr36NsQDbvt219p4qFd07GzlS49pMZ8vSEYxFxVTRU4aZ0rcMtH59ckMb66+dWBx4lXfk1d/FW3l3bzFHjuy8u/NKlk7jjD2vZm7Vd75vHfw+gLWAVXQJECoWkzziZe083L7+2OsW/Xj2x6Bvx1CtbeWR+Y7QYpjfPELJ5Ni6uQzmKD356uZ+F6b1n7KmbGTSuldfuPYbWLYO0F9orI9TeGLJMu2AlU89bG5EkYWhcUsOin0/CsQNjNwjCGQWookG69/RJA5lz/LAeH3H7rg6efqXRjygjAo6B7SjufHwFt9/SfY/l4UPK+dQ5o7n7mY2u9BNHE8KB8wgZQpH/0xvv/lywHwgRib5G/tOpaVr1KYlDWJRWhRSiFIIq3I73nkIMfZlsfr2Oxb+YgpPN1TKrR+1m9tcWMe7EdeB0gpPRr52kK9o46XOvM+2CNV0i/8aFg1l0l4v8ol2cR0+o5pLThrv7J92dEPrZlF/ueMsVkwtKef79C+vY24n/nSIp/XOK3/ylge27Onq8x82XT6bc0kE+b48P4H9G0Q2LvtgA+eJF/v3i+mqpEtNUYAuIE3megiLBEqqA0sb8pjfreO0Xk3AyuURgpW1mfOo9Zlz9FlZqD9jt1IxsYtZtCxl+zI4uv6bhb0N5/VcTcZwyRHt3pk+u4Zlvn8jIoelgr0QFhnbe/XS5/4QRaT42q+feaI5SPPj82pDXLep9a8/AL59a2eN9JtQP4NLZ9drO8Txjer0HxAguNvL31Qbojggi2ZklJADfEO6jDeC5VA0TzBRipti8pI5Fv5iEk81/k7GnNDLrtsVMmrOW0776BgOG7e3y9mvm1fLmA+NxVMo3cE88cjB//NZJ1A0q8z06ARHkQ37tVNUFL/946UQss+cHXLJyJ2+uagmySUOX546+5+lV7O2we7zXLZdPxhJHxwRCbtED4wUq4t2kO+u2N5Igl7IU8UMsFRGE/EAiBVNAJLfIj1ekETNN49I6Fv18MnYmv9OtamQbR1+2FivdNfKsfH44Sx8ej8JFfkGYPb2OP3zrVIZUl/nBM3LiDfFzCKq+hg9Occ05hXXFv/+5Nb5kIxw1lyCusmlHhkfnNfR4r6MnVHP+SXWg7FhcYP9TQZElgHThdisA6+Mei1iMQUT6RlS9JQDpTRAvjyvX54xBME+sNI1v1/Ha3ZOwO3vveV72VD3vPD4WJKUj5cLZJwzn0f84hepKKxKAC8o647GNWHxB2XzuonEMKO/ZD9LeafO7F9b7yC+GGUH+IH5jcccfVhSkMt525RTEUzkPoBQoXRygL27Q7nDc57ClSZQzjB5Us4K9QHqdhhlJ8RDTJYJFd0/OaxN0RY/vPjaK958erSPlLvJfdGo9v/33U6iMI2+4kZWoHMQPipRsqiuFT19YWKH/ky9toHmPozl9OHJNjt2zZFULC5Zs7fGeJ0wbzBnTh8Tqhvd/DYklpYoD9CIfKJJ+n0MEYXI12NGa5Ye/X+FmSoY7tUXwINq+sDJt8vnLjinMDJFcl65IL58jZBB7GeKegNj6bi0L74KZn1uJWda1PaMc4e3fjWbNvHqdyOYSzcfPHMPdt53QRamio+uaQ88i0fwipVOsrztnDLU1hZWD//r5NVrXN30J5CO/cn2JYLqZq8riZ48t58zjhvd4369dOZn5SxeiMLU7uHcJiEWKAxTx28KnXSjmhNUNialDkZN0y5e3t2b4t/tWgJPRhlwXniG/s4FNbbXVIwFENj4eke6NCiTxxDpBDO3w0+7Jre/VsejnMPOzKzHTTl7kX/LgOBpeGRF4W4BrzxnL7V8+rgejNZ84jXa5KzMVXyog5Rlg9abdvPR2ExjpoI44LIkFwEREoQwLVIrnX9vK8vUtTB1T3e29Zx9by8xpNSxc0eYG5CJJkPuHCkpkA+TTPXtLBFEbADFcLmRabh6KVY5Y5YhVgaQqo5dVAd5lpt2QfUHrkNx19En9CxGCl+dk6uCRtgm2vl/Hwp9PybEJHFt4474JNPy93n2vmULE4MKT6/nZzcf17LHJ5070PD867eHyM+oZXVdR0GP95i9ryTqGJkQjlI9FlOA975dh4mByxxMrClA7hVuumBS4n3ECiXVI2AB9/bzkM5IN3cYjQCQ396UczAr9qi+POHRujBu278XaixrPCLxD4kVQtU2wbVkdC++aRrbD5Xx2xmDxPVPYsLgeMdOIGdTujh9RidmX5kSRXj9uyvPNlxbG/TNZh9/MbfCN3qCLRL6H9eohLMSwePiv6wsKjF1w0giOGVepc7u6a8B7UEiALoJivUWe+OX16wxxUzFSiFmGWN6V1lc0hdpPDOtpI7qMP1BYYyiJeV3CHNIISwLPO+Sud9uKYSy6+0g6WspY9Isj2fz2CMTyCLcsMDx7I0njGZYo7RmyOXdmHUePry7odi++uZV129pjqeMSnEf4fIzA+Me02N2huPfZVT1+h2kIX7nckwJeIPKgjQP0lQqkZyrwS+mMwB/tc9ToJeESQL8GthfqT5fP1ZtoXp7W6+KVXnoSrBwxy9m+cgR//c9T2basHvGlWTpUwmj0Yg1GF5zJTTv4SoHcH+D+P60NdZAI1TnnfEdwNmJ4UiDFPU+vob2z58DY5bNHMX5YOmhJqcK2ZInjABK33Yp8FeY50bkp4iDiejKil87Nybm/FHz1xgTIufbls+G1GoIYLpIYhuXq91py2fYAX4KJWaalnBdTKDQYZ+j76+8SQUTpC049ajCnHF1Yn9YdLZ08vXCrvw4jct88z+f/zfDXvbGpk8cXrO/ZE2MKX7lsotsAANvFgdC6S3lZJVWwCsI7FeTkKxvluIe2TymySkU9RH3t7NbLVOjcyyHvtBZdHumOFTBQGEE5KeF+/Vp1EYNVm9t4bMEG39fvuXolVGq5qrEtVigUvY4cN5DHX9oUaQAcL6j37vfSO0102gaYZqwmQ3WxJyrGCVyJ8T9PrOCqOeN73MZPfmgM//27VWxutlHK1PZG6bNELYodCBDpvQ2g3AIQcQQMpRFiH3vqOLZfNFMo98/xXqleErL2ZLgpzfnUQJXrMvYROPfLlAQdBv60eBvPL9rkZo6GXb+h9AtftRKXdERXj3npBr98roFfPpNB2Rk3q9YJB6FCiGuE7idGrNOfRF3d+RiAH703eHNVMy8t3cqsY7tPt64sN/n8xeP4twdWRRvqSr6hH0WNAxSZ5edzaXYDo2oruOWyKUGnsmJ1hFDBRJcB6UIIIE9GnuZmRiFMItRZASWasxo9eGdyCUPF63W9YJ/nTTIslzmoMMcNcWm/r394tp0TlYRiuIErw+t/FD4/7bGKDdlQ3n262wvf42Rrt6v7fbc/+m6PBABww3nj+PHja2lqC0uBkkuAIt+xV1wTxo0YyDc/PZ1+A7Ga8UJDAlUVBoMGiKZfLxXB2YcNDDWVVW7llVKWW7GGFSUAzwCVkI8+rn4pYvcw80TRJSSR4vdThSUjeutyBOUY4FgsfG8raxtbGT+i+2lcNQNS3Hj+GP77kXVE84NKpwqVoCRSdIRc+vFknAJtFt8JVECxyDdm4xxszbD3C7ibkjILU2M+f9EEfvbkWtqy4X6ipWuhYklRUyHQ4t/1QCjEl979/piUNkAjBp9LAYUEoPrLzLCDHWpryviHc8Zwx9MbQ/y5dJnAJQyEueJ0a3P7QbHxW5s7QgGeaDApYyesfX/CFz8ygfJUqEKvqwKffpkKEUsIe3NV80Gx6e46hUinAn2tbtyTYOV+hDF1FVwxa4T2DtohQ734jMgoRXTByxgUw+DJVxr7/Ybv3pvl9ws2+WkHYphB1qNh8tI7TQWV+iVQPLj5YxNJmSoP9y8urpZAcQ1nB1r8fsEmlq1v7bcbbTuK2+5eyvZWJ9RCUCIFONtbbO55dk2ClfsRpo4ayMUnDaPUSXFFToXwwuRuZqAYJu1Zg6u+9SrvN7T0u01+f30LV37zFX4zbxOGn3pgBO1NPGlgWnzjwWXc9/waHJXYA/sLbr10YiRVpgQCAKm55rXinmio2apysmB3opxOLDKcPaOW4ybXUJk2D9jgOduBhm1tLF6+kyVrWt2Ip9eE128jrgWjo3VQ2+3Zo+xOJgwr46zpdUwdNZCDbgRUv4eo5EVM7nh2M+t32DrJziy6S1Fqrllc5FNUoQnlth7anAkNcLb9BlSlMmzyW+fhTfZqW61Qjr6law1ic7Mc3afTyYKtnyNeiZZIhSIcUbieOtop3GVKVqjSrnhQ/Eiwlw6hDDfdxcsLMUw9vdzJ0wpj/260EGvp4c0k8JA/3IzX0HW9XlWaMv3UAqWc/UjEh4cEEMk9G/o4t60wAigp09UZj4ib4GaYuh3fgZogGc7x0Z4qnxjiswFCETwxESUoMXThtx6orVSC/CVWg0RKO1bJKk2Y1kMg5SKMaQTIEkIa5Y8C3U8SNtYROmcYRk5CnCYCHc4WZeQ8g5tSnEDxzklyCSHv+RSJAEqXpuAhmNaDvHRfFagMcuB2OVdly9+MKEQLEmsxovJaGAkUWZXu8Yz6qwrUFYKJ6icoI31/Bg6SBKdDhRBKCNb+P0g5BPTmBPkPlX219s/XqB7+nUACB0wClBjpVey1n8yGSqA/I7rkjsoqVUFMSTSgCNJ7QbFQeV8iDRLoCvnFmxnjeX+M3JaVxVWBSlUTCd4QNpRNylBMHJamzJK8DW0TSIgAAaWEjU0ZdrZl3PgLCjBLJglKpwJ5udzK5ppZdXzjyvEMrUol55xAj2A7ikde2cbX719NS4etUdQsiRQovhGsO3t5nP+SEwbxk09PwUgcJwkUCKYhXHnaMGoqTD7x4/dQhtfcrPgTJY3StNwK2mPcevHYBPkT6BOcd/xQjhlT4arSnvZT7IKY4pZYKn+il2gJcNSYAclJJtBnOGp0BaK8FpnFLwsu/phUCbs5FVt3dSanmECfYeuujqjDpPhjUktRExz8/PD8jckpJtAnWLd1Ly+/35zbpbj/1wTjdxb7/h/W8MdFjUnNSAK9gk1N7Vz3kzfodPrQcrw32Drkc0uLXBKpi0W8cki7E8Pp5NRp1cycXJPEARLolnkqhIbt7Tzz+nZaOgy/XFW8eRBFTomWoTe9VQICUEE5pB2UQyonq0sJVUIECUS1BgiKYPzp8yk9JioVmk1cXAIofhxAvGZ2ptuDVQTRTVJz+/UnBJBAWHX2LFOvRNXUtdqlQX6XAEpWEwyiTBfXvQnqXeYDJZBAiAhCo1glZyQrRSaAUuVCeMXwyusxr6eRJKpPAj2oQiLxuXA+QpWAAKRk2E+0phY/SJbgfwJd47/kqNOlrAmwSlsQFp8U01/KIRM4KIzi/QDWofpgCSRQoAqUIGUChzUBJJuQwOFMAAkcRBDvrbR/6mZ7tbYe1d1C37efCEBKUxSsX7px9+wHC3+f1xhZZ75bqB7MnWI9o8qts44gU7ydoxyA/ctX6y0FEEBoRvEBwAerNBujAi6V1++fbyZvMQ3snrhPHoSKtTj0fdGqCyIIt3gMd4nzEF9JbF5yXw9YxZoLxAKJ4n6XiJHb8W6/IH+46UGe/QuvSb8/ul+x/GTZv0RQGhtAQVAQ7+QSgYgegRkQQzAovRvkVT1IkpwOwtIFIulD8LpU56xRl/Z42YdhZI4Td6RDtOjKpSCI4ybcGjH8lwJVnDDSOODYnDZlAAPTRmROcGNLliXr23HLO7pKGZDiqko6qq9CA8nDa1LerGFv75RC4YDjhPbM67ptBk2Ke9yjfu0FCpBDKUXKUNx340Qg4K5vr9/Dd55ajz/7VSSKOCrMNcNIr6KIkYP03uHHpUroPoLOxHCCieqOw4mTBvDlc0ZGnuTNhj18/+mNsTm1QniCu1IOd1w3mZpKM/LZWx9azdZWt6uB0pQtkQ7U+YgzJll8JqJCa7W56/oJjBhUFvm+37y8lZsfXKu/zwzqMiLNgFVMKvUVycJn7BLlR4+v4btXjYu8K5NVXPDD5TQ0Zf1nuumsWm45d0TkfS1tNmd/9112tdt6a0pT/L5/VSClABsTm3M+UBP566hBFkvWNpPboRn/Z9tWzH13F6MGlzFmSDpEQHEiCB20COuasmxo1l0E8g1SUAqFzTWnDObMIwb6kmDU4DJmTqqOvHXGuAFMG1GuD0XoyCr+84kGvnn5hIgYP2/6EMpT0e/6sUxgT6fjc+N75m/n76v3uoeb0xvVexYnNFjEkywex7RRjo2oLEMH5nbW2LarHZXtCJLIdP6MCqtfXl5NeBr8Ppyv3+5Gstx2wUiGDIii0m9f2UbD9r3BVBfl8Ju/beWr545gUOi9QwZY3Di7lh88t9n9heFJz/0TNC1+JFiBEoXog4vDMWMGcv8Xju72FrvbbY782kKuOmk4X7tobMFf/V9PbuAnf97qTn4Ji3xPjcBBlMOxY/Uadj4AABshSURBVMq55Pgh3d5reE0ZHz2h1v93W4fNj59ZwyUfHNLjOj78geh7nn+rmVdxCAZASB7CdIlgQm2KY0enQ43EArUhbSlSVu6BjRyU4pLjBwUpw+TaHyIGr63by8ZmW6tKqg9SQOn/HUTZKCfDx04czLT6isi7srbiB0+vAxxNdO5nW/ZmuPMvG/nnS6LS4qaz6/nFvE20dGQDlXg/NSAurgrkGYyqK4u/F+B0RnTFwtTSkC4qxKSLlh7K4a2G3Tz1uvi6a/3gNCdMiiLt1l3tvLq8yUegjqxi9552nlq8JWJLnDNjOOlUVAWau3QLbZ2Oz4k3NO11vyun131Y33fv96EjB/LtK8b06rmvOKWeK06p7/F9N923iscW73Jz7cNqYqEeGBUaW6psUmLztQtz1/rwy5tZu60dscpyDOFf/HUDN55VT111oMYNqrT4wpx6vvP0JneeRNxePLiMYG+uq/vamY0isWUIRqxPiu0obCd46M6sW1HW2tbBpp3teY3EdMpgaFU69tXuXDLB1b0jtqCHaKJ44d0m3lu/0y/WmXXEkBwCWLt1D//zzHJ/TE/WgR2te7njudUBoTk2px1Zm0MAD85bw+ZdWbeYw0yxarsdGMKiovWtMaMyGApdAnCyKKcTQaEMFRifFG6gu+qZOzftypNrGV8X5f7tGYcfP7PG1bBECPqOuJKvtT3LHX9ax79fPiXyuRvPGskv5m2maa/tEoFhBHt1UBnBIYpvzzpMvWW+q5/anSg7w/f/4Xg+fvr4yKe+8fBS7p+3ThdAmCiE9g6H5j0dvLqiiXVb97BWX6+vamJvp83pRw7l8X+alef7nfwcJEQM182q5yvnjer2SU6cMpTn/v1M/99bmjs4/1uv8Oy/ntLjLtz75ZMj/77hF8v541utwXokJplC69uxO8PbG3bndSNXV1qMrc1tM7NicysdmYBw0imDKfVVuafjVejFfAyB56gbIgi5PFE25abDV87PVU8ffmkj63Z0IFZFdO6yVx9imNz74gZu+vBYhtcEDKym0uKmOfX811MbESyUUiHBVMps0GLeLSxJRRheU8b4weUoO42y3bLIwQPLcnXYIeUcM7Y6Uvb2zvpWxgwt52MnRr0z53/zRRauaMrxO3uHJMpBxOX0ERe0uL4mhYOjHLJ21HdvxqSSUkSkUlbbNOHPAVhm7g7ajoq46pUmShGVi18R7UPxxOLtPL5wk5ZOejqlk0U5NtfMHstPbjwhVwX675fY0NThG/5T6wfw8rfn5Lxv1CCL/3fZuIihfPf8HWxqsbX3pWfuL7jc/+rThjGutjzyrrZOm588uwYxLMR0Zy6j5y679OPOidvT2cnPnlvDN688IvL5T585il/M28y2PVl3PjNGyQeqWEVt26ZCXh0RzptRy/eunNDjxz5//jQ+f/60yO8u+vbL+W0Iieut4b/FdH+f06rI727/03ru+ctqsDtQ2U7OnT6MH3/mxMit5r/TyE13vupPK3QwaN6T5dhb/6zrnd05yAu+cx511VFEOP8bf2H9zk7ETIOVpjVjgaTydzdQnnrg+L8fObicuoGVPuJva97Lxh27GRr7HpcwFbvaHTBTodqL/B4eUxy+8OEo135xeQubdmVQYgQqo0het6dnlFemFP94bq7u/+CCDWzclUVSFYhpgR4+7sZ5RBdEOYjKct/8TXzx3PGMGBQ8U1W5yRfPHsU3ntjgqlmYoVBRidqjU2wJ4BGs7GvVSzejVKWAdYQv7RFXGsFuvWAcp02u8l2NgwbkSqUZE4fy0K2zIgbifz2+jH/92LSI0Zrvsz+8cSadWeW7G3/98jZ+u6g50P0lHshTkfV+/aJxXH3qcP8t33rsfX7w5DJqq9O5HrO9WTodwx1EKIZrnxj5CWBHy146sw5lVvD3EdUmqKx2ixpdIJrn9nW5/zWnDWPU4Oha9nba/PS5tS4hmt6cX6+00TtKEzFNlErRnsnyk2fX8O1PHBm5z/Wz67lj7ia2ttkInu1UOilQ5FwgQYlGNoQ9HVnW72j3yyFNgfrBFTlGsOd1ac/Y/oN2ZOwuviLUeCsfXWgkE6LvU6F/TxhWwfETqrt9kprKFMfHDOPBA8s4fuKgHnfhmLHR9zz/7q7IuiUnUithCyon0NXY3IGIUFuVSwAte7NklImhJYAoR3PdXGjvzLBzdyfDQ1x3RLWlubJW0+IBRDynmoNybCpTipvPyeX+985bz9ZWB0mlXRXIMLVKGwogGoCywHTVyYdebuQL54xnzNDAkK4sM7n5nFH838c3BONoSxgdLq4XSIWCuQKPLtrGIy83YKlOLpwxlC+eN5lRQyvzftS2FY+83MAD89exfsdeQDhn+vB8JKY3JW9ehNYiJCYBgkGPCPzxjR0s39jit2mZOmIAF88cHbnT6i27efzv6yNpDcs3tvCDp1ZEglY3nTuVAeVRQfrLv6ykea/t97J5ddWegDDzZSmENDSFor4mTgDtIDA0jwRo2pNxjU3T8gNOdEEAtm2zraU9SgA1KR2vUYEKKXm8U7rV/Q2zhkdcmIDr2fnzOjBNxDS07i85NqGrBpmuvaEs2jNZfvrcGr539VGR+1192gjufGEzG1ttvTYjkJLF7wohxcV+J+DC6TKDq08fw2fPGs2EYZXdfrp+SAW3fuRIvnTBNOa+tYXP3b047/tuvnAq21s6IocYYaTexud4W/ShKIPH39iByrSjtA0wqS7NopU7IirXum1tPP16o3bHmT73fu8Py1x1wHEPZ/POvVSmzUgezIMLGmjpALHSiFWOpMpdeyBnTVH1R2lDeXiMADbv0gSQRwLs2N2pEc/ltm64oeso7+adbREJNaImhdt9WeXXt0NpD1Xl8IU5o/Nw/wY39SNVHnLxqjxGviCGgfKlQJbfvrqFL507gXG1USnwpbNH8c+PrQ/WJpSKAIpoACgV4XQnTKjm21dOzdXuleLvy7eTtgyOmzgEI7ThZZbB+cfVU5nO37Di3BndBHzCLTWMmB3g4KcDKMPg6a99kOkl6lz9f6841v/5q79dye8W73IJydB+8bgYkADbBpYbDEibMaTdC0BtVVkeAsjo59XJdz34zhv1vQICSMckqkRjJ16rexxuPKOe2tiQk11tGe788xrNKMSPx7iIq71LEceE4doCWKBSdGRsfvTsGn78qagU+OQpw7lz3hbWt4SSFEsxIkmKKQFCUU4lkrPejO3w3BuN3PH8cl5b1YQA08cP5rozJ3DJzNFUVVghXO5DXru44lcML/cllhIQSr5LmRIxBksFhkjoa8N2ieeIl0gAcUilSTq0rr2dNrvaOkmZUFOZnwDEMPx8KJUvyBYitBwCGFTmqz8SDx76+r9i8ACTz52Ry3zueWEdO/ZkOfvYEYwcMiBwZRsGezPC40taUWEiAJ8JYVhgpvj9oq3cfN54JtQFWkJ5yuDmD4/ktkc3urm5BWXTHmgJ4BGBIeCI745rzzj87pUN3PnnVaxs3K19cikU8GZDK2/ev4T/ePQ9LjtpNNefOZ5pI6tAhIUrm7j92RXkLwAJuIroaO3rDbt1MM2IdKgmZBy7zg7hO0+vY1A5vqvRb9kY8c50k73pYUcoLeK840bysZPG5PWhR7irRPdMSRAHGFGTjjCOxmY3El5VkSKdMrqQAKGIa3cIIsLm5vbIr+qqyjANcePPkbKFqHp24+zhDI4lvO1qy3DXX9ZSW1XG3Tccw8DyqOR6aGETj77ZrBMWTd8zqDw1yzAQ0ySbNfnhs+u4/dqoR+jKE+u4fd52GnapiC3Rf41gJISUBrs7FT/603p+Na+Bzk43t2dIdUWUYELpv48t2sTjizZxytShpFMGSxt2sbShuetCCnG5yO6MQVZSrr5tpbW6YYT0UfE33K1DMBhXV8GxIyuCdo356g165DaBj/zVFdt5Z8OuPAQQOriwbZLzPS4XzvUAtYMIVZUpUlY3BBDOrJWuz2fzrigBmIZQV5Viy94Y8XteA33v+17ZzkOvNPoBTeU4dHRm2dVuc8v543OQ33YU9yxojOYP+UxShYjL7Rr4yOJtvLRipy/JMSzETLGr09CxGHp4tv7gBhVczq8RbemmdpY07GJwucFb3zmjZCrHp+5+mz+/14qYbgQSw9RqUMwF5wQ0OmvqIC46dkjR1mAYwqrG1rxmScAX8rlwQ1IAcjxAm5vbEYGhVWV5z37Hnmzsvp6bNZ8AELbEJICnBm3Zmw3zL42YgONGb7e3ZcFWKEfpVzdLtSJtcf3sXKJ/cVkz72/eA2ZaZ3YqrRIq0inlJ7piGijHpCOj2NyqD0gUmAoxnCCi7Afqii8BbPwRfEVRevWmuUTgImRpW8GJx919zm/EuIWEAnTu9dzbTazdujtPw94+WD9K8ebaJibUDehaLuYE5yJKth/JzpEA2gOULwbgEkAmMKx7Qg4RtrV2YDsqkvoxoqaMpY2ZAFHD7mNDUGJq45pAtXUyYCs+ekId9YNy13b3vI151BaHIRXCvK9MpTyWhPPdZxr4+fzNWn21XCZmei3RzQD5i4v/tuU+WXHtYDEM19/rFU6IQ3vGwXZgX/silllGTt6Op3J5mZt+BNJv1BsLUIjQmVVsau5wUxp8/V/17ZlRDKspZ+bkoV1HpXMKf0LryvHKRINgiOR1gbpxgGy0c3J3hCCwsy1Le8ZmQNqKEADsyWtf6RBi0OlbvElwClE2N30oNyHuvU27mbdsp5sSEWZGSrG9NcP8FS18dPrgyGeuPW049/xtCw5eCoXlJ0dK/PmKGLmykGLm30rEI+NJgV3tWY77f4vcjFAnG6oLVTFdOo9HyS/CcANP/331dK44eWwe92d4NBP5e6mGjM0vnDWSGftlgJ9Ejd/42vwgmAohY0wC4KpAccjYipZ2Wye3hRrLStcSoMN2aNrdGSEAN+6gQrZIzBgOd/oGRNngCGdMG8yRIwfm4f7rfWdE4Pb1HtfhgVe2cMn0wZFlTqqrYNaUal5c2eYn0UWQP1JOWjRwLEGc4uK/drobhjaiDMrLTP7hlGEoJ4udzWI7DqbEpIHqgcmieGPNzpxszLAaJNob4hvIETVbciKoW1o6ilO8k8fZ4/3QnnH02oghaNQj5D1jLgF0nQbRmXXY3eFolUGnUyjpRgC4RfqNze2MCUXkw1JHQiWmEc+eBAVFSkuGz52Zm1K+paWDJ97Yjphp1ybTXByUy/iAV1e3sLyxjWkjosHRa08ZzosrV/uuUi+TtAScPyAAhGyp+J7nky4vM/j6eWPd8Uj7ALc/t6J77JOYF4NYQEfcnKTKtPD/PbFa1yi46RAbduyhqtykuiIa6FmzbQ8jB5WTtsxcF2jkCwJJJaIjs2YZYqUxTMHJ1/rGE3w62JROCUMGpPLaAEPzpJG3tmfpdBSSkqjbsrtAoSG+VImoQBIUMeW4an3kD2oCjqqvYPbU3LyoX7+0kb22YJTpXCDDyKnJsJXiwVc28c2PTY589uyjBjN6kMXG3U6QTFnCTFAgayGSLQ36SyTCWWotQ+XkAEUpQPlWneK0SdX8+rpJkVtc9P2X+fjJo7j29Gi96tSvPs+9N53I9LE1BS0lYzukzKi366j/WEJzZz57IJq+XVlmURXKK+rMOuzQOn7+NIhMdIKiku4jptpZ0LirI0oA1WV53KiSv2xT5wV9ZtbIHFusrdPmwVc2hbJAJYdBeD//flEj/3LhBCrKAv9LmSlcNbOWH/x1a6Ail7YoJmuJkCnFnX37TpSfwBZmT22dNn99e0uvInvvb2rh9Gm13XpZApdgngWFDzHnHl2lXu/7QA93yLMRxSuJ2SUCw6vLIuUZzW0Z2rMKEckrAXbsyYSS/cL1uk6XBGAYJo2x2c3u90puo44QA3OLYdyS0+FVBpfMyD2Hx1/bzNbWTiRVjlc3jBL3cyg37VojdnNbJ0++0ciVJ0XVqKtPHMZPXmjEVrY2T40e0zv2ATotRDpKwpKlKwXZhe0t7Xz67leD3J28el5YV3AN59OPqM3P2SKBJnJbE0aStPIhtJOfCJRDw/Y2KlKFeYqrKizqB1X04A0iimmGy5nrYwl+23dnsHHzmoZ2kQckEQPTQ36jC/x3DcvG1ijPG5A2GVhRxm7byJnzHGl9qM/gupOHURGLSisFP//r6iC4qZEfR7mqsP+7IPB4/4IGPn7SqAiqjKgp49wja3hmWVvAqERKJQU6LIT2Ujo/uppsM2JQBc/+05kRRJe8BnW49aBiXJ6a2GilFV0QUwH6cZ43nP2B4Ty6aENMkuSHpQ3NfPSE0fzbpUd3bSHH/ewiKG3wtdvw5NImH4ne27wbMS1S4lBdYeWXAPqelWXCrInV4NjUV0lX0TowLd7c2Mb/vLAh5F1x4zWiQl6bnO1wy0nLLcW1J+emqWcdh59cc2woBtN1a0QvhURE4cRiEq4xPIxn3l+tFVfPLpFSlAO0W4i0lQL7xU/Mkmg7kJA///jxg4v0da63IMcNGirqCLxSXXgUDDPv7++4/oMFL+PLDyzJX40VSsuQWFKeq/MYiLJ4dX0Hr65b5+YmeX2VzBTplIrYBtEgmKH1+BS/+tTk7hdomIiVYvXOLP/1/MbQWFLtezfNKALnZIXCFcfX5jTBAkiZBseNH1SU4zxlYjWT68pZ1axizLToFNBmibC7NCpQINpdo6iENrBhRAoxJOwzVhJVO3zXWvweZpe1tIWvw8xbjSXiZqh66RkRV6geC4rOeFSOoZtOuQQgjk31QMkxrAGa2uzgngXYKWJaGFY6FmDSyYP+SNJ4DpXy+YZlCjeeWlfyyIllCFefWMt//Hl7qJFASSTAbgtoKQly+slqJnuyDjc+tBLRFVjKcSJ+5+4bt0YbxnrqkOcnxrBYsrlTD1aOcS+J6WM6uPLm5nauf2CFzgJ10yBW7Mjw2JvbeWtTG34rRtWFSRO3UTRnWrxhL7ZqY+WOd/znF8NiT1b8FiGSI6EMRBwUVhDRVmaoJWKWqkqL9Ts7coKEG1uyOlXAoNOBFVvbCdcrxxnS7oyAVeZHWcXfLyN2hQMUAfOoSJv8dP5W3bHCjg49z4lE5+n6HenzGs2kDfDF3bOWTCyjtxTd0xWtMua7Gx4Griq6CwhHJ0xlUXYGle0MpsU7Dr3rC5/H9+5NFDfdrMH8E8VD61GOVi0yKDursxrtoLOxb2t019I9v90g+Z7Bm41smOCvTxeKh4vPI+3ZQ4ih++8oW7dFyXYGBCviRn+9QJMYoefL+p/xEcswESMFVgoxy4LgVMgBIfGEpXBxi3dvO4vS/Z2w9VmGPU75XEjdEUCYUEMMwz3TMt1YLD4ou6jwWwuhqVTOeTG8GlDXlaccyw2jqxiHKsQVGjc+/UihCWZIfBtdzBsQNwqqxHJdpYYRa9+uXYmqwMEZkQOPI7/HdQ3f8xLNUCUn1cAr5A9aOIqO6gbJheLYIW4pgfqCuG5KwwTHZQxKpfwWKWJ46cU6ucxXf4z8gzxyslUlyO+SlG9Mi79/9LH1eq6UClKhQ2qaUQLur7VIS0S2l0T98WYDe8awYSKRAQ9qn4gr0KW1HhupAOvK0A3SM7z1RNp9R4I+4VBtV5sfRRiJt2WXQPUKErrycLJ4/1JBG8YOyjDBsRHHdPculNYqRpDy4SceqnCXh4AQfT1fQqpPoUMpxAj6vuoCpMg5qqLwS4LmwUFWbwkT4QC2WQibS2fOGLrUTlDKreyXLkfq9Hq3oiqIxLMY4wQZ4rIqWE94KRKvPFM9rDOv+pY7t0u604u7ip8oreYpXStgGFEJFUcK3bokR7UIc9Yw0+gVQkloLRI6R7XvR5lPCwjnI5UO+QE2W4hsLI0G5AVRXE+CqGLtVFdIU0AaQJDOGOrbVco0jTzGfa8O0ts7yeW0ebm2EWTORpXRLlKypR+dYw/MpTQEsNESaCiZi1JinoSSb1ohh9mtW6ePRCFFeUvXa1VFXE0fZrJ1uW+q9AdY2lFn6yyEBiADpA4YYu5PkINowdKP1iP9/WB7DRmE9RYiLUAjMIYEEjh8YDPQaqy7pd5GeD9vxVJyJdehe72/7pZ623JVPFkCfDhhCgkcRvCGdhsAsDDZjwQOM1gE3nwAYSEUuT1KAgn0X8h6TF8TgDQAq4Cpyd4kcBjASmCDTwBr/3G4mvCzLc8nBJDAYQJ/WvOl4SqQAK4Y+CPCPyZ7k8AhD4onvR+DKgvhBWBHsjsJHOKwDeHFHAJY88VhGYSHE/9wch3i12/XfHGY3wooWtwp8ivgC9JVW4EEEjioNR8c4Jfh30UQXeBNgZeSrUrgUASBFwWWxn4XhYl3bbsQeIqDPNMpgQRyBQAXrr6p7tnwL3P7W4g8ixskOCnZswQOIfg78HweqZALE3++/SyEvyZ7lsAhxP/PWv252nkFEQDApLu3/w64Itm5BA4B+N2qz9Zeme8PVtcWg3wVmAMMSfYvgYMYdgBf7eqPXbo7V31m6HrgNvZLAWgCCZTM8L1t1WeGbujqDVa3Hxfuw60T+ESylwkchPAw8OvuUbwHmHRPUzXCK8BRyX4mcBDBOyhOWXXjkNZ9IgCAyb9sOgI3QDY02dcEDgLYDpy+8tNDlvX0xoKDXZN/1TQLeBYYkOxvAv0Y9gAXrLxhyPxC3tyraO/kX+28GHgEoSzZ5wT6ocnbCVyx8obBTxb6kV4lva28YfBTCFcDncluJ9DPoBPhmt4gf68lgC8J7tt5sbawE3Uogf4AbcAnVl7fO+TvMwFoIpgNPApSm+x/AgdQ79kOXLby+sHz+/Lpfcr4nPLr5mkuEXB0chAJHAB4F7h0xXWDlvX1BvtU+KK/+BTgIZKIcQL709x1VfBT9gX591kChCSBIFwH/IAkdyiB0kITcBuK+1ZcN2ifmW5Ri16m3N88GuT7wJXJOSVQAngU1K0rrh3UUKwblqTqa8r9u85A+DZwMkllWQL7ru4sRPEvK66tKXqNSsmQc8oDuwzgPODrwCySQvsEegcObvrN94BnVnyqxinFl5ScO095YJcAxwrcgPAJoC452wS6gR0ofqvgV8AbKz5VU1Lnyn5VT6Y+uMsCzgQuBs4FJtFTSnYChzrYwGrcet2ngBeWX1OT2V9ffsD086kPtggwGrf4fiYwAzgCqKeU45oSOJCQxZ3M8j6wBLdF+atAw/Jrqg+IG71fGahTH2oxgSpgLDAOGAWM0GrTEGAQUA0MBCqBciANlGlJYmpbw2vznrR7Lx6X9l4d/ZrFzQnrANpx0xF2A61AM667chvu+K2NwDqgAWhZfnW13V8e7P8HcM7GQ5ZXdIkAAAAASUVORK5CYII=
     */

    private int versionCode;
    private String versionName;
    private int compileSdkVersion;
    private String compileSdkVersionCodename;
    @SerializedName("package")
    private String packageX;
    private int platformBuildVersionCode;
    private int platformBuildVersionName;
    private UsesSdkBean usesSdk;
    private ApplicationBean application;
    private String icon;
    private List<UsesPermissionsBean> usesPermissions;
    private List<UsesFeaturesBean> usesFeatures;

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getCompileSdkVersion() {
        return compileSdkVersion;
    }

    public void setCompileSdkVersion(int compileSdkVersion) {
        this.compileSdkVersion = compileSdkVersion;
    }

    public String getCompileSdkVersionCodename() {
        return compileSdkVersionCodename;
    }

    public void setCompileSdkVersionCodename(String compileSdkVersionCodename) {
        this.compileSdkVersionCodename = compileSdkVersionCodename;
    }

    public String getPackageX() {
        return packageX;
    }

    public void setPackageX(String packageX) {
        this.packageX = packageX;
    }

    public int getPlatformBuildVersionCode() {
        return platformBuildVersionCode;
    }

    public void setPlatformBuildVersionCode(int platformBuildVersionCode) {
        this.platformBuildVersionCode = platformBuildVersionCode;
    }

    public int getPlatformBuildVersionName() {
        return platformBuildVersionName;
    }

    public void setPlatformBuildVersionName(int platformBuildVersionName) {
        this.platformBuildVersionName = platformBuildVersionName;
    }



    public UsesSdkBean getUsesSdk() {
        return usesSdk;
    }

    public void setUsesSdk(UsesSdkBean usesSdk) {
        this.usesSdk = usesSdk;
    }



    public ApplicationBean getApplication() {
        return application;
    }

    public void setApplication(ApplicationBean application) {
        this.application = application;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<UsesPermissionsBean> getUsesPermissions() {
        return usesPermissions;
    }

    public void setUsesPermissions(List<UsesPermissionsBean> usesPermissions) {
        this.usesPermissions = usesPermissions;
    }

    public List<UsesFeaturesBean> getUsesFeatures() {
        return usesFeatures;
    }

    public void setUsesFeatures(List<UsesFeaturesBean> usesFeatures) {
        this.usesFeatures = usesFeatures;
    }


    public static class UsesSdkBean {
        /**
         * minSdkVersion : 19
         * targetSdkVersion : 28
         */

        private int minSdkVersion;
        private int targetSdkVersion;

        public int getMinSdkVersion() {
            return minSdkVersion;
        }

        public void setMinSdkVersion(int minSdkVersion) {
            this.minSdkVersion = minSdkVersion;
        }

        public int getTargetSdkVersion() {
            return targetSdkVersion;
        }

        public void setTargetSdkVersion(int targetSdkVersion) {
            this.targetSdkVersion = targetSdkVersion;
        }
    }

    public static class ApplicationBean {
        /**
         * label : ["合肥办公"]
         * icon : ["res/mipmap-ldpi-v4/ic_launcher.png","res/mipmap-mdpi-v4/ic_launcher.png","res/mipmap-hdpi-v4/ic_launcher.png","res/mipmap-xhdpi-v4/ic_launcher.png","res/mipmap-xxhdpi-v4/ic_launcher.png","res/mipmap-xxxhdpi-v4/ic_launcher.png"]
         * name : cn.lonsun.goa.MyApplication
         * allowBackup : false
         * hardwareAccelerated : true
         * largeHeap : true
         * supportsRtl : true
         * usesCleartextTraffic : true
         * networkSecurityConfig : ["res/xml/network_security_config.xml"]
         * roundIcon : ["res/mipmap-ldpi-v4/ic_launcher_round.png","res/mipmap-mdpi-v4/ic_launcher_round.png","res/mipmap-hdpi-v4/ic_launcher_round.png","res/mipmap-xhdpi-v4/ic_launcher_round.png","res/mipmap-xxhdpi-v4/ic_launcher_round.png","res/mipmap-xxxhdpi-v4/ic_launcher_round.png"]
         * appComponentFactory : androidx.core.app.CoreComponentFactory
         * activities : [{"name":"cn.lonsun.goa.SplashActivity","configChanges":1184,"windowSoftInputMode":18,"intentFilters":[{"actions":[{"name":"android.intent.action.MAIN"}],"categories":[{"name":"android.intent.category.LAUNCHER"}],"data":[]}],"metaData":[]},{"name":"cn.lonsun.goa.MainActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.guide.activity.GuideActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactListActivity","screenOrientation":1,"configChanges":1184,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactCenterWithIndicatorActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactCenterWithTabbarActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.message.activity.MessageListActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactInfoActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.contact.activity.ContactSearchActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocCenterActivity","launchMode":2,"screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocBHEditActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocLogActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocBackActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.SignSuccessActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocRegisterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.DocNextStepActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.CollApprovalDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.doc.activity.OneEditActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.base.activity.FilePreviewActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.preson.activity.SelectPersonActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.preson.activity.PersonEditActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.theme.ThemeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.HomeSearchActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.message.activity.MessageCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.userinfo.activity.UserInfoActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.AccountSafeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.ChangePassWordActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.IdVerifyActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.accountsafe.activity.FingerPrintActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.about.activity.AboutActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.user.partment.activity.SwitchPartmentctivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.preson.activity.PersonSearchActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailHomeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.SendEmailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailFeedBackActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.ReadConditionActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.ReadConditionMoreActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.email.activity.EmailSelectPersonActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.pick.file.ui.FileSelectorActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeReplyActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeConditionActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeConditionMoreActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.SendNoticeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeSelectHomeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeCustomSelectorActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.notice.activity.NoticeNotAttendActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.login.activity.LoginHomeActivity","launchMode":2,"screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.login.activity.FingerLoginActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.dzxx.activity.DZXXActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.zwjb.activity.ZWJBActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.ApprovalCenterActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.RecordActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.RecordListActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.RecordDetailActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.record.activity.WriteRecordActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalTypeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalFormActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalFormTypeActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.SendApprovalMoneyFormActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.ApprovalNextStepActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.collapproval.activity.ApprovalLogActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":18,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.HomeSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.DocSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.NoticeSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.EmailSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.ApprovalSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.DZXXSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.search.activity.ZWJBSearchResultActivity","screenOrientation":1,"configChanges":1184,"windowSoftInputMode":20,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.signature.activity.SignatrueActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"com.journeyapps.barcodescanner.CaptureActivity","clearTaskOnLaunch":true,"stateNotNeeded":true,"screenOrientation":10,"windowSoftInputMode":3,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingSegmentActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingDetailActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.base.activity.FileQuickPreviewActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.base.activity.BrowserActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.PersonsNameActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingFilesActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingThingsActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingLogActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingForwardActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingPresentActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingFeedBackActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingLeaveActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.UnitMeetingFeedBackActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.UnitFeedUserActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingConditionActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingAuditActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"cn.lonsun.goa.home.meeting.activity.MeetingApproveActivity","screenOrientation":1,"configChanges":1184,"hardwareAccelerated":true,"intentFilters":[],"metaData":[]},{"name":"com.blankj.utilcode.util.PermissionUtils$PermissionActivity","multiprocess":true,"configChanges":1184,"windowSoftInputMode":3,"intentFilters":[],"metaData":[]},{"name":"com.zhihu.matisse.ui.MatisseActivity","intentFilters":[],"metaData":[]},{"name":"com.zhihu.matisse.internal.ui.AlbumPreviewActivity","intentFilters":[],"metaData":[]},{"name":"com.zhihu.matisse.internal.ui.SelectedPreviewActivity","intentFilters":[],"metaData":[]}]
         * activityAliases : []
         * launcherActivities : [{"name":"cn.lonsun.goa.SplashActivity","configChanges":1184,"windowSoftInputMode":18,"intentFilters":[{"actions":[{"name":"android.intent.action.MAIN"}],"categories":[{"name":"android.intent.category.LAUNCHER"}],"data":[]}],"metaData":[]}]
         * services : [{"name":"com.sangfor.ssl.l3vpn.service.EasyappSvpnService","permission":"android.permission.BIND_VPN_SERVICE","intentFilters":[{"actions":[{"name":"com.sangfor.ssl.l3vpn.service.EasyappSvpnService"}],"categories":[],"data":[]}],"metaData":[]},{"name":"com.sangfor.ssl.service.timeqry.TimeQryService","exported":false,"intentFilters":[{"actions":[{"name":"com.sangfor.ssl.vpn.sdk.action.ACTION_TIMEQRY"}],"categories":[],"data":[]}],"metaData":[]}]
         * receivers : []
         * providers : [{"name":"androidx.core.content.FileProvider","exported":false,"authorities":"cn.lonsun.goa.dev_bangong.FileProvider","grantUriPermissions":[],"metaData":[{"name":"android.support.FILE_PROVIDER_PATHS","resource":["res/xml/file_path.xml"]}],"pathPermissions":[]},{"name":"com.blankj.utilcode.util.Utils$FileProvider4UtilCode","exported":false,"multiprocess":true,"authorities":"cn.lonsun.goa.dev_bangong.utilcode.provider","grantUriPermissions":[],"metaData":[{"name":"android.support.FILE_PROVIDER_PATHS","resource":["res/xml/util_code_provider_paths.xml"]}],"pathPermissions":[]},{"name":"com.pgyersdk.PgyerProvider","exported":false,"authorities":"cn.lonsun.goa.dev_bangong.com.pgyer.provider","grantUriPermissions":[],"metaData":[],"pathPermissions":[]}]
         * usesLibraries : [{"name":"org.apache.http.legacy","required":false}]
         * metaData : [{"name":"PGYER_APPID","value":"af5d19d855b89c5ef70bbd649cbe447f"}]
         */

        private String name;
        private boolean allowBackup;
        private boolean hardwareAccelerated;
        private boolean largeHeap;
        private boolean supportsRtl;
        private boolean usesCleartextTraffic;
        private String appComponentFactory;
        private List<String> label;
        private List<String> icon;
        private List<String> networkSecurityConfig;
        private List<String> roundIcon;
        private List<ActivitiesBean> activities;
        private List<?> activityAliases;
        private List<LauncherActivitiesBean> launcherActivities;
        private List<ServicesBean> services;
        private List<?> receivers;
        private List<ProvidersBean> providers;
        private List<UsesLibrariesBean> usesLibraries;
        private List<MetaDataBeanX> metaData;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isAllowBackup() {
            return allowBackup;
        }

        public void setAllowBackup(boolean allowBackup) {
            this.allowBackup = allowBackup;
        }

        public boolean isHardwareAccelerated() {
            return hardwareAccelerated;
        }

        public void setHardwareAccelerated(boolean hardwareAccelerated) {
            this.hardwareAccelerated = hardwareAccelerated;
        }

        public boolean isLargeHeap() {
            return largeHeap;
        }

        public void setLargeHeap(boolean largeHeap) {
            this.largeHeap = largeHeap;
        }

        public boolean isSupportsRtl() {
            return supportsRtl;
        }

        public void setSupportsRtl(boolean supportsRtl) {
            this.supportsRtl = supportsRtl;
        }

        public boolean isUsesCleartextTraffic() {
            return usesCleartextTraffic;
        }

        public void setUsesCleartextTraffic(boolean usesCleartextTraffic) {
            this.usesCleartextTraffic = usesCleartextTraffic;
        }

        public String getAppComponentFactory() {
            return appComponentFactory;
        }

        public void setAppComponentFactory(String appComponentFactory) {
            this.appComponentFactory = appComponentFactory;
        }

        public List<String> getLabel() {
            return label;
        }

        public void setLabel(List<String> label) {
            this.label = label;
        }

        public List<String> getIcon() {
            return icon;
        }

        public void setIcon(List<String> icon) {
            this.icon = icon;
        }

        public List<String> getNetworkSecurityConfig() {
            return networkSecurityConfig;
        }

        public void setNetworkSecurityConfig(List<String> networkSecurityConfig) {
            this.networkSecurityConfig = networkSecurityConfig;
        }

        public List<String> getRoundIcon() {
            return roundIcon;
        }

        public void setRoundIcon(List<String> roundIcon) {
            this.roundIcon = roundIcon;
        }

        public List<ActivitiesBean> getActivities() {
            return activities;
        }

        public void setActivities(List<ActivitiesBean> activities) {
            this.activities = activities;
        }

        public List<?> getActivityAliases() {
            return activityAliases;
        }

        public void setActivityAliases(List<?> activityAliases) {
            this.activityAliases = activityAliases;
        }

        public List<LauncherActivitiesBean> getLauncherActivities() {
            return launcherActivities;
        }

        public void setLauncherActivities(List<LauncherActivitiesBean> launcherActivities) {
            this.launcherActivities = launcherActivities;
        }

        public List<ServicesBean> getServices() {
            return services;
        }

        public void setServices(List<ServicesBean> services) {
            this.services = services;
        }

        public List<?> getReceivers() {
            return receivers;
        }

        public void setReceivers(List<?> receivers) {
            this.receivers = receivers;
        }

        public List<ProvidersBean> getProviders() {
            return providers;
        }

        public void setProviders(List<ProvidersBean> providers) {
            this.providers = providers;
        }

        public List<UsesLibrariesBean> getUsesLibraries() {
            return usesLibraries;
        }

        public void setUsesLibraries(List<UsesLibrariesBean> usesLibraries) {
            this.usesLibraries = usesLibraries;
        }

        public List<MetaDataBeanX> getMetaData() {
            return metaData;
        }

        public void setMetaData(List<MetaDataBeanX> metaData) {
            this.metaData = metaData;
        }

        public static class ActivitiesBean {
            /**
             * name : cn.lonsun.goa.SplashActivity
             * configChanges : 1184
             * windowSoftInputMode : 18
             * intentFilters : [{"actions":[{"name":"android.intent.action.MAIN"}],"categories":[{"name":"android.intent.category.LAUNCHER"}],"data":[]}]
             * metaData : []
             * screenOrientation : 1
             * launchMode : 2
             * hardwareAccelerated : true
             * clearTaskOnLaunch : true
             * stateNotNeeded : true
             * multiprocess : true
             */

            private String name;
            private int configChanges;
            private int windowSoftInputMode;
            private int screenOrientation;
            private int launchMode;
            private boolean hardwareAccelerated;
            private boolean clearTaskOnLaunch;
            private boolean stateNotNeeded;
            private boolean multiprocess;
            private List<IntentFiltersBean> intentFilters;
            private List<?> metaData;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getConfigChanges() {
                return configChanges;
            }

            public void setConfigChanges(int configChanges) {
                this.configChanges = configChanges;
            }

            public int getWindowSoftInputMode() {
                return windowSoftInputMode;
            }

            public void setWindowSoftInputMode(int windowSoftInputMode) {
                this.windowSoftInputMode = windowSoftInputMode;
            }

            public int getScreenOrientation() {
                return screenOrientation;
            }

            public void setScreenOrientation(int screenOrientation) {
                this.screenOrientation = screenOrientation;
            }

            public int getLaunchMode() {
                return launchMode;
            }

            public void setLaunchMode(int launchMode) {
                this.launchMode = launchMode;
            }

            public boolean isHardwareAccelerated() {
                return hardwareAccelerated;
            }

            public void setHardwareAccelerated(boolean hardwareAccelerated) {
                this.hardwareAccelerated = hardwareAccelerated;
            }

            public boolean isClearTaskOnLaunch() {
                return clearTaskOnLaunch;
            }

            public void setClearTaskOnLaunch(boolean clearTaskOnLaunch) {
                this.clearTaskOnLaunch = clearTaskOnLaunch;
            }

            public boolean isStateNotNeeded() {
                return stateNotNeeded;
            }

            public void setStateNotNeeded(boolean stateNotNeeded) {
                this.stateNotNeeded = stateNotNeeded;
            }

            public boolean isMultiprocess() {
                return multiprocess;
            }

            public void setMultiprocess(boolean multiprocess) {
                this.multiprocess = multiprocess;
            }

            public List<IntentFiltersBean> getIntentFilters() {
                return intentFilters;
            }

            public void setIntentFilters(List<IntentFiltersBean> intentFilters) {
                this.intentFilters = intentFilters;
            }

            public List<?> getMetaData() {
                return metaData;
            }

            public void setMetaData(List<?> metaData) {
                this.metaData = metaData;
            }

            public static class IntentFiltersBean {
                private List<ActionsBean> actions;
                private List<CategoriesBean> categories;
                private List<?> data;

                public List<ActionsBean> getActions() {
                    return actions;
                }

                public void setActions(List<ActionsBean> actions) {
                    this.actions = actions;
                }

                public List<CategoriesBean> getCategories() {
                    return categories;
                }

                public void setCategories(List<CategoriesBean> categories) {
                    this.categories = categories;
                }

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }

                public static class ActionsBean {
                    /**
                     * name : android.intent.action.MAIN
                     */

                    private String name;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }

                public static class CategoriesBean {
                    /**
                     * name : android.intent.category.LAUNCHER
                     */

                    private String name;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }

        public static class LauncherActivitiesBean {
            /**
             * name : cn.lonsun.goa.SplashActivity
             * configChanges : 1184
             * windowSoftInputMode : 18
             * intentFilters : [{"actions":[{"name":"android.intent.action.MAIN"}],"categories":[{"name":"android.intent.category.LAUNCHER"}],"data":[]}]
             * metaData : []
             */

            private String name;
            private int configChanges;
            private int windowSoftInputMode;
            private List<IntentFiltersBeanX> intentFilters;
            private List<?> metaData;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getConfigChanges() {
                return configChanges;
            }

            public void setConfigChanges(int configChanges) {
                this.configChanges = configChanges;
            }

            public int getWindowSoftInputMode() {
                return windowSoftInputMode;
            }

            public void setWindowSoftInputMode(int windowSoftInputMode) {
                this.windowSoftInputMode = windowSoftInputMode;
            }

            public List<IntentFiltersBeanX> getIntentFilters() {
                return intentFilters;
            }

            public void setIntentFilters(List<IntentFiltersBeanX> intentFilters) {
                this.intentFilters = intentFilters;
            }

            public List<?> getMetaData() {
                return metaData;
            }

            public void setMetaData(List<?> metaData) {
                this.metaData = metaData;
            }

            public static class IntentFiltersBeanX {
                private List<ActionsBeanX> actions;
                private List<CategoriesBeanX> categories;
                private List<?> data;

                public List<ActionsBeanX> getActions() {
                    return actions;
                }

                public void setActions(List<ActionsBeanX> actions) {
                    this.actions = actions;
                }

                public List<CategoriesBeanX> getCategories() {
                    return categories;
                }

                public void setCategories(List<CategoriesBeanX> categories) {
                    this.categories = categories;
                }

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }

                public static class ActionsBeanX {
                    /**
                     * name : android.intent.action.MAIN
                     */

                    private String name;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }

                public static class CategoriesBeanX {
                    /**
                     * name : android.intent.category.LAUNCHER
                     */

                    private String name;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }

        public static class ServicesBean {
            /**
             * name : com.sangfor.ssl.l3vpn.service.EasyappSvpnService
             * permission : android.permission.BIND_VPN_SERVICE
             * intentFilters : [{"actions":[{"name":"com.sangfor.ssl.l3vpn.service.EasyappSvpnService"}],"categories":[],"data":[]}]
             * metaData : []
             * exported : false
             */

            private String name;
            private String permission;
            private boolean exported;
            private List<IntentFiltersBeanXX> intentFilters;
            private List<?> metaData;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPermission() {
                return permission;
            }

            public void setPermission(String permission) {
                this.permission = permission;
            }

            public boolean isExported() {
                return exported;
            }

            public void setExported(boolean exported) {
                this.exported = exported;
            }

            public List<IntentFiltersBeanXX> getIntentFilters() {
                return intentFilters;
            }

            public void setIntentFilters(List<IntentFiltersBeanXX> intentFilters) {
                this.intentFilters = intentFilters;
            }

            public List<?> getMetaData() {
                return metaData;
            }

            public void setMetaData(List<?> metaData) {
                this.metaData = metaData;
            }

            public static class IntentFiltersBeanXX {
                private List<ActionsBeanXX> actions;
                private List<?> categories;
                private List<?> data;

                public List<ActionsBeanXX> getActions() {
                    return actions;
                }

                public void setActions(List<ActionsBeanXX> actions) {
                    this.actions = actions;
                }

                public List<?> getCategories() {
                    return categories;
                }

                public void setCategories(List<?> categories) {
                    this.categories = categories;
                }

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }

                public static class ActionsBeanXX {
                    /**
                     * name : com.sangfor.ssl.l3vpn.service.EasyappSvpnService
                     */

                    private String name;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }

        public static class ProvidersBean {
            /**
             * name : androidx.core.content.FileProvider
             * exported : false
             * authorities : cn.lonsun.goa.dev_bangong.FileProvider
             * grantUriPermissions : []
             * metaData : [{"name":"android.support.FILE_PROVIDER_PATHS","resource":["res/xml/file_path.xml"]}]
             * pathPermissions : []
             * multiprocess : true
             */

            private String name;
            private boolean exported;
            private String authorities;
            private boolean multiprocess;
            private List<?> grantUriPermissions;
            private List<MetaDataBean> metaData;
            private List<?> pathPermissions;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isExported() {
                return exported;
            }

            public void setExported(boolean exported) {
                this.exported = exported;
            }

            public String getAuthorities() {
                return authorities;
            }

            public void setAuthorities(String authorities) {
                this.authorities = authorities;
            }

            public boolean isMultiprocess() {
                return multiprocess;
            }

            public void setMultiprocess(boolean multiprocess) {
                this.multiprocess = multiprocess;
            }

            public List<?> getGrantUriPermissions() {
                return grantUriPermissions;
            }

            public void setGrantUriPermissions(List<?> grantUriPermissions) {
                this.grantUriPermissions = grantUriPermissions;
            }

            public List<MetaDataBean> getMetaData() {
                return metaData;
            }

            public void setMetaData(List<MetaDataBean> metaData) {
                this.metaData = metaData;
            }

            public List<?> getPathPermissions() {
                return pathPermissions;
            }

            public void setPathPermissions(List<?> pathPermissions) {
                this.pathPermissions = pathPermissions;
            }

            public static class MetaDataBean {
                /**
                 * name : android.support.FILE_PROVIDER_PATHS
                 * resource : ["res/xml/file_path.xml"]
                 */

                private String name;
                private List<String> resource;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<String> getResource() {
                    return resource;
                }

                public void setResource(List<String> resource) {
                    this.resource = resource;
                }
            }
        }

        public static class UsesLibrariesBean {
            /**
             * name : org.apache.http.legacy
             * required : false
             */

            private String name;
            private boolean required;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isRequired() {
                return required;
            }

            public void setRequired(boolean required) {
                this.required = required;
            }
        }

        public static class MetaDataBeanX {
            /**
             * name : PGYER_APPID
             * value : af5d19d855b89c5ef70bbd649cbe447f
             */

            private String name;
            private String value;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }

    public static class UsesPermissionsBean {
        /**
         * name : android.permission.ACCESS_NETWORK_STATE
         */

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class UsesFeaturesBean {
        /**
         * name : android.hardware.camera
         * required : false
         */

        private String name;
        private boolean required;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isRequired() {
            return required;
        }

        public void setRequired(boolean required) {
            this.required = required;
        }
    }
}
