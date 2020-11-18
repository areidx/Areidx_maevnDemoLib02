package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Auther: areidx
 * @Date: 20/10/29 18:13
 * @Description:
 */
public class TestUserDao {
	@Test
	public void findAll() throws Exception {
		//1. 让mybatis框架去加载主配置文件
		//1.1 将主配置文件SqlMapConfig.xml转换成字节输入流
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		//1.2 创建一个SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		//1.3 使用factoryBuilder对象加载字节输入流，创建SqlSessionFactory对象
		SqlSessionFactory sessionFactory = factoryBuilder.build(is); //使用了构建者模式
		//1.4 使用sessionFactory对象创建出sqlSession对象
		SqlSession sqlSession = sessionFactory.openSession(); //使用了工厂模式

		//2. 使用sqlSession对象创建出UserDao接口的代理对象
		UserDao userDao = sqlSession.getMapper(UserDao.class); //使用了动态代理
		List<User> userList = userDao.findAll();
    for (User user : userList) {
      //
      System.out.println(user);
      //关闭资源
	    sqlSession.close();
	    is.close();
    }
	}
}
