package crudutil;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Util {
	
//	¹¤¾ß°ü
   public static  SqlSessionFactory  getSession() throws IOException{
	   String  rs="config.xml";
		Reader rd=     Resources.getResourceAsReader(rs);
		   SqlSessionFactory sf=  new   SqlSessionFactoryBuilder().build(rd);
		   
	   return sf;
	   
   }
}
