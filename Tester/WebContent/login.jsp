<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>

<div>
	<h3>ホーム画面</h3>
</div>
<div>
	<s:form action="LoginAction">
		<div>
			<span>ユーザー名<s:textfield name="loginUserId"/></span>
		</div>
		<div>
			<span>パスワード<s:password name="loginPassword"/></span>
		</div>
		<div>
			<s:submit value="ログイン"/>
		</div>
	</s:form>
</div>

</body>
</html>