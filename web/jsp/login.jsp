<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <s:form action="login" method="POST">
        <s:label value="欢迎登陆"/>
        <s:textfield name="id" label="学号"/>
        <s:password name="userpassword" label="密码"/>
        <s:submit value="登陆"/>
    </s:form>

    <a href="/jsp/register.jsp">
        <button>注册</button>
    </a>


</body>
</html>
