<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生选课界面</title>
</head>
<body>
<h1>学生选课界面</h1>
<s:form action="select_course" namespace="/" method="POST">
    <s:submit value="开始选课"/>
</s:form>
</body>
</html>
