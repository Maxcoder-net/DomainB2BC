package dao;

public class CustomRdsInstanceConfigurer implements RdsInstanceConfigurer {
 {
	
	
	@Bean
	public RdsInstanceConfigurer.RdsInstanceConfigurerBeanPostProcessor instanceconfigure () {
		
		return () -> TomcatJdbcDataSourceFactory dataSourceFactory = 
                								new TomcatJdbcDataSourceFactory();
  dataSourceFactory.setInitialSize(10);
  dataSourceFactory.setValidationQuery("SELECT 1 FROM DUAL");
  return dataSourceFactory;
	}

}
