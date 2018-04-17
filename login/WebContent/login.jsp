<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>

<%-- s:タグはStrutsフレームワークを使う為の専用タグ。HTMLタグに書き足す。 --%>
<%-- 「<s:form>」で囲まれたタグに入力されたaction属性で指定したクラスに渡される。今回はActionクラス。 --%>
<s:form action="LoginAction">
<s:textfield name="name" />
<s:password name="password" />
<s:submit value="ログイン" />
</s:form>

</body>
</html>