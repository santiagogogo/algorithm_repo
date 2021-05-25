package com.lailai.datastruct;

/**
 * @author santiago
 * @description:
 * @date 2021/5/23
 */
public class ShellSort {

    //希尔排序
    public int[] sortArray(int[] nums) {
        //选择最大gay值，gay值 1 4 13
        int length=nums.length;
        for (int gap=length/2;gap>0;gap/=2){
            for (int i=gap;i<length;i++){
                //插入排序
                int cur=nums[i];
                int j=i-gap;
                while(j>=0&&nums[j]>cur){
                    nums[j+gap]=nums[j];
                    j=j-gap;
                }
                nums[j+gap]=cur;
            }
        }
        return nums;
    }

    //插入排序,类似打扑克牌的时候，每次会把新摸的牌插入到已经排好序的牌里
    public int[] sortArray1(int[] nums) {
        int length=nums.length;
        int cur,j;
        //从第二个开始,取出来插入
        for(int i=1;i<length;i++){
            cur=nums[i];
            j=i-1;
            //和前一个元素比较，直到该元素比自己小，否则就将该元素上移一位
            while(j>=0&&cur<nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=cur;
        }
        return nums;
    }


    //冒泡排序
    public int[] sortArray3(int[] nums) {
        int length=nums.length;
        //从第二个开始,取出来插入
        for(int i=0;i<length-1;i++){
            for (int j=i+1;j<length;j++){
                if (nums[i]>nums[j]){
                    //swap
                    swap(nums,i,j);
                }
            }
        }
        return nums;
    }

    //选择排序
    public int[] sortArray4(int[] nums) {
        int length=nums.length;
        //从第二个开始,取出来插入
        for(int i=0;i<length-1;i++){
            int min=nums[i];
            int index=i;
            for (int j=i+1;j<length;j++){
                if (nums[j]<min){
                    min=nums[j];
                    index=j;
                }
            }
            swap(nums,i,index);
        }
        return nums;
    }

    private void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
}
