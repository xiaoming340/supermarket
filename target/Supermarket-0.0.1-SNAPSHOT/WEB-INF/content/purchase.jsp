<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.xiaoming.action.SystemConstant" %>
<%@ page import="java.lang.*" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>purchase</title>   
</head>

<link href="${pageContext.request.contextPath}/images/purchase.css" rel="stylesheet" type="text/css">

<body>
  <%@include file="menu.jsp"%> 
  
  <br/>
  
  <table width="800px" cellSpacing="20px">
  <tr>
  
    <td>
      <div style="overflow: scroll; height: 600px; width:350px;">
	  <table width="300px" border="0" align="center" cellspacing="1px" bgcolor="#cccccc">
	    <tr class="px10" height="20px">
		  <td><b>id</b></td>
		  <td><b>name</b></td>
	    </tr>
	    
	    <s:iterator value="goods" status="index">
	 	  <s:if test="#index.odd == true">
		  <tr onclick=clickrow(this) style="background-color:#ff0000;" height="20px">
		  </s:if> 
		  <s:else> 
		  <tr onclick=clickrow(this) style="background-color:#00ff00;" class="px9" height="20px">
		  </s:else>
		  
		  <td><s:property value="id"/></td>
		  <td><s:property value="name"/></td>
	      </tr>
	    </s:iterator>
	  </table>
	</div>
    </td>
    
  </tr>
  </table>
  
</body>
</html>

