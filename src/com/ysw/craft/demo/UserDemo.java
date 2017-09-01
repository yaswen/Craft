package com.ysw.craft.demo;

import com.ysw.craft.dao.UserDao;
import com.ysw.craft.pojos.User;
/*意义重大的代码，诗文第一个实际demo*/
public class UserDemo {
	public static void main(String[] args){
		User user=UserDao.getUserByUserName("shiwen");//使用Dao类中的查询方法，获得名叫shiwen的User对象
		int i=user.getGold();//获得shiwen的金钱
		i+=100;//给金钱数目加10
		user.setGold(i);//将变量存入对象
		UserDao.updateUser(user);//更新对象持久化
	}
}
