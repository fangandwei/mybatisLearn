package one_to_many;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import crudutil.Util;
public class One_To_Many {

	@Test
	public void testoneToMany() throws IOException{
		    SqlSessionFactory sF = Util.getSession();
		       SqlSession session = sF.openSession(true);
		       String sta="onetomany.getinf";
		         Object o=        session.selectOne(sta,1);
		    System.out.println(o);
		
	}
	
	
	

}
