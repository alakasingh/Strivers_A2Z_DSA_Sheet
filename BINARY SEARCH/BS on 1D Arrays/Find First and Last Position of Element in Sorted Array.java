Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

code-----------------------------------------------------------------------

  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[]{-1,-1};
        int n=nums.length-1;
        int low=0;
        int high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                      high=mid-1;
            }else if(nums[mid]<target) low=mid+1;
        }
        low = 0;

        high = n;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                      high=mid-1;
            }else if(nums[mid]<target) low=mid+1;
        }return ans;
    }
}
  
