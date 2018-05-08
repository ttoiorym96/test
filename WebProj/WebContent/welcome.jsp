<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME</title>
</head>
<body>
名前とパスワードを入力してください。
<s:form method="post" action="LoginAction">

<%-- <s:textfield>タグはテキスト入力フィールドの宣言タグ。
      name,value属性はinputタグと同様の意味を持つ。
      labelタグを使う事で、指定した文字列は入力する場所の左側に表示される。 --%>
<s:textfield name="username" label="ユーザー名"/>

<%-- <s:password>タグはパスワード入力フィールドの宣言タグ。
      name,valueタグはinputタグと同様の意味を持つ。
      labelタグを使う事で、指定した文字列は入力する場所の左側に表示される。 --%>
<s:password name="password" label="パスワード"/>
<s:submit value="送信"/>
</s:form>

</body>
</html>