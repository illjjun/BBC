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
<input type=hidden id=post_id value="${post.id }" readonly>
   <table style='border-collapse:collapse;'>
      <tr><td>제목</td><td><input type=text value="${post.title }" readonly></td></tr>
      <tr><td>작성자</td><td><input type=text value="${post.name }" readonly></td></tr>
      <tr><td>내용</td><td><textarea rows=10 cols=50 name=content readonly>${post.content }</textarea></td></tr>
      <tr>
      <td><input type=button id=btnCancel name=btnCancel value='목록보기'></td>
      <td><input type=button id=btnUpdate name=btnUpdate value='수정'>
      <input type=button id=btnDelete name=btnDelete value='삭제'></td>
      	</tr>
   </table>

</body>
<script src='https://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.on('click','#btnCancel',function(){
	document.location='/ncs7/list';
	return false;
})
.on('click','#btnDelete',function(){
	if(confirm('정말로 지우시겠습니까?')){
		document.location='/ncs7/delete?id='+$('#post_id').val();
	}
	return false;
})
.on('click','#btnUpdate',function(){
		document.location='/ncs7/update?id='+$('#post_id').val();
	return false;
})
</script>
</html>