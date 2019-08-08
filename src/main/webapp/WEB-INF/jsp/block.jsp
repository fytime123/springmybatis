<%--
  Created by IntelliJ IDEA.
  User: liufuyi
  Date: 2019-08-08
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Cache-Control" content="no-cache" />
    <title>Document</title>
<script src="https://wechatfe.github.io/vconsole/lib/vconsole.min.js?v=3.3.0"></script>
<script>window.vConsole = new window.VConsole();</script>
</head>

<body>
<button id="button">重新获取</button>
<div id="app"></div>

<script>
    window.onload = function () {
        var dom = document.getElementById('app');
        var button = document.getElementById('button');
        button.addEventListener('click', getLastBlock);
        function getLastBlock() {
            var blk  = connex.thor.block();
            blk.get().then(function (res) {
                dom.innerHTML += 'number:' + res.number + '   timestamp:' + res.timestamp + '<br />';
        })
        }
    }
</script>
</body>

</html>
