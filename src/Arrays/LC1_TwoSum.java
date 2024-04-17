package Arrays;

import java.util.HashMap;

public class LC1_TwoSum {
	
	//Basic Solution: Time Complexity: O(n2)
	public int[] twoSumSolutionFirst(int[] nums, int target) {
        int[] myNum = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    myNum[0] = i;
                    myNum[1] = j;
                }
            }
        }
       return myNum;

    }
	
	//Using HashMap: Time Complexity: O(n)
	public int[] twoSumSolutionSecond(int[] nums, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap();
		
		for(int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if(hashMap.containsKey(difference)) {
				return new int[] {hashMap.get(difference), i};
			}
			hashMap.put(nums[i], i);
		}
		return null;
	}
	
	

}
