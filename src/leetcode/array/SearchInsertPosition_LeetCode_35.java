package leetcode.array;

/**
 * problem statement:
	
	
	Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	
	You must write an algorithm with O(log n) runtime complexity.
	
	 
	
	Example 1:
	
	Input: nums = [1,3,5,6], target = 5
	Output: 2
	
	Example 2:
	
	Input: nums = [1,3,5,6], target = 2
	Output: 1
	
	Example 3:
	
	Input: nums = [1,3,5,6], target = 7
	Output: 4

  
 */
public class SearchInsertPosition_LeetCode_35 {

	public static void main(String[] args) {
//		int []ar = {1,3,5,6};
//		int target = 5;
//		int []ar = {1,3,5,6};
//		int target = 2;
//		int []ar = {1,3,5,6};
//		int target = 7;
//		int []ar = {1,3,5,6};
//		int target = 0;
		int []ar = {1,3};
		int target = 2;
	}

	public static int searchInsert(int[] nums, int target) {
		int index = 0;
		if (nums.length <= 0) {
			return index;
		}
		
		int low = 0;
		int high = nums.length-1;
		int mid = 0;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (target > nums[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return low;
		
	}
	
	
}
