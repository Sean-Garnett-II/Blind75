//my solution

class Solution {
    public int climbStairs(int n) {
        
        // use an n+1 array size so that nSteps maps 1:1 to n
        int[] nSteps = new int[n+1];
        
        // catch base simple case.
        if(n==1){return n;}
        else{
        
            // set initial values 
            nSteps[0]=0;
            nSteps[1]=1;
            nSteps[2]=2;
            
            // use Fibonacci (could be done recursively)
            for(int i = 3; i < nSteps.length; i++){
                nSteps[i] = nSteps[i-1] + nSteps[i-2];
            }
            return nSteps[n];
        }
    }
}

// Elegant solution that I found uses less memeory. 

class Solution {
    public int climbStairs(int n) {
        if(n<=1){
            return n;
        }   
        int a=1,b=1;
        for(int i=2;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}