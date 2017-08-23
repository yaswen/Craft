package com.ysw.craft.pojos;



import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;
	private Integer gold;
	private Integer power;
	/*默认构造方法*/
	public User(){
	}
	/*根据属性创建构造方法*/
	public User(String userName,Integer gold,Integer power){
		this.userName=userName;
		this.gold=gold;
		this.power=power;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getGold() {
		return gold;
	}
	public void setGold(Integer gold) {
		this.gold = gold;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	
	
	
}
