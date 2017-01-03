<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
로그인 완료
<b>${sessionScope.loginId}</b> hi
<a href="loginStatus.do">[로그인  상태보기]</a>
<a href="boardList.do">[게시판 이동]</a>
<a href="logout.do">[로그아웃]</a>
</body>
</html>