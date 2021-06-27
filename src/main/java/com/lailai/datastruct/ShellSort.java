package com.lailai.datastruct;

/**
 * @author santiago
 * @description:
 * @date 2021/5/23
 */
public class ShellSort {

        //快速排序
        public int[] sortArray7(int[] nums) {
            if (nums==null|nums.length<2){
                return nums;
            }
            quickSort(nums,0,nums.length-1);
            return nums;
        }

        public void quickSort(int[] nums,int left,int right){
            if (left<right){
                int index=partition(nums,left,right);
                quickSort(nums,left,index);
                quickSort(nums,index+1,right);
            }
        }
        public int partition(int[] nums,int left,int right){
            int pivot=nums[left];

            while(left<right){
                while (left<right&&nums[right]>=pivot){
                    right--;
                }
                if (left<right){
                    swap(nums,left,right);
                }
                while (left<right&&nums[left]<=pivot){
                    left++;
                }
                if (left<right){
                    swap(nums,left,right);
                }
            }
            return left;
        }

    //希尔排序
    public int[] sortArray6(int[] nums) {
        //选择最大gay值，gay值 1 4 13
        int length = nums.length;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                //插入排序
                int cur = nums[i];
                int j = i - gap;
                while (j >= 0 && nums[j] > cur) {
                    nums[j + gap] = nums[j];
                    j = j - gap;
                }
                nums[j + gap] = cur;
            }
        }
        return nums;
    }

    //插入排序,类似打扑克牌的时候，每次会把新摸的牌插入到已经排好序的牌里
    public int[] sortArray1(int[] nums) {
        int length = nums.length;
        int cur, j;
        //从第二个开始,取出来插入
        for (int i = 1; i < length; i++) {
            cur = nums[i];
            j = i - 1;
            //和前一个元素比较，直到该元素比自己小，否则就将该元素上移一位
            while (j >= 0 && cur < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = cur;
        }
        return nums;
    }


    //冒泡排序
    public int[] sortArray3(int[] nums) {
        int length = nums.length;
        //从第二个开始,取出来插入
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > nums[j]) {
                    //swap
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }

    //选择排序
    public int[] sortArray4(int[] nums) {
        int length = nums.length;
        //从第二个开始,取出来插入
        for (int i = 0; i < length - 1; i++) {
            int min = nums[i];
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            swap(nums, i, index);
        }
        return nums;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    //归并排序
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            //计算中心索引,拆成两半
            int mid = left + (right - left) / 2;
            //分别递归左右
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            //合并
            merge(nums, left, mid, right);
        }
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int[] tmpArr = new int[right - left + 1];
        int index = 0;
        int tmpLeft = left;
        int tmpRight = mid+1;
        //左右双指针，较小的存临时数组
        while (tmpLeft <= mid && tmpRight <= right) {
            if (nums[tmpLeft] < nums[tmpRight]) {
                tmpArr[index++] = nums[tmpLeft++];
            } else {
                tmpArr[index++] = nums[tmpRight++];
            }
        }
        //左右剩下的元素，复制到临时数组
        if (tmpLeft <= mid) {
            System.arraycopy(nums, tmpLeft, tmpArr, index, mid - tmpLeft + 1);
        }
        if (tmpRight <= right) {
            System.arraycopy(nums, tmpRight, tmpArr, index, right - tmpRight + 1);
        }
        //临时数组复制到主数组
        System.arraycopy(tmpArr,0,nums,left,right-left+1);
    }
}
