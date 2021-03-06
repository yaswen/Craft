package com.ysw.craft.dao;

import org.hibernate.boot.registry.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ysw.craft.pojos.User;
import com.ysw.craft.util.HibernateUtils;

public class UserDao {
	// *user对象持久化**增加*/
	public static void addUser(User user) {
		Session session = HibernateUtils.getSession();// 获取Session对象
		Transaction trans = session.beginTransaction();// 开启事务
		session.save(user);// 保存对象
		trans.commit();// 提交事务
		HibernateUtils.closeSession();// 关闭Session
	}

	/**
	 * 根据id获取user对象
	 * @param id
	 * @return User类型对象
	 */
	public static User getUser(String id) {
		// 获取Session对象
		Session session = HibernateUtils.getSession();
		// 根据id获取Customer对象
		User user = (User) session.get(User.class, id);
		return user;
	}

	// *根据userName获取客户*/
	public static User getUserByUserName(String userName) {
		System.out.println("getuserbyusername:" + userName);
		Session session = HibernateUtils.getSession();
		String hql = "from User c where c.userName = :name";
		System.out.println("HQL语句："+hql);
		User user = (User) session.createQuery(hql)
				.setString("name", userName)//设置HQL语句中的name参数
				.setMaxResults(1)//设为获取单条结果
				.uniqueResult();
		return user;
	}
	// *user对象持久化**更新*/
	public static void updateUser(User user) {
		// 获取Session对象
		Session session = HibernateUtils.getSession();
		Transaction trans = session.beginTransaction();//开启事务
		session.update(user);//更新对象
		trans.commit();//提交事务
		HibernateUtils.closeSession();//关闭Session

	}
}
