var $$ = mdui.JQ;
$$("#qrcode").qrcode({
    render: "canvas", //canvas
    width: 200, //宽度
    height:200, //高度
    text: "window.location.href"
});