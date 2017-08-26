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

public class SecondAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*用户名密码*/
	private String userName;
	private String password;
	public String getUserName(){
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//声明request对象
	private HttpServletRequest request;
	//重写ServletRequestAware中的方法
	public void setServletRequest(HttpServletRequest request){
		this.request=request;
	}
	/**
	 * 调用业务逻辑方法，控制业务流程
	 */
	public String execute(){
		ActionContext ctx =ActionContext.getContext();
		Integer num=(Integer)ctx.getApplication().get("num");
		if(num==null){
			num=1;
		}else{
			num++;
		}
		ctx.getApplication().put("num", num);
		return "sec";
	}
	//shiwen增加测试用
	public String sec(){
		ActionContext ctx =ActionContext.getContext();
		Integer num=(Integer)ctx.getApplication().get("num");
		if(num==null){
			num=-1;
		}else{
			num--;
		}
		ctx.getApplication().put("num", num);
		return "sec";
	}
	public void ajaxtest() throws IOException{
		
		

	        HttpServletResponse response = ServletActionContext.getResponse();
	        PrintWriter writer = response.getWriter();
	        writer.print("hello " + userName);
	        writer.flush();
	        writer.close();
	    
	}
	}
