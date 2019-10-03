package runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import basics.binarysearch;

@Configuration//using spring not spring boot instead of springbootapplication.
//@SpringBootApplication//annotation for where the beans to search.it is automatically created by springframework.
@ComponentScan("basics")//@ you can also  use ComponentScan only instead,its a same thing but here dont know why only componentscan is not working.
//@ComponentScan("basics")//search or creates beans with the give package name.
public class basics_runner {

//we should help and tell the spring framework to do following 3 things.
	//what are beans?..objects or instances are called beans. use @Component as a annotation. 
	//what are dependencies of a beans?use @Autowired as a annotation.
	//where to search for beans?
	
	//application context manages the beans created by springframework.so,we need to get beans from application context.
	
	public static void main(String[] args) {
		
	
	/*	
		binarysearch t= new binarysearch(new bubblesortalgorithm());//here we created two beans or object
		binarysearch u= new binarysearch(new quicksort());//here we again created two beans or instance or objects.
		
		t.Binarysearch(new int []{12, 4},3);//calls bubble
		u.Binarysearch(new int []{12, 4},3);//calls quicksort.
		*/
		/*int []h= new int[2];
		h[0]=2;
		h[1]=3;
		t.binarysearch(h,3);
		
		alternative,
		
		binary.Binarysearch(new int []{12, 4},3);
		*/
		
		AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext(basics_runner.class);
		
		binarysearch binary = appcontext.getBean(binarysearch.class);//creating beans.
		binarysearch binary1 = appcontext.getBean(binarysearch.class);
		binarysearch binary2 = appcontext.getBean(binarysearch.class);
		
		binarysearch[] b= {binary,binary1,binary2};
		for(binarysearch c:b) {
			System.out.println(c);//creates three unique instances.
		}
		int result=binary.Binarysearch(new int []{12, 4},3);
		
		System.out.println(result);//prints result of quicksort as it is primary component.
		appcontext.close();//you can also use just try clause to close the context.see lecture no 29 to how to close using try.
	}
	
}
