package com.xiaoming.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xiaoming.service.LoginService;

public class LoginAction extends ActionSupport {
	
	private LoginService loginService;
	private String username;
	private String password;
	private String tip;
	
	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

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
	
	public void setTip(String t) {
		this.tip = t;
	}
	
	public String getTip() {
		return tip;
	}

	public String execute() throws Exception
	{
		boolean ret = loginService.canLogin(username, password);
		if(!ret) {
			tip = "Password error or no privilege!";
			return ERROR;
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put(SystemConstant.USER, username);
		return SUCCESS;
	}
}




