<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>join_success.jsp</title>
</head>
<body>
<h2>ȸ�������� �Ϸ�Ǿ����ϴ�.</h2>
	<table>
		<tr>
			<th>���̵�</th>
			<th>��ȭ��ȣ</th>
			<th>�̸���</th>
		</tr>
		<tr>
			<td>${joinMemberInfo.id}</td>
			<td>${joinMemberInfo.phone}</td>
			<td>${joinMemberInfo.email}</td>
		</tr>
	</table>

</body>
</html>