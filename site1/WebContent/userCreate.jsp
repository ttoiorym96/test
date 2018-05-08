<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新規ユーザー登録画面</title>
</head>
<body>
  <div>
    <h3>新規ユーザー登録</h3>
  </div>
  <div>
    <s:if test="errorMessage != ''">
      <s:property value="errorMessage" escape="false"/>
    </s:if>
    <table>
      <s:form action="UserCreateConfirmAction">
        <tr>
          <td>
            <label>ユーザーID</label>
          </td>
          <td>
            <input type="text" name="id" value=""/>
          </td>
        </tr>
        <tr>
          <td>
            <label>パスワード</label>
          </td>
          <td>
            <input type="text" name="password" value=""/>
          </td>
        </tr>
        <tr>
          <td>
            <label>ユーザー名</label>
          </td>
          <td>
            <input type="text" name="name" value=""/>
          </td>
        </tr>
        <tr>
          <td>
            <input type="submit" value="確認"/>
          </td>
        </tr>
      </s:form>
    </table>
  </div>
  <div>
    <p>ホームに<a href='<s:url action="HomeAction"/>'>戻る</a></p>
  </div>
</body>
</html>