class Solution {
	
	// This is the brute force method. Time Complexity O^2
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length-1; j++){
                if (nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
            
        }
        return new int[] {};
    }
}

class Solution {
	
	// hashmap solution
	
    public int[] twoSum(int[] nums, int target) {
        
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++){
            
			int subTarget = target - nums[i];
            
			if(myMap.containsKey(subTarget)){
				return new int[] {i, myMap.get(subTarget)};
			}
			else {
				myMap.put(nums[i], i);
			}
		
		}
		
        return new int[] {};
    }
}