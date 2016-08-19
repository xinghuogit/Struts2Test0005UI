/*************************************************************************************************
 * 版权�?�? (C)2015
 * 
 * 文件名称：TagsAction.java
 * 内容摘要：TagsAction.java
 * 当前版本：TODO
 * �?        者：李加�?
 * 完成日期�?2016�?8�?19�? 上午9:47:34
 * 修改记录�?
 * 修改日期�?2016�?8�?19�? 上午9:47:34
 * �?   �? 号：
 * �?   �? 人：
 * 修改内容�?
 ************************************************************************************************/
package com.struts2.theme;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：TagsAction.java
 * @contents 内容摘要�?
 */
public class ThemeAction extends ActionSupport {
	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		this.addFieldError("fielderror.test", "feil");
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
