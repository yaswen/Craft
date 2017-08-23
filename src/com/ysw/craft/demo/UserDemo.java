package com.ysw.craft.demo;

import com.ysw.craft.dao.UserDao;
import com.ysw.craft.pojos.User;

public class UserDemo {
	public static void main(String[] args){
		User user=UserDao.getUserByUserName("shiwen");
		int i=user.getGold();
		i+=10;
		user.setGold(i);
		UserDao.updateUser(user);
//		User user2=new User("atu",10,100);
//		UserDao.addUser(user2);
	}
}
