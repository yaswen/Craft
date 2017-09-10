package com.ysw.craft.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class ChatAction extends ActionSupport implements ServletRequestAware {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	// 声明request对象
	private HttpServletRequest request;
	// 声明session对象
	private HttpSession session;
	// 声明application对象
	private ServletContext application;

	// 重写ServletRequestAware中的方法
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
		this.application = session.getServletContext();
	}

	public String execute() {
		System.out.println("开始聊天action");
		String t = text;//用户刚说的话
		System.out.println("聊天action新增"+t);
		if (null != application.getAttribute("ChatTextList")) {
			//从application中取出ChatTextList，如果它不为空，那就赋给我们的list
			//List<String> list = (List<String>) application.getAttribute("ChatTextList");
		} else {
			//如果它为空，那我们的list就新建
			List<String> list = new ArrayList();
			list.add("聊天记录：");//并且写上标题
			application.setAttribute("ChatTextList", list);//然后存入application（好像没用）
		}
		
		List<String> list = (List<String>) application.getAttribute("ChatTextList");//初始化以后再次读取application中的
		System.out.println("成功获取list");
		/*if (list.size() == 0 || list == null) {
			list.add("聊天记录：" + "<br>");
		}*/
		list.add(t);//把刚拿到的聊天文字加进list
		// 将聊天内容保存到application中
		application.setAttribute("ChatTextList", list);
		String ct=(String)application.getAttribute("ChatText");
		if(ct==""||ct==null){
			ct="聊天记录：<br>";
		}
		ct+=t+"<br>";
		application.setAttribute("ChatText", ct);
		application.setAttribute("ChatIf", t);
		return "success";
	}
}
