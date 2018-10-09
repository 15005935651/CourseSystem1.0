<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎${username}登录学生选课系统</title>
    <style>
        body {
            text-align: center
        }
    </style>
</head>
<body>

<h1>欢迎登录学生选课系统</h1>
<br/>
<br/>
<br/>
<table border="1" width="100%">

    <tr>
        <td><h3>课程名称</h3></td>
        <td><h3>课程名称</h3></td>
        <td><h3>开课时间</h3></td>
        <td><h3>课程教室</h3></td>
        <td><h3>任课教师</h3></td>
        <td><h3>课程学分</h3></td>
        <td><h3>限选人数</h3></td>
        <td><h3>是否选课</h3></td>
    <tr>
        <s:iterator value="courseEntityList" var="c">
    <tr>
        <td>${c.courseId}</td>
        <td>${c.courseName}</td>
        <td>${c.courseTime}</td>
        <td>${c.courseClassroom}</td>
        <td>${c.courseTeacher}</td>
        <td>${c.courseCredit}</td>
        <td>${c.courseNumOfStu}</td>
        <td>
            <select name="YesOrNo">
                <option value="false">否</option>
                <option value="true">是</option>
            </select>
        </td>
    <tr>
        </s:iterator>
</table>
<br/>
<br/>
<br/>
<button type="button"><h5>确定选课</h5></button>


</body>
</html>
