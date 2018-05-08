<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%@page isErrorPage="true" %>
<%-- 「<%@page 属性名="値" %>」pageディレクティブを使うと、JSPファイルに関する設定を行うことが出来る。 --%>

<p>数値を入力してください。</p>
<button onclick="history.back()">戻る</button>
<br>
<p><%=exception %></p>
<%-- 「<%= Javaコード %>」スクリプト式を使うと、変数やメソッドの戻り値などを出力出来る。 --%>

<table border=1>
<tr>
<td><strong>エラーメッセージ</strong></td>
<td><%=exception.getMessage() %></td>
</tr>
<tr>
<td><strong>例外を文字列に変換</strong></td>
<td><%=exception.toString() %></td>
</tr>
<tr>
<td><strong>スタックトレース</strong></td>
<td><%exception.printStackTrace(new java.io.PrintWriter(out)); %>
</td></tr>
</table>

</body>
</html>