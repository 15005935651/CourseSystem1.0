<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>学生选课系统</title>
</head>
<body>

课程编号:${courseID}<br>
课程名称:${courseName}<br>
开课时间:${course_time}<br>
课程教室:${course_classroom}<br>
任课教师:${course_teacher}<br>
课程学分:${course_credit}<br>
限选人数:${course_num_of_stu}<br>

<table style="width:100%;border:1px white solid">
    <tr bgcolor="#4F81BD"style="color: #fff;">
        <th style="text-align: center"><%=columns[0]%></th>
        <th style="text-align: center"><%=columns[1]%></th>
    </tr>
    <c:forEach items="${list}" var="row" varStatus="status">
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">
            <td align="center">${status.current.key}</td>
            <td align="center">${row.value}</td>
        </tr>
    </c:forEach>
</table>





</body>
</html>
