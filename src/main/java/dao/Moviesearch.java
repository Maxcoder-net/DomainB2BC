package dao;

import java.util.Date;
import java.util.List;

import model.Movies;

public interface Moviesearch extends RdsInstanceConfigurer {
	
	
	public default List<Movies> Search(Date dt) {
		

	@Bean
	public RdsInstanceConfigurer.RdsInstanceConfigurerBeanPostProcessor instanceconfigure () {
		
		return () -> TomcatJdbcDataSourceFactory dataSourceFactory = 
                								new TomcatJdbcDataSourceFactory();
  dataSourceFactory.setInitialSize(10);
  dataSourceFactory.setValidationQuery("SELECT movies from RDS where date => 'dt'");
  return dataSourceFactory;
	
	
	}
		
		
	

}
