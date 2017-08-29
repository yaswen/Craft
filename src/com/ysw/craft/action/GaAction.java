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
import com.ysw.craft.dao.UserDao;
import com.ysw.craft.pojos.User;

public class GaAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*用户名密码*/
	private String userName;
	private	int gold;
	private int power;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	//声明request对象
	private HttpServletRequest request;
	//重写ServletRequestAware中的方法
	public void setServletRequest(HttpServletRequest request){
		this.request=request;
	}
	//买武装
	public String buy(){
		User user=UserDao.getUserByUserName(userName);
		Integer gold=user.getGold();
		Integer power=user.getPower();
		System.out.println("buy");
		gold-=10;
		power+=10;
		
		
		ActionContext ctx =ActionContext.getContext();
		
		ctx.getApplication().put("gold", gold);
		ctx.getApplication().put("power", power);
		return "success";
	}
	//卖武装
	public String sale(){
		User user=UserDao.getUserByUserName(userName);
		Integer gold=user.getGold();
		Integer power=user.getPower();
		System.out.println("sale");
		gold-=10;
		power+=10;
		
		
		ActionContext ctx =ActionContext.getContext();
		
		ctx.getApplication().put("gold", gold);
		ctx.getApplication().put("power", power);
		return "success";
	}
}