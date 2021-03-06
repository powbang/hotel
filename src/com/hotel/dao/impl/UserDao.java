package com.hotel.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hotel.dao.IUserDao;
import com.hotel.po.Admin;
import com.hotel.po.User;
import com.hotel.util.MyBatisUtil;

//对user接口的实现
public class UserDao implements IUserDao{

	//在user表里增加一个用户，返回boolean
	@Override
	public boolean addUser(User user) {
		SqlSession session = null;
		boolean isSuccess = false;
		try {
			session = MyBatisUtil.createSession();
			session.insert(User.class.getName()+".addUser", user);
			session.commit();
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return isSuccess;
	}

	//根据username查询user，返回一个user对象
	@Override
	public User qByUsername(String u_username) {
		SqlSession session = null;
		User user = null;
		try {
			session = MyBatisUtil.createSession();
			user =(User)session.selectOne(User.class.getName()+".qByUsername", u_username);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return user;
	}
	
	//根据username查询admin,返回一个admin对象
	@Override
	public Admin qAdByUsername(String ad_username) {
		SqlSession session = null;
		Admin admin = null;
		try {
			session = MyBatisUtil.createSession();
			admin = session.selectOne(User.class.getName()+".qAdByUsername", ad_username);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return admin;
	}
	
	//查询所有user用户
	@Override
	public List<User> qAllUser() {
		SqlSession session = null;
		List<User> list = null;
		try {
			session = MyBatisUtil.createSession();
			list = session.selectList(User.class.getName()+".qAllUser");
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return list;
	}

	//根据Id修改用户信息
	@Override
	public boolean updateUser(User user) {
		SqlSession session = null;
		boolean isSuccess = false;
		try {
			session = MyBatisUtil.createSession();
			session.update(User.class.getName()+".updateUser", user);
			session.commit();
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return isSuccess;
	}
	
	//根据Id删除用户信息
	@Override
	public boolean deleteUser(int u_id) {
		SqlSession session = null;
		boolean isSuccess = false;
		try {
			session = MyBatisUtil.createSession();
			session.delete(User.class.getName()+".deleteUser", u_id);
			session.commit();
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return isSuccess;
	}
	
	//查询所有的admin用户
	@Override
	public List<Admin> qAllAdmin() {
		SqlSession session = null;
		List<Admin> list = null;
		try {
			session = MyBatisUtil.createSession();
			list = session.selectList(User.class.getName()+".qAllAdmin");
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return list;
	}

	//在admin表里增加一个用户，返回boolean
	@Override
	public boolean addAdmin(Admin admin) {
		SqlSession session = null;
		boolean isSuccess = false;
		try {
			session = MyBatisUtil.createSession();
			session.insert(User.class.getName()+".addAdmin", admin);
			session.commit();
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return isSuccess;
	}
	
	//根据ID删除管理员信息
	@Override
	public boolean deleteAdmin(int ad_id) {
		SqlSession session = null;
		boolean isSuccess = false;
		try {
			session = MyBatisUtil.createSession();
			session.delete(User.class.getName()+".deleteAdmin", ad_id);
			session.commit();
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return isSuccess;
	}
	
	//根据ID修改管理员信息
	@Override
	public boolean updateAdmin(Admin admin) {
		SqlSession session = null;
		boolean isSuccess = false;
		try {
			session = MyBatisUtil.createSession();
			session.update(User.class.getName()+".updateAdmin", admin);
			session.commit();
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return isSuccess;
	}

	//根据姓名查询用户
	@Override
	public List<User> qByName(String u_name) {
		SqlSession session = null;
		List<User> list = null;
		try {
			session = MyBatisUtil.createSession();
			list = session.selectList(User.class.getName()+".qByName", u_name);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return list;
	}
	
	//根据用户名查询用户
	@Override
	public List<User> qUser(String u_username) {
		SqlSession session = null;
		List<User> list = null;
		try {
			session = MyBatisUtil.createSession();
			list = session.selectList(User.class.getName()+".qByUsername", u_username);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return list;
	}

	//根据手机号码查询用户
	@Override
	public List<User> qByTel(String u_tel) {
		SqlSession session = null;
		List<User> list = null;
		try {
			session = MyBatisUtil.createSession();
			list = session.selectList(User.class.getName()+".qByTel", u_tel);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
		return list;
	}

}
