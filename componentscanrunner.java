package runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import scope_of_beans.componentscan.componentpersonDAO;




//import scope_of_beans.personDAO;

@Configuration//annotation for where the beans to search.it is automatically created by springframework.
@ComponentScan("scope_of_beans.componentscan")
public class componentscanrunner {

	private static  Logger log= LoggerFactory.getLogger(componentscanrunner.class);//use logger instead for sysout which is a good practice.
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext(componentscanrunner.class);
		componentpersonDAO p1 = appcontext.getBean(componentpersonDAO.class);//creating beans.
		componentpersonDAO p2 = appcontext.getBean(componentpersonDAO.class);//creating beans.
		
		/*
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getJdbc());
		System.out.println(p2.getJdbc());
		*/
		
		log.info("{}", p1);	
		log.info("{}",p2);
		log.info("{}",p2.getJdbc());
		log.info("{}",p1.getJdbc());
		appcontext.close();
		
	}

}
