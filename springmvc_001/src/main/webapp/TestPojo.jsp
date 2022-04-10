<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/4/8
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎测试时间</title>
</head>
<body>
<form action="getDataPojo" method="post">
    <p>姓名：<input type="text" name="pname"></p>
    <p>年龄：<input type="text" name="page"></p>
    <p>
        性别：<input type="radio" name="gender" value="1">男
        <input type="radio" name="gender" value="0">女
    </p>
    <p>爱好：
        <input type="checkbox" name="hobby" value="1">篮球
        <input type="checkbox" name="hobby" value="2">足球
        <input type="checkbox" name="hobby" value="3">羽毛球
    </p>
    <p>生日：<input type="text" name="birthdate"></p>
    <p>
        宠物：<input type="text" name="pet.petName">
        类型：<input type="text" name="pet.petType">
    </p>
    List宠物
    <p>
        宠物1：<input type="text" name="pets[0].petName">
        类型：<input type="text" name="pets[0].petType">
    </p>
    <p>
        宠物2：<input type="text" name="pets[1].petName">
        类型：<input type="text" name="pets[1].petType">
    </p>
    Map宠物
    <p>
        宠物1：<input type="text" name="petMap['a'].petName">
        类型：<input type="text" name="petMap['a'].petType">
    </p>
    <p>
        宠物2：<input type="text" name="petMap['b'].petName">
        类型：<input type="text" name="petMap['b'].petType">
    </p>
    <input type="submit" value="提交">

</form>
<form action="demo5" method="post">
    <p>姓名：<input type="text" name="pname"></p>
    <p>年龄：<input type="text" name="page"></p>
    <p>
        性别：<input type="radio" name="gender" value="1">男
        <input type="radio" name="gender" value="0">女
    </p>
    <p>爱好：
        <input type="checkbox" name="hobby" value="1">篮球
        <input type="checkbox" name="hobby" value="2">足球
        <input type="checkbox" name="hobby" value="3">羽毛球
    </p>
    <p>生日：<input type="text" name="birthdate"></p>
    <p>
        宠物：<input type="text" name="pet.petName">
        类型：<input type="text" name="pet.petType">
    </p>
    List宠物
    <p>
        宠物1：<input type="text" name="pets[0].petName">
        类型：<input type="text" name="pets[0].petType">
    </p>
    <p>
        宠物2：<input type="text" name="pets[1].petName">
        类型：<input type="text" name="pets[1].petType">
    </p>
    Map宠物
    <p>
        宠物1：<input type="text" name="petMap['a'].petName">
        类型：<input type="text" name="petMap['a'].petType">
    </p>
    <p>
        宠物2：<input type="text" name="petMap['b'].petName">
        类型：<input type="text" name="petMap['b'].petType">
    </p>
    <input type="submit" value="提交">

</form>


</body>
</html>
