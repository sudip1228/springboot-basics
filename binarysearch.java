package basics;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//it is a annotation.It indicates the beans.
//@Scope("prototype")//creates new beans every time.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//it is good practice but same as above.scopesingleton is a default which create a single instance every time.
public class binarysearch {
	@Autowired//autowired means binarysearch depends upon sortalgorith, or sortalgorith is a dependency for binarysearch.
	//example of loosely coupled.the autowiring of binarysearch is done with the bubblesearch algorithm not the sortalgorith,because
	//the "component" annotation is given to bubblesortalgorithm which implements sortalgorith, not to the sortalgorith.
	//if there are two components implementing the same interface,then omit one component or use "@primary" annotation.
	//there are two types of dependencies i.e optional and mandatory.without mandatory dependency, the class cannot function but without the optional dependency,a class can function.
	//@Qualifier("bubble")//priority is given to quicksort.
	private sortalgorith quickSort;//no need to put primary annotation if you use variable name but @primary has higher priority over the name of the variable.The variable name should be same as class name. 
	//private sortalgorith sort;
	
	/*
	public binarysearch(sortalgorith s) {//it is a constructor injection.
		super();
		this.s = s;
	}
*/
	private Logger log= LoggerFactory.getLogger(this.getClass());
/*
	public void setS(sortalgorith s) {//it is a setter injection.if you dont put setter or constructor,the autowiring is done automatically with setter injection.
	//mentioning setter or not mentioning setter is same as the spring automatically do setter injection.
		this.s = s;
	}
*/


	//assume it is binarysearch algorithm.
	public int Binarysearch(int[] a, int b)//this is not a constructor.
	{
		
		//bubblesortalgorithm c= new bubblesortalgorithm();..this class was depending upon bubblesort algorithm class for output.
		int [] sorted=quickSort.sort(a);
		System.out.println(quickSort);
		
		return 3;
	}
	/*
	//logging.level.org.springframework= debug
	@PostConstruct //it is called automatically before the beans are printed as a output in main method which means it is called post construction or creation beans.see basic runner class for more info.it can be used to initialize the beans.
	public void postconstruct() {
		log.info("post construct");
	}
	@PreDestroy//it is called just before the bean is removed out of context.
	public void predestroy() {//works when it is in same package inside @SpringBootApplication.
		log.info("predestroy");
	}
	
	*/
}
