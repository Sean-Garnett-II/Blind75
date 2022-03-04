public class Solution {
    
// My method. technically slower probably due to the n!=0 checks. 
// use unassigned right shift to account for Negative numbers.
    public int hammingWeight(int n) {
        // you need to treat n as an unsigned value
        int count = 0;
        
        while(n != 0){
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}

// The compiler says that this method is faster than the while loop used above. 
// O(n) = constant
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        
        for(int i = 0; i < 32; i++, n>>>=1)){
            count += n & 1;
        }

        return count;
    }
}