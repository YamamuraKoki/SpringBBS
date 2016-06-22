<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<form:form modelAttribute="settingForm">
		<p>ログインID: <form:input path="loginId"/></p>
		<p>パスワード:</p>
		<p>パスワード（確認用）</p>
		<p>名前: <form:input path="name"/></p>
		<p>支店名:<form:input path="branchName"/></p>
		<p>部署・役職名<form:input path="positionName"/></p>
		<input type="submit">
	</form:form>
</body>
</html>