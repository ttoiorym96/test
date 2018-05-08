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
  </div>
  <div>
  <s:if test="errorMessage != ''">
      <s:property value="errorMessage" escape="false"/>
    </s:if>
  <s:form action="LoginAction">
    <p>ユーザー名：<input type="text" name="name"/></p>
    <p>パスワード：<input type="password" name="password"/></p>
    <s:submit value="送信"/>
  </s:form>
  </div>
</body>
</html>