package test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class RetainAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {22,6,7,2,17,5};
		int[] b = {2,5,9,11,10,3,7};  // {}

		RetainAllTest test = new RetainAllTest();
		test.commonElements(a, b);

	}

	
	public void commonElements(int a[], int b[]){
	    
	    /*List<Integer> aList = new ArrayList<Integer>(Arrays.asList(a));
	    List<Integer> bList = new ArrayList<Integer>(Arrays.asList(b));*/
		
		List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
	    List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
	    
	    int highest2 = Arrays.stream(b).reduce(Integer::max).orElseThrow(NoSuchElementException::new);
	    int highest = Arrays.stream(a).sum();
	    
	    System.out.println(highest2);
	    System.out.println(highest);
	    
	    aList.retainAll(bList);
	   
	    for(int i:aList){
	        System.out.println(i);
	    } 

	}
}
