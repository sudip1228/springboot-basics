package runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import properties.externalservice;


@Configuration
@ComponentScan("properties")
@PropertySource("classpath:app.properties")//it gives path to files.
public class propertiesrunner {

	
	public static void main(String[] args) {
		
	
		
		AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext(propertiesrunner.class);
		
		externalservice binary = appcontext.getBean(externalservice.class);//creating beans.
			System.out.println(binary.returnserviceurl());
}
}