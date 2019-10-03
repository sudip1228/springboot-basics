package runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cdi.somecdibusiness;


//import scope_of_beans.personDAO;

@Configuration//annotation for where the beans to search.it is automatically created by springframework.
@ComponentScan("cdi")
public class cdirunner {

	private static  Logger log= LoggerFactory.getLogger(cdirunner.class);//use logger instead for sysout which is a good practice.
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext(cdirunner.class);
		somecdibusiness p1 = appcontext.getBean(somecdibusiness.class);//creating beans.
		somecdibusiness p2 = appcontext.getBean(somecdibusiness.class);//creating beans.
		/*
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getJdbc());
		System.out.println(p2.getJdbc());
		*/
		
		log.info("{} dao-{}", p1,p1.getDao());	
		log.info("{}",p2);
		//System.out.println(p2);
		
	}

}
