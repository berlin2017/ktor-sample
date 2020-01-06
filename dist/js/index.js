var $$ = mdui.JQ;
$$(function () {
    // showLoginDialog()
});

// $$('#loginBtn').on("click", function (event) {
//     showLoginDialog()
// })

$$('.loginBtn').on("click", function (event) {
    showLoginDialog()
});

$$('body').on("scroll",function (e) {
    console.log("scrolled")
});


function showLoginDialog() {
    var inst = new mdui.Dialog('#login_dialog');
    inst.open()
}

//
// var mescroll = new MeScroll("mescroll", { //第一个参数"mescroll"对应上面布局结构div的id (1.3.5版本支持传入dom对象)
//     //如果您的下拉刷新是重置列表数据,那么down完全可以不用配置,具体用法参考第一个基础案例
//     //解析: down.callback默认调用mescroll.resetUpScroll(),而resetUpScroll会将page.num=1,再触发up.callback
//     down: {
//         callback: downCallback //下拉刷新的回调,别写成downCallback(),多了括号就自动执行方法了
//     }
// });


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

// var ctx = document.getElementById('myChart').getContext('2d');
var ctx = $$('#myChart');
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
        datasets: [{
            label: '发布数',
            data: [12, 19, 3, 5, 2, 3],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                display:false
            }],
            xAxes:[{
                gridLines:{
                    borderDash:[5]
                    // drawOnChartArea:false
                }
            }]
        },
        legend: {
            display: false,
            position: 'bottom',
            labels: {
                boxWidth: 80,
                fontColor: 'rgb(60, 180, 100)'
            }
        },
        tooltips: {
            cornerRadius: 0,
            caretSize: 0,
            xPadding: 16,
            yPadding: 10,
            backgroundColor: 'rgba(0, 150, 100, 0.9)',
            titleFontStyle: 'normal',
            titleMarginBottom: 15
        }
    }
});



