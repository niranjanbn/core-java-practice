package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {22,6,7,2,17,5};
		Integer[] b = {2,5,9,11,10,3,7};  // {}

		PrimaryNumber test = new PrimaryNumber();
		//test.commonElements(a, b);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20,23);
        // Prime number 
    System.out.println(numbers.stream()
                             .filter(test::isPrime)
                             .collect(Collectors.toList()));

		}
		public void commonElements(Integer a[], Integer b[]){
		    
		    List<Integer> aList = Arrays.asList(a);
		    List<Integer> bList = Arrays.asList(b);
		    
		    aList.retainAll(bList);
		   
		    for(int i:aList){
		        System.out.println(i);
		    } 

		}
		
		 public  boolean isPrime(int number) {
		        /*for (int i = 2; i <= number / 2; i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        return true;*/
			 	return IntStream.rangeClosed(2, number/2).noneMatch(x-> number%x == 0);
			 
			 
		    }

}
