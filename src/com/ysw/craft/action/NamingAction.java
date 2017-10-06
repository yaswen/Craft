package com.ysw.craft.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.ysw.craft.demo.UTFDemo;
import com.ysw.craft.demo.rand;

public class NamingAction {
	private String xing;

	public String getXing() {
		return xing;
	}

	public void setXing(String xing) {
		this.xing = xing;
	}

	// 声明request对象
	private HttpServletRequest request;

	// 重写ServletRequestAware中的方法
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String execute() {
		System.out.println(xing);
		ActionContext ctx = ActionContext.getContext();
		String names = "";
		names+=rand.quming1(xing);
		System.out.println(names);
		ctx.getApplication().put("Names", names);
		return "success";
	}
}
