<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty sessionScope.loginId}">
		${sessionScope.loginId} �� �α��� �����Դϴ�.
		<a href="logout.do">[�α׾ƿ�]</a>
	</c:if>
	<c:if test="${empty sessionScope.loginId}">
		�α��� ������ �����ϴ�.<br>
		<a href="loginform.do">[�α��� �Ϸ�����]</a>
	</c:if>
</body>
</html>