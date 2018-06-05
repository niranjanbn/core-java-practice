package test;

public class Solution {

	
	
	 // Complete the minimalOperations function below.
    static int[] minimalOperations(String[] words) {
        
        int[] minimalOperations = new int[words.length];
        int repeatedTimes = 0;
        boolean repeated = false;
            
        for(int i=0;i<words.length;i++){
        	repeated = false;
        	repeatedTimes = 0;
            char[] letters = words[i].toCharArray();   
            for(int j=1;j<letters.length;j++){
            	//System.out.println(letters[j-1]+" "+letters[j]);
            	if(repeated) {
            		repeated = false;
            	} else {
            		if(letters[j-1]==letters[j]) { 
                        ++repeatedTimes;
                        repeated = true;
            		}
            	}
                
            }
            minimalOperations[i] = repeatedTimes;
            
            System.out.println("operations:"+minimalOperations[i]);
        }
        
        return minimalOperations;
    }
    
    public static void main(String[] args) {
    	
    	String[] words = {
    			"keyhbmeknckfavrpqyyfjxjjmivtsftikovkcdcwefctqrqjryhtlcvstm",
    			"aa",
    			"aaa",
    			"aaaa",
    			"aaaaa",
    			"aabbb",
    			"aabbbb",
    	};
    	
    	
    	minimalOperations(words);
    	
    }

    
	
}
