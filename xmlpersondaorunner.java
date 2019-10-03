package runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xml.xmlpersonDAO;


public class xmlpersondaorunner {
	private static  Logger log= LoggerFactory.getLogger(xmlpersondaorunner.class);
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("appcontext.xml");
		
		
		xmlpersonDAO p1 =   appcontext.getBean(xmlpersonDAO.class);//creating beans.
		log.info("beans loaded->{}",(Object)appcontext.getBeanDefinitionNames());//gives you all the available beans.
		
		System.out.println(p1);
		System.out.println(p1.getxmlJdbc());
			appcontext.close();
		
	}

}
