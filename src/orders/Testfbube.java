package orders;

import java.io.IOException;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import crudutil.Util;

public class Testfbube {
	@Test
	public void testorder() throws IOException{
//		查一个   测试字段和实体类成员变量不一致
	         SqlSessionFactory factory=  	Util.getSession();
	           SqlSession session=       factory.openSession(true);
		     String state="orders"+".selectOrder";
		   Orders   order=  session.selectOne(state,1);
		    System.out.println(order);
	}
}
