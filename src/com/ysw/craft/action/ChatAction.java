package com.ysw.craft.action;

import java.util.ArrayList;
import java.util.List;

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
		//重写ServletRequestAware中的方法
		public void setServletRequest(HttpServletRequest request){
			this.request=request;
		}
		public String execute(){
			System.out.println("开始聊天action");
			String t=text;
			System.out.println(t + "代表着："+text);
			//获得session对象
			HttpSession session=request.getSession();
			System.out.println("成功获取session");
			if(null!=session.getAttribute("ChatText")){
				List<String> list=(List<String>) session.getAttribute("ChatText");
			}else{
				List<String> list=new ArrayList();
				list.add("聊天记录："+"<br>");
				session.setAttribute("ChatText", list);
			}
			List<String> list=(List<String>) session.getAttribute("ChatText");
			System.out.println("成功获取list"/*+list.get(0)*/);
			if(list.size()==0 || list==null){
				list.add("聊天记录："+"<br>");
			}
			list.add(t+"<br>");
			//将聊天内容保存到session中
			session.setAttribute("ChatText", list);
			return "success";
		}
}
