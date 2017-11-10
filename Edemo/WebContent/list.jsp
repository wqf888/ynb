<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<form action="/Edemo/load.action" method="post">
姓名<input type="text" name="ename">

部门<select name="did">
<option value="0">请选择</option>
<c:forEach items="${deptlist}" var="d">
<option value="${d.did}">${d.dname }</option>
</c:forEach>
</select>
<input type="submit" value="查询">
</form>

<table border="1"><tr><td>账号</td><td>部门</td><td>开始日期</td><td>结束日期</td><td>事由</td><td>操作</td></tr>
<c:forEach items="${qjlist}" var="qj">
<tr><td>${qj.emp.ename}</td><td>${qj.emp.dept.dname}</td><td>${qj.startdate}</td><td>${qj.enddate}</td><td>${qj.reason}</td><td><a href="/Edemo/toadd.action">添加</a>  <a href="/Edemo/delete.action?qid=${qj.qid}">删除</a>  <a href="/Edemo/toupdate.action?qid=${qj.qid}">修改</a></td></tr>
</c:forEach>
</table>
</body>
</html>