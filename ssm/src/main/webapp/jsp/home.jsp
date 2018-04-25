<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/globle.css" type="text/css" />
<script type="text/javascript" src="/resources/js/jquery-3.2.1.js" ></script>
</head>
<body>
Hello World!!!
<form action="/user/userlist" method="post">
<div>login</div>
<div><input type="text" name="userId" value="" />
	<input type="submit" value="登 陆" />
</div>
</form>

<form action="/user/userlist2" method="post">
<div>login</div>
<div><input type="text" name="userId" value="" />
	<input type="submit" value="登 陆2" />
</div>
</form>

<form action="/user/alluserlist" method="post">
<div>login</div>
<div><input type="text" name="userName" value="" />
	<input type="submit" value="登 陆3" />
</div>
</form>

<form action="/user/usermap" method="post">
<div>login</div>
<div><input type="text" name="userId" value="" />
	<input type="submit" value="登 陆4" />
</div>
</form>
</body>
</html>