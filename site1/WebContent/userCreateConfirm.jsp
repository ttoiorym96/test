<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー登録確認画面</title>
</head>
<body>
  <div>
  	<h3>ユーザー登録情報確認</h3>
  </div>
  <s:if test="errorMessage != ''">
  	<s:property value="errorMessage"/>
  </s:if>
  <table>
  	<s:form action="UserCreateCompleteAction">
  		<tr>
  			<td>
  				<label>ユーザーID</label>
  			</td>
  			<td>
  				<s:property value="id" escape="false"/>
  			</td>
  		</tr>
  		<tr>
  			<td>
  				<label>パスワード</label>
  			</td>
  			<td>
  				<s:property value="password" escape="false"/>
  			</td>
  		</tr>
  		<tr>
  			<td>
  				<label>ユーザー名</label>
  			</td>
  			<td>
  				<s:property value="name" escape="false"/>
  			</td>
  		</tr>
  		<tr>
  			<td>
  				<input type="submit" value="登録"/>
  			</td>
  		</tr>
  	</s:form>
  </table>
  <s:form action="UserCreateAction">
    <input type="submit" value="戻る"/>
  </s:form>
</body>
</html>