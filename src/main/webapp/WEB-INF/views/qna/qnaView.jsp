<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board} View</h1>
	
	<h3>Title: ${view.title}</h3>
	<h3>Write: ${view.writer}</h3>
	<h3>Age: ${view.age}</h3>
	
	<a href="./qnaList">Qna List</a>
	<a href="../">Home</a>
</body>
</html>