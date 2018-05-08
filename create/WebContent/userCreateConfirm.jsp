<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー情報確認画面</title>
</head>
<body>
  <div>
    <h3>登録内容は以下でよろしいですか？</h3>
  </div>
  <table>
    <s:form action="UserCreateCompleteAction">
      <tr>
        <td>
          <label>ユーザーID</label>
        </td>
        <td><s:property value="loginId" escape="false"/></td>
      </tr>
      <tr>
        <td>
          <label>ユーザーPass</label>
        </td>
        <td><s:property value="loginPass" escape="false"/></td>
      </tr>
      <tr>
        <td>
          <label>ユーザー名</label>
        </td>
        <td><s:property value="userName" escape="false"/></td>
      </tr>
      <tr>
        <td><input type="submit" value="送信"/></td>
      </tr>
    </s:form>
  </table>
  <div>
    <p>入力画面に<a href='<s:url action="UserCreateAction"/>'>戻る</a></p>
  </div>
  <div>
    <p>ホーム画面に<a href='<s:url action="HomeAction"/>'>戻る</a></p>
  </div>
</body>
</html>