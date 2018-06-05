package test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ReversedPair {

	public int getReversedPairCount(int[] arr) {
		int count =0;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {count++;
				System.out.println("(" +arr[i]+","+ arr[j]+")");
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2, 3, 4};
		
		//Set<Integer> sortedList = Arrays.stream(arr).sorted().boxed().collect(Collectors.toSet());
		//for(int i:sortedList) System.out.println(i);
		
		ReversedPair reversedPair = new ReversedPair();
		System.out.println(reversedPair.getReversedPairCount(arr));

	}

}
