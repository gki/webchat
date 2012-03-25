<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"  %>
<%@ taglib uri="http://struts.apache.org/tags-bean"  prefix="bean"  %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>webChat</title>
</head>
<body>
<h1>WebChat</h1>
<hr/>
<h2>発言フォーム</h2>
<html:form action="/SaveMessage">
  <table>
  <tr><th>名前</th><td><html:text property="name" style="width:256" /></td></tr>
  <tr><th>メッセージ</th><td><html:text property="message" style="width:256" /></td></tr>
  <tr><td colspan="2" aligh="right"><html:reset value="リセット" /><html:submit value="送信" /></td></tr>
  </table>
</html:form>
</hr>
<h2>メッセージ</h2>
<html:link action="/ShowMessages">更新</html:link>
<table border="1" cellspacing="0" cellpadding="3">
  <tr><th>日付</th><th>名前</th><th>メッセージ</th></tr>
<logic:iterate id="message" name="messages" scope="request">
  <tr>
    <td><bean:write name="message" property="date"/></td>
    <td><bean:write name="message" property="name"/></td>
    <td><bean:write name="message" property="message"/></td>
  </tr>
</logic:iterate>
</table>
</body>
</html:html>