<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/20 0020
  Time: 上午 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<s:form action="register" method="POST">
    <s:label value="欢迎注册"/>
    <s:textfield name="id" label="学号"/>
    <s:textfield name="username" label="用户名"/>
    <s:password name="userpassword" label="密码"/>
    <s:textfield name="major" label="专业"/>
    <s:submit value="提交"/>
</s:form>


</body>
</html>
