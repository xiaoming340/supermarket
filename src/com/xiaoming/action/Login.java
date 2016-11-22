package com.xiaoming.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	
	private String username;
	private String password;

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}

	public String execute() throws Exception
	{
		if (getUsername().equals("xiaoming") && getPassword().equals("111111") ) {
			ActionContext.getContext().getSession().put("user" , getUsername());
			return SUCCESS;
		}
		else
			return ERROR;
	}
}
