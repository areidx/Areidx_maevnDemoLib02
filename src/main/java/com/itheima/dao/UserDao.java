package com.itheima.dao;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @Auther: areidx
 * @Date: 20/10/29 17:32
 * @Description:
 */
public interface UserDao {
	public List<User> findAll();
}
