package basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements sortalgorith {
//assume it is quick sort algorithm
	public int [] sort(int[] n)
	{
		System.out.println("quick sort ");
		return n;
	}
	
}
