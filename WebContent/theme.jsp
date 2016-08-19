<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Theme</title>
</head>
<body>
	在struts.xml中控制theme,默认为xhtml，可以设置为：simple/css_html/ajax
	<ol>
		<li>
			<s:form>
				<div class="formFieldError">
				<s:fielderror />
				</div>
				<s:textfield name="aaa"></s:textfield>
			</s:form>
		</li>	
		<s:debug></s:debug>
	</ol>
</body>
</html>