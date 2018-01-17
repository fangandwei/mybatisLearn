package mybatis_test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.jms.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class Test222 {
//	²éÒ»¸ö
	@Test
	public   void   mybatisTest() throws IOException{
		String resourse="config.xml";
	 Reader  re=   	Resources.getResourceAsReader(resourse);
         SqlSessionFactory sessionfac=      new  SqlSessionFactoryBuilder().build(re);		
		   SqlSession session = sessionfac.openSession();
		   
         String statement="mybatistest.UserMapper"+".selectUser";
         
                    Object one = session.selectOne(statement,2);
         System.out.println(one);
	}
        
	
	
	
	
 }
