<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>난몰러유</title>
</head>
<style>
td,th{border: 1px solid black;}
</style>
<body align=center>
   <table style='border-collapse:collapse;' align=center>
      <thead>
         <tr>
            <th>게시물번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성시각</th>
            <th>조회수</th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <c:forEach var="post" items="${alPost}">
               <tr onclick='document.location="/ncs7/view?id=${post.id}"'>
                  <td>${post.id}</td>
                  <td>${post.title}</td>
                  <td>${post.name}</td>
                  <td>${post.created}</td>
                  <td>${post.hit}</td>
               </tr>
            </c:forEach>
          
            
         
      </tbody>
   </table>
<input type=button value='게시글 작성' onclick='document.location="/ncs7/compose"' align=center>
</body>
</html>