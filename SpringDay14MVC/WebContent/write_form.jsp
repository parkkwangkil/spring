<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="write.do" method="post">
		<table border="1">
			<tr>
				<td>제목 :</td>
				<td><input type="text" name="title"></td>
			</tr>

			<tr>
				<td>내용 :</td>
				<td><textarea rows="20" cols="5" name="content"></textarea></td>
			<tr>
				<td colspan="2"><input type="submit" value="작성완료"></td>
			</tr>
		</table>
	</form>
</body>
</html>