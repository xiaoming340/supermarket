<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>

<table width="300" align="center">
  <form action="login" method="post">
	<tr>
		<td>用户名:</td>
		<td><input type="text" name="username"/></td>
	</tr>
	<tr>
		<td>密&nbsp;&nbsp;码:</td>
		<td><input type="text" name="password"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="登录"/></td>
		<!-- <td><input type="submit" value="注册" onclick="regist();"/></td> -->
	</tr>
  </form>
</table>

</body>
</html>