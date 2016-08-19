/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：ThemeAction1.java
 * 内容摘要：ThemeAction1.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月19日 下午5:43:32
 * 修改记录：
 * 修改日期：2016年8月19日 下午5:43:32
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.theme;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：ThemeAction1.java
 * @contents 内容摘要：
 */
public class ThemeAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		this.addFieldError("fielderror.test", "wrong!");
		return SUCCESS;
	}
}