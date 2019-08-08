<%--
  Created by IntelliJ IDEA.
  User: liufuyi
  Date: 2019-08-08
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<script>
    // 例如js调起android原生端业务
    function notifyAndroidAction() {

        //例如告知Android原生端上去开始录音
        var json = "{\"method\":\"voice\",\"action\":\"start\"}";
        //var json = "{\"method\":\"voice\",\"action\":\"end\"}";//结束录音
        //var json = "{\"method\":\"scan\"}";//去扫码


        window.xyAndroid.send(json);
        //xyAndroid由Android原生端定义好了的，注入到h5页面的
        //调用此方法后，Android原生端会调用window.xyJSCallback(msg)告知结果
    }
</script>

<script>
    // 定义Android原生通知h5页面js的方法
    function xyJSCallback(msg) {
        //msg:为json格式字符串
        //语音msg为：{"method":"voice","content":"/sdcard/examplePath/voice.mp4"}
        //扫码msg为：{"method":"scan","content":"QRcode1234567890"}
        //这里写业务处理过程


        //success return true else return false;
        return true;
    }
</script>

</body>
</html>
