<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>login</title>
</head>

<link href="${pageContext.request.contextPath}/images/css.css" rel="stylesheet" type="text/css">

<body>
  <table width="720" align="center">
    <tr>
      <td>
        <div align="center">
          <s:form action="processLogin">
            <s:textfield name="username" label="Username"/>
            <s:textfield name="password" label="Password"/>
            <tr align="right"><td colspan="2"><s:submit value="Login" theme="simple"/></td></tr>
          </s:form>
        </div>    
      </td>
    </tr>
    <tr><td>
      <s:if test="tip!=null">
        <div align="center" class="error">
	  	  <s:property value="tip"/>
        </div>
      </s:if></td>
    </tr>
  </table>

</body>
</html>