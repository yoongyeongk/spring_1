<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="./resources/css/home.css">
</head>
<body>
<h1>
	Hello world!  Spring
</h1>


<P>  The time on the server is ${serverTime}. </P>

<a href="./notice/noticeList?name=notice">Go Notice</a>
<a href="./qna/qnaList?curPage=1">qna</a>

<h3>Master</h3>
<h3>git hub</h3>

</body>
</html>
