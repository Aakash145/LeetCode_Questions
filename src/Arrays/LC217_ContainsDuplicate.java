package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LC217_ContainsDuplicate {
	
	//Basic Solution: Time Complexity O(n2)
	public boolean containsDuplicateSolutionFirst(int[] nums) {
				
        if(nums.length == 1){
            return false;
        }

        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
	}
	
	//Using Sorting: Time Complexity: O(nlogn)
	public boolean containsDuplicateSolutionSecond(int[] nums) {
		
		Arrays.sort(nums);
		
		for(int i = 0; i< nums.length - 1; i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		
		return false;
	}
	
	//Using Hashing: Time Complexity: O(n), Space Complexity: O(n)
	public boolean containsDuplicateSolutionThird(int[] nums) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i = 0; i< nums.length; i++) {
			if(hashSet.contains(nums[i])) {
				return true;
			}else {
				hashSet.add(nums[i]);
			}
		}
		
		return false;
	}

}
