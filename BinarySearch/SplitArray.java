/*
 
Leetcode 410. Split Array Largest Sum
Hard

Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

 */

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        //int[] nums = {1,2,3,4,5};
        int k = 2;
        int ans = splitArrayLargestSum(nums, k);
        System.out.println(ans);
    }

    public static int splitArrayLargestSum(int[] nums,int k){
        int start = 0;
        int end = 0;

        for(int i=0;i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

    //binary search
        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum = sum + num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}

