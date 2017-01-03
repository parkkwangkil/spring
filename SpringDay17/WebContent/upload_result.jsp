<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>업로드 완료</h3>
	원래 이름 :
	<b> ${originalName}</b>
	<br> 서버에 저장된 경로 :
	<b>${savePath}</b>
	<br> title 피라미터 :
	<b>${title}</b>
	<a href="uploadForm.do">업로드 </a>
	<a href="download.do">다운로드</a>



</body>
</html>