<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<body>
<form action="/Edemo/update.action" method="post">
<input type="hidden" name="qid" value="${qjlist.qid}">
<input type="hidden" name="eid" value="${qjlist.emp.eid}">
申请人<input type="text" value="${qjlist.emp.ename}" disabled="disabled">
开始日期<input type="text" name="startdate" value="<f:formatDate value="${qjlist.startdate }"/>">
结束日期<input type="text" name="enddate" value="<f:formatDate value="${qjlist.enddate }"/>">
事由<input type="text" name="reason" value="${qjlist.reason}">
<input type="submit" value="保存">
</form>
</body>
</html>