package crud;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import mybatis_test1.User;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import crudutil.Util;


public class Testcrud {
//	增加
	 @Test
	public void testadd() throws Exception{
		 SqlSessionFactory sf=   Util.getSession();
		      SqlSession session=      sf.openSession();
		     String statem="crud.UserMapper"+".insertUser";
		     User user=new User();
		     user.setName("zs");
		     user.setAge("20");
		     session.insert(statem,user);
		     session.commit();
		     session.close();
	}
//	 删除
	@Test
	public void testdelete() throws IOException{
		 SqlSessionFactory sf=   Util.getSession();
	      SqlSession session=      sf.openSession();
		     String statem="crud.UserMapper"+".deleteUser";
		     User user=new User();
		     user.setName("zs");
		     session.insert(statem,user);
		     session.commit();
		     session.close();
		
	}
//	修改
	@Test
	public void testupdate() throws IOException{
		 SqlSessionFactory sf=   Util.getSession();
	      SqlSession session=      sf.openSession();
		     String statem="crud.UserMapper"+".updateUser";
		     User user=new User();
		     user.setId(9);
		     user.setName("zs");
		     user.setAge("22");
		     session.update(statem,user);
		     session.commit();
		     session.close();
	}
//	查一个
	@Test
	public void testselectone() throws IOException{
		 SqlSessionFactory sf=   Util.getSession();
	      SqlSession session=      sf.openSession();
		String sts="crud.UserMapper"+".selectOneUser";
		      User user=     session.selectOne(sts, 1);
		      System.out.println(user);
		      session.close();
	}
	
//	查所有
	@Test
    public void testselectall() throws IOException{
		 SqlSessionFactory sf=   Util.getSession();
	      SqlSession session=      sf.openSession();
		     String statem="crud.UserMapper"+".selectall";
		     List<User> list = session.selectList(statem);
		     System.out.println(list);
		     session.close();
    }
}
