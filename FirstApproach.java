package com.interviewPrep.leetcode.easy.missingnumber;

import java.util.Arrays;

public class FirstApproach {

	public static void main(String[] args) {

		//int[] nums = {3,0,1};
		int[] nums = {0,1};
		
		FirstApproach fa = new FirstApproach();
		int missingNum = fa.missingNumber(nums);

		System.out.println(missingNum);
	}


	public int missingNumber(int[] nums) {

		int missingNum = nums[0];
		
		// sort the given array
		Arrays.sort(nums);
		
		// initialize a counter to zero
		int count =0;
		
		// iterate in for loop and compare array integers with count
		for(int i=0; i<=nums.length; i++) {
			
			if(i < nums.length) {
				
				// if integer doesn't match with count then return it
				if(nums[i] != count) {
					
					missingNum = count;
					return missingNum;
				}
				
				// increment count
				count = count+1;
			}
			// if array integers are exhausted then return count
			else if(i == nums.length) {
				
				missingNum = count;
				return missingNum;
			}
			
		}
		
		return missingNum;
	}

}
