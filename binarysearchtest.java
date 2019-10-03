package basics;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import runner.basics_runner;

//here we are testing the binarysearch class which is in basics package using springframework.
//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=basics_runner.class)
public class binarysearchtest {
//get this bean from the context
	@Autowired
	binarysearch binary;
	@Test
	public void testbasicscenario() {
		//call method in binarysearch.
		int result= binary.Binarysearch(new int[] {}, 5);
		
		//check if the value is correct.
		assertEquals(3,result);
	}
//note:try to avoid unit test with spring.just use mockito or junit without spring.
}
