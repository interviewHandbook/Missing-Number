package com.interviewPrep.leetcode.easy.missingnumber;

import java.util.HashSet;
import java.util.Set;

public class SecondApproach {

	public static void main(String[] args) {
		
		//int[] nums = {3,0,1};
		int[] nums = {0,1};
		
		SecondApproach sa = new SecondApproach();
		int missingNum = sa.missingNumber(nums);
		
		System.out.println(missingNum);
	}
	
	public int missingNumber(int[] nums) {
		
		int missingNum = nums[0];
		
		// initialize a Hashset
		Set<Integer> numSet = new HashSet<>();
		
		// iterate in a loop and push array integers into the Hashset
		for(int i=0; i<nums.length; i++) {
			
			numSet.add(nums[i]);
		}
		
		// now between 0 and N, check which integer is missing
		for(int i=0; i<=nums.length; i++) {
			
			if(!numSet.contains(i)) {
				
				// return the integer not present in Hashset
				return i;
			}
		}
		
		return missingNum;
	}
	
}
