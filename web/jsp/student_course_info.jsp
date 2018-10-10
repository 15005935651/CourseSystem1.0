<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            text-align: center
        }
    </style>
</head>
<body>
<h1>学生课程信息</h1>

<table border="1" width="100%">

    <tr>
        <td><h3>课程名称</h3></td>
        <td><h3>获得学分</h3></td>
        <td><h3>课程成绩</h3></td>
        <td><h3>开课时间</h3></td>
        <td><h3>任课教师</h3></td>
    <tr>
        <s:iterator value="studentCourseEntityList" var="c">
    <tr>
        <td>${c.courseName}</td>
        <td>${c.studentCourseCredit}</td>
        <td>${c.studentCourseScore}</td>
        <td>${c.courseTime}</td>
        <td>${c.courseTeacher}</td>
    <tr>
        </s:iterator>
</table>

</body>
</html>
