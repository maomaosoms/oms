<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

table td {
	border: solid 1px black;
	text-align: center;
}

table th {
	border: solid 1px black;
	padding: 1em;
	font-size: 20px;
}

.tra {
	background-color: gray;
}

.head {
	width: 100%;
	display: inline-block;
}

.head ul li {
	border: 1px black solid;
	float: left;
}
</style>
<link rel="stylesheet" href="/resources/css/globle.css" type="text/css" />
<script type="text/javascript" src="/resources/js/jquery-3.2.1.js"></script>
</head>
<body>
	<div class="wrapper">
		<form action="/user/selectuser" method="post">
			<div class="head">
				<h1>用户查询</h1>
				<ul>
					<li><span>用户名</span><input type="text" name="userName"
						value="${userName}" /></li>
					<li><span>年龄</span><input type="text" name="age"
						value="${age}" /></li>
					<li><span>性别</span><input type="text" name="sex"
						value="${sex}" /></li>
					<li><input type="submit" value="查询" /></li>
				</ul>
			</div>
			<table>
				<tr>
					<th>用户ID</th>
					<th>用户名</th>
					<th>密码</th>
					<th>年龄</th>
					<th>性别</th>
				</tr>
				<c:forEach items="${users}" var="user" varStatus="obj">
					<tr <c:if test="${obj.index%2!=0}" >class="tra"</c:if>>
						<td>${user.userId}</td>
						<td>${user.userName}</td>
						<td>${user.password}</td>
						<td>${user.age}</td>
						<td>${user.sex}</td>
					</tr>
				</c:forEach>
			</table>
			<div>查询结果总数${userCount}</div>
		</form>
	</div>
</body>
</html>