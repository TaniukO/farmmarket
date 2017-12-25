
/*
* 25.12.17
* @autor Oleksandr Taniuk
*/

public class SqlSessionFactoryProducer {

  @Produces
  @ApplicationScoped
  @SessionFactoryProvider
  public SqlSessionFactory produceFactory() {
    String resource = "ua/farmercoop/logic/domain/maping/myBatisConfig.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    return sqlSessionFactory;
  }

}