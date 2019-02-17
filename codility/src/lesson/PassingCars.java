package lesson;

public class PassingCars {
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        int oneCount = 0;
	        int zeroCount = 0;
	        int count = 0;
	        
	        for(int i = 0; i < A.length; i++) {
	            if(A[i] == 0) {
	                zeroCount++;
	            } else {
	                if(zeroCount != 0) {
	                    oneCount = 1;
	                    count += zeroCount * oneCount;
	                }
	            }
	        }
	        
	        if(count > 1000000000 || count < 0) return -1;
	        else return count;
    }
}
