package basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller//same a @component in springframework which is specifically used in spring mvc.
@Qualifier("bubble")
public class Bubblesortalgorithm implements sortalgorith {
//assume it is bubble sort algorithm
	
	public int [] sort(int[] n)
	{
		System.out.println("bubble");
		return n;
	}
	
}
