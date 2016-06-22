<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ユーザー管理画面</title>
	</head>
	<body>
		<h1 align="center">ユーザーの一覧</h1>
		<table border="1" align="center">
			<tr>
				<th>ログインID</th>
				<th>名前</th>
				<th>支店名</th>
				<th>部署・役職名</th>
				<th>利用状況</th>
				<th>編集</th>
				<th>削除</th>
			</tr>
			<c:forEach items="${userList}" var="list">
				<tr>
					<td><c:out value="${list.loginId}" /></td>
					<td><c:out value="${list.name}" /></td>
					<td><c:out value="${list.branchName}" /></td>
					<td><c:out value="${list.positionName}" /></td>
					<td><c:out value="${list.userState}" /></td>
					<td><a href="${pageContext.
					request.contextPath}/management/settings/input/${list.id}/">編集</a>
					<td>削除</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>