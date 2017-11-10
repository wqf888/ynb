<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Edemo/add.action" method="post">

名字<select name="eid">
<c:forEach items="${emplist}" var="e">
<option value="${e.eid}">${e.ename}</option>
</c:forEach>
</select><br>
请假日期<input type="text" name="startdate"><br>
结束日期<input type="text" name="enddate"><br>
事由<input type="text" name="reason"><br>
保存<input type="submit" value="保存">
</form>
</body>
</html>