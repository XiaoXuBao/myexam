<html>
<#assign contextPath = request.contextPath />
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>


    <style type="text/css">

    </style>
    <title>pageTwo</title>
</head>
<body>
    <div>
        这是第二页
    </div>
    <br>
    <div>
        ${data}
    </div>
    <br>
    <div id="ajax">

    </div>
    <input type="button" onclick="myButton()" value="我要去第一页">

    <script type="text/javascript" src="${contextPath}/jquery.js"></script>
    <script type="text/javascript">
        $.ajax({
            type: "GET",
            url: '${contextPath}/restDemoController/getPageTwoData',
            dataType: 'json',
            data: {},
            success: function (result) {
                $("#ajax").html(result.msg);
            }, error: function (XMLHttpRequest, textStatus, errorThrown) {
                console.log("ajax错误类型："+textStatus);
                console.log(errorThrown);
                alert('出错了！');
            }
        });
        function myButton() {
            window.location.href = "${contextPath}/demoController/toPageOne";
        }
    </script>
</body>
</html>
