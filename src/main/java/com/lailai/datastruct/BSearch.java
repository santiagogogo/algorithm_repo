package com.lailai.datastruct;


public class BSearch {
    /*
    给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。
     */

    public int[] searchRange(int[] nums, int target) {
        int start = findIndex(nums, target, true);
        int end = findIndex(nums, target, false);
        return new int[]{start, end};
    }

    public int findIndex(int[] nums, int target, boolean isLow) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (isLow) {
                    if (mid == 0 || nums[mid - 1] != target) {
                        return mid;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (mid == nums.length - 1 || nums[mid + 1] != target) {
                        return mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}

