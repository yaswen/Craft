package com.ysw.craft.demo;
import com.ysw.craft.dao.UserDao;
import com.ysw.craft.pojos.User;
import com.ysw.craft.action.GaAction;

public class UserDe2mo {
	public static void main(String[] args){
		User user=new User("shiwen",100,20);
		/*int i=user.getGold();
		i+=100;
		user.setGold(i);
*/		UserDao.addUser(user);//持久化
	}
	
}
