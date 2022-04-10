<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="./static/js/jquery.min.js"></script>
    <script>
        // 页面加载，绑定单击事件
        $(function(){
            $("#btn").click(function(){
                // alert("hello btn");
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:{pname:"Adair",page:"123456"},
                    dataType:"json",
                    type:"get",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.petName);
                        alert(data.petType);
                        console.log(data.petName)
                        console.log(data.petType)
                    }
                });
            });
        });
    </script>
</head>
<body>
<input id="btn" type="button" value="testJson">
</body>
</html>