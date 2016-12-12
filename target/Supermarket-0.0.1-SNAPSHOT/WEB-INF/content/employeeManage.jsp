<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.xiaoming.action.SystemConstant" %>
<%@ page import="java.lang.*" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>login</title>   
</head>

<link href="${pageContext.request.contextPath}/images/empmag.css" rel="stylesheet" type="text/css">

<body>
  <%@include file="menu.jsp"%> 
  
  <br/>
  
  <table width="800px" cellSpacing="20px" align="center">
  <tr>
  
    <td>
      <div style="overflow: scroll; height: 600px; width:550px;">
	  <table width="500px" border="0" align="center" cellspacing="1px" bgcolor="#cccccc">
	    <tr class="px10" height="20px">
		  <td><b>id</b></td>
		  <td><b>name</b></td>
		  <td><b>title</b></td>
		  <td><b>age</b></td>
		  <td><b>sex</b></td>
		  <td><b>password</b></td>
	    </tr>
	    
	    <s:iterator value="employees" status="index">  
	 	  <s:if test="#index.odd == true">
		  <tr onclick=clickrow(this) style="background-color:#ff0000;" height="20px">
		  </s:if> 
		  <s:else> 
		  <tr onclick=clickrow(this) style="background-color:#00ff00;" class="px9" height="20px">
		  </s:else>
		  
		  <td><s:property value="id"/></td>
		  <td><s:property value="name"/></td>
		  <td><s:property value="title"/></td>
		  <td><s:property value="age"/></td>
		  <td><s:property value="sex"/></td>
		  <td><s:property value="passwd"/></td>
	      </tr>
	    </s:iterator>   
	  </table>
	</div>
    </td>
  
    <td>
      <div class="ali_top">
	  <form action=employeeUpdate class="ali_top">
	  <table cellSpacing="10px">
	    <tr>
	      <td>ID</td>
	      <td><input id="id_id" name="etv.id" type="text" class="sim_input"/></td>
	    </tr>
	    <tr>
	      <td>name</td>
	      <td><input id="id_name" name="etv.name" type="text" class="sim_input"/></td>
	    </tr>
	    <tr>
	      <td>title</td>
	      <td><input id="id_title" name="etv.title" type="text" class="sim_input"/></td>
	    </tr>
	    <tr>
	      <td>age</td>
	      <td><input id="id_age" name="etv.age" type="text" class="sim_input"/></td>
	    </tr>
	    <tr>
	      <td>sex</td>
	      <td><input id="id_sex" name="etv.sex" type="text" class="sim_input"/></td>
	    </tr>
	    <tr>
	      <td>password</td>
	      <td><input id="id_password" name="etv.passwd" type="text" class="sim_input"/></td>
	    </tr>
	    <tr>
	      <td><input type="submit" value="Update"/></td>
	      <td><input type="submit" value="Insert" onclick="insert();"/></td>
	      <td><input type="submit" value="Delete" onclick="del();"/></td>
	    </tr>
	  </table>
	  </form>
	  </div>
	  
	  <div>
        <s:if test="tip!=null">
          <div align="center" class="error">
	  	    <s:property value="tip"/>
          </div>
        </s:if>
	  </div>
	</td>
	
  </tr> 
  </table>
  
  <script type="text/javascript">
  
  function insert()
  {
	//获取页面的第一个表单
	targetForm = document.forms[0];
	//动态修改表单的action属性
	targetForm.action = "employeeInsert";
  }
  function del()
  {
	//获取页面的第一个表单
	targetForm = document.forms[0];
	//动态修改表单的action属性
	targetForm.action = "employeeDelete";
  }
  
  function clickrow(tr){
	  var nodes = tr.childNodes;
	  document.getElementById("id_id").value = nodes[1].firstChild.nodeValue;
	  document.getElementById("id_name").value = nodes[3].firstChild.nodeValue;
	  document.getElementById("id_title").value = nodes[5].firstChild.nodeValue;
	  document.getElementById("id_age").value = nodes[7].firstChild.nodeValue;
	  document.getElementById("id_sex").value = nodes[9].firstChild.nodeValue;
	  document.getElementById("id_password").value = nodes[11].firstChild.nodeValue;
  }

  </script>
    
</body>