package ua.farmercoop.logic.domain.mapping;

import java.io.IOException;
import java.io.Reader;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.cdi.SessionFactoryProvider;


/*
* 25.12.17
* @autor Oleksandr Taniuk
*/


public class SqlSessionFactoryProducer {

//  @Produces
  //@ApplicationScoped
  //@SessionFactoryProvider 	
  public SqlSessionFactory produceFactory() {
    String resource = "ua/farmercoop/logic/domain/maping/myBatisConfig.xml";
    
    Reader reader = null;
	try {
		reader = Resources.getResourceAsReader(resource);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    return sqlSessionFactory;
  }

}