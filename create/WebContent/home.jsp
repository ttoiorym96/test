<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home画面</title>
</head>
<body>
  <div>
    <h3>ようこそ！</h3>
    <p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
    <p>ホーム画面に<a href='<s:url action="HomeAction"/>'>戻る</a></p>
  </div>
</body>
</html>