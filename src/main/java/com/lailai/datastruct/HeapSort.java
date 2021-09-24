package com.lailai.datastruct;

import java.util.Arrays;

/**
 * @author santiago.ge
 * @description:
 * @date 2021/9/24
 */
public class HeapSort {
    /**
     * 思路
     * 1. 构建一个大顶堆，把最大元素通过递归方式推到根节点
     * 2. swap根节点和尾节点，再将尾结点砍掉，放入结果数组中
     * 3.对新的长度-1的堆，重新递归排序
     */

    private void swap(int[] arr,int j,int i){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    /**
     * 递归选出该堆最大节点（根节点）
     */
    private void getMaxRoot(int[] arr,int curr,int size){
        if (curr>size-1){
            return;
        }
        int left=curr*2+1;
        int right=curr*2+2;
        int max=curr;
        if (left<size&&arr[left]<arr[max]){
            max=left;
        }
        if (right<size&&arr[right]<arr[max]){
            max=right;
        }
        if (max!=curr){
            swap(arr,max,curr);
            getMaxRoot(arr,max,size);
        }
    }

    public void getMaxHeap(int[] arr){
        for (int i = arr.length-1;i>=0;i--){
            getMaxRoot(arr,i,arr.length);
        }
    }

}
