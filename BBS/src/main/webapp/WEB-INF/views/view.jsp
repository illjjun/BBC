<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
td,th{border: 1px solid black;}
</style>
<body>
<form method=post action="/ncs7/write" id=frmWrite>
   <table style='border-collapse:collapse;'>
      <tr><td>제목</td><td><input type=text value="${post.title }" readonly></td></tr>
      <tr><td>작성자</td><td><input type=text value="${post.name }" readonly></td></tr>
      <tr><td>내용</td><td><textarea name=content readonly>${post.content }</textarea></td></tr>
      <tr>
      <td colspan=2>
      	<input type=button id=btnCancel name=btnCancel value='돌아가기'>
      	</td>
      	</tr>
   </table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.on('click','#btnCancel',function(){
	document.location='/ncs7/list';
	return false;
})
</script>
</html>