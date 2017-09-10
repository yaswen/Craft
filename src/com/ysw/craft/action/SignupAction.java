package com.ysw.craft.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.ysw.craft.dao.UserDao;
import com.ysw.craft.pojos.User;
public class SignupAction extends ActionSupport implements ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*用户名密码*/
	private String userName;
	private String password;
	private String password2;
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
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
		
		System.out.println("----注册的用户信息----");
		System.out.println("用户名："+userName);
		System.out.println("密码："+password);

		User user=new User(userName,100,20);
		System.out.println("新建user成功,gold="+user.getGold());
		UserDao.addUser(user);
		System.out.println("添加user成功!");
		//获得session对象
			HttpSession session=request.getSession();
			//将用户名保存到session中
			session.setAttribute("CurUser", userName);
			return "ok";
		
	}
	//重写validate方法
	public void validate(){
		//验证用户输入
		if(this.userName == null || this.userName.equals("")){
			//将错误信息写入到Action累的FieldErrors中
			//此时Struts2框架自动返回INPUT视图
			this.addFieldError("userName", "用户名不能为空啊！");
			System.out.println("用户名为空了！");
		}
		if(UserDao.getUserByUserName(this.userName) != null) {
			this.addFieldError("userName", "用户名已存在");
			System.out.println("用户名已存在！"+this.userName);
		}
		
		if( !this.password.equals(this.password2)) {
			this.addFieldError("password2", "两次密码不同！");
			System.out.println("两次密码不相同！"+this.password+" "+this.password2);
		}
		if(this.password == null || this.password.length()<3){
			this.addFieldError("password", "密码不能为空且密码长度不能小于3啊！");
			System.out.println("密码为空了或者密码长度小于3了！");
		}
		
	}
	
}
