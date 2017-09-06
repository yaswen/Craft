package com.ysw.craft.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class ChatAction extends ActionSupport implements ServletRequestAware{
		private String text;
		
	
		
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		//声明request对象
		private HttpServletRequest request;
		//声明session对象
		private HttpSession session;
		//声明application对象
		private ServletContext application;
		//重写ServletRequestAware中的方法
		public void setServletRequest(HttpServletRequest request){
			this.request=request;
			this.session= request.getSession();
			this.application=session.getServletContext();
		}
		
		
		public String execute(){
			System.out.println("开始聊天action");
			String t=text;
			System.out.println(t + "代表着："+text);
			//获得session对象
			//HttpSession session=request.getSession();
			//System.out.println("成功获取session");
			if(null!=application.getAttribute("ChatText")){
				List<String> list=(List<String>) application.getAttribute("ChatText");
			}else{
				List<String> list=new ArrayList();
				list.add("聊天记录："+"<br>");
				application.setAttribute("ChatText", list);
			}
			List<String> list=(List<String>) application.getAttribute("ChatText");
			System.out.println("成功获取list"/*+list.get(0)*/);
			if(list.size()==0 || list==null){
				list.add("聊天记录："+"<br>");
			}
			list.add(t+"<br>");
			//将聊天内容保存到session中
			application.setAttribute("ChatText", list);
			return "success";
		}
}
