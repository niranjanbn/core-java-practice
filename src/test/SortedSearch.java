package test;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        
        /*int size = 0;
        
        Arrays.stream(sortedArray).forEach(x->{
            if(x<lessThan) size++;
        });
        
        return size;*/
    	
    	int loc = Arrays.binarySearch(sortedArray,lessThan);
        
    	/*if(loc > 0) return loc-1;
    	else return Math.abs(loc)-1;*/
        return (Arrays.stream(sortedArray).boxed().filter(x->x<lessThan).collect(Collectors.toList())).size();
        
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}