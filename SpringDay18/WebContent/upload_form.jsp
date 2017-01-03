<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		var fileCount = 1;

		$('button')
				.click(
						function() {
							var inputElement = '첨부파일 : ';
							inputElement += '<input type="file" ';
		inputElement += 'name="fileList['+fileCount+']"><br>';
							fileCount++;
							$('input[type="submit"]').before(inputElement);
						})
	})
</script>
</head>
<body>
	<button>파일추가</button>
	<br>
	<hr>

	<form action="uploadFile.do" method="post" enctype="multipart/form-data">
		<input type="text" name="title" size="10"><br> 
		<input type="file" name="fileList"><br> 
		<input type="submit" value="업로드"><br>

	</form>

</body>
</html>