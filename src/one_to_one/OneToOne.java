package one_to_one;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import crudutil.Util;

public class OneToOne {
	
	
	@Test
	public void onetoonetest() throws Exception{
		
		
		
		     SqlSessionFactory  sf= Util.getSession();
		     SqlSession session=sf.openSession(true);
		     String statement="OneToOneMapper.selectone";
		     Object o = session.selectOne(statement, 1);
		     System.out.println(o);
		     
        
		
		
		
		
		
		
		
		
	}
}
