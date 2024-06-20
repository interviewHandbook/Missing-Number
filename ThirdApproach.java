package com.interviewPrep.leetcode.easy.missingnumber;

public class ThirdApproach {

	public static void main(String[] args) {
		
		int[] nums = {3,0,1};
		//int[] nums = {0,1};
		
		ThirdApproach ta = new ThirdApproach();
		int missingNum = ta.missingNumber(nums);
		
		System.out.println(missingNum);
	}
	
	public int missingNumber(int[] nums) {
		
		int missingNum = nums[0];
		
		// initialize sum variable to zero
		int numsSum = 0;
		
		// iterate in for loop and add all integers in given array and store in numsSum
		for(int i=0; i<nums.length; i++) {
			
			numsSum = numsSum + nums[i];
		}
		
		// initialize sum variable and a counter to zero
		int expectedSum = 0;
		int num = 0;
		
		// add all integers between 0 to N and store in expectedSum
		for(int i=0; i<=nums.length; i++) {
			
			expectedSum = expectedSum + num;
			num = num+1;
		}
		
		// find the difference and return it
		missingNum = expectedSum - numsSum;
		
		return missingNum;
	}
}
