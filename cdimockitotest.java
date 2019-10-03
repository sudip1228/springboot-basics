package cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
//spring unit testing with mockito
	public class cdimockitotest {
	
	
			//Inject Mock
			@InjectMocks
			somecdibusiness cdi;
			
			//create mock
			@Mock
			somecdidao damock;
			@Test
			public void testbasicscenario() {
				
				Mockito.when(damock.getdata()).thenReturn(new int [] {2,4});
				
				assertEquals(4,cdi.findgreatest());
			}
			
			@Test
			public void testbasicscenario_noelements() {
				
				Mockito.when(damock.getdata()).thenReturn(new int [] {});
				
				assertEquals(Integer.MIN_VALUE,cdi.findgreatest());
			}
			
			@Test
			public void testbasicscenarioequal_elements() {
				
				Mockito.when(damock.getdata()).thenReturn(new int [] {2,2});
				
				assertEquals(2,cdi.findgreatest());
			}

	}
	
	
	


