package ua.farmercoop.logic.test;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil 
{
    private static SqlSessionFactory factory;

    private MyBatisUtil() {}
 
    static
    {

    	  Reader reader = null;
          try {
        	  String resource="config/myBatisConfig.xml";
        	  
              reader = Resources.getResourceAsReader(resource);
          }
          
          catch (IOException e) {
          System.out.println("resourse not found \n"+e.toString());
        	  throw new RuntimeException(e.getMessage());
          }
          factory = new SqlSessionFactoryBuilder().build(reader);
    }
 
    public static SqlSessionFactory getSqlSessionFactory() 
    {
        return factory;
    }
}