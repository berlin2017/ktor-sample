var $$ = mdui.JQ
$$(function () {
    // showLoginDialog()
})

// $$('#loginBtn').on("click", function (event) {
//     showLoginDialog()
// })

$$('.loginBtn').on("click", function (event) {
    showLoginDialog()
})

$$('body').on("scroll",function (e) {
    console.log("scrolled")
})


function showLoginDialog() {
    var inst = new mdui.Dialog('#login_dialog');
    inst.open()
}


var mescroll = new MeScroll("mescroll", { //第一个参数"mescroll"对应上面布局结构div的id (1.3.5版本支持传入dom对象)
    //如果您的下拉刷新是重置列表数据,那么down完全可以不用配置,具体用法参考第一个基础案例
    //解析: down.callback默认调用mescroll.resetUpScroll(),而resetUpScroll会将page.num=1,再触发up.callback
    down: {
        callback: downCallback //下拉刷新的回调,别写成downCallback(),多了括号就自动执行方法了
    }
});


//下拉刷新的回调
function downCallback() {
   console.log("下拉刷新");
    mescroll.endSuccess()
}

//上拉加载的回调 page = {num:1, size:10}; num:当前页 默认从1开始, size:每页数据条数,默认10
function upCallback(page) {
    console.log("上拉加载");
    mescroll.endSuccess();
}



