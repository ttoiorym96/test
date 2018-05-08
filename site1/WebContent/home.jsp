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
    <h3>Welcome!!</h3>
  </div>
  <div>
    <a href='<s:url action="LoginAction"/>'>ログイン画面へ</a>
  </div>
  <div>
    <a href='<s:url action="UserCreateAction"/>'>新規ユーザー登録画面へ</a>
  </div>
</body>
</html>