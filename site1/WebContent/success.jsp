<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン成功画面</title>
</head>
<body>
	<div>
		<h3>ログインしました！</h3>
	</div>
	<div>
		<s:property value="name" escape="false"/>さん、ようこそ！
	</div>
	<div>
		<p>ホームに<a href='<s:url action="HomeAction"/>'>戻る</a></p>
	</div>
</body>
</html>