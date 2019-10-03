package runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import scope_of_beans.personDAO;

//import scope_of_beans.personDAO;

@Configuration//annotation for where the beans to search.it is automatically created by springframework.
@ComponentScan("scope_of_beans")
public class scoperunner {

	private static  Logger log= LoggerFactory.getLogger(scoperunner.class);//use logger instead for sysout which is a good practice.
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext(scoperunner.class);
		personDAO p1 = appcontext.getBean(personDAO.class);//creating beans.
		personDAO p2 = appcontext.getBean(personDAO.class);//creating beans.
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
