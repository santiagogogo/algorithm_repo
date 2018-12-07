package com.lailai.algorithm_repo.HeapSort;

import com.alibaba.fastjson.JSONObject;

public class HeapSort {


    /**
     * 建最大堆步骤，1：父节点分别和左右子节点比较大小，如果大于父节点，则调换，2，递归重复以上步骤
     * @param arr
     * @param currentRootNode
     * @param size
     */
    private static void heapify(int[] arr,int currentRootNode,int size){
        if (currentRootNode<size){
            int left=currentRootNode*2+1;
            int right=currentRootNode*2+2;
            int max=currentRootNode;

            if (left<size&&arr[max]<arr[left]){
                max=left;
            }
            if (right<size&&arr[max]<arr[right]){
                max=right;
            }
            if (max!=currentRootNode){
                int temp=arr[currentRootNode];
                System.out.println("交换:"+temp+",right:"+arr[max]);
                //System.out.println("left:"+left+",right:"+right+",max:"+max+",size:"+size);
                arr[currentRootNode]=arr[max];
                arr[max]=temp;

                heapify(arr, max, size);
            }
        }

    }

    /**
     * 从最后一个父节点开始遍历，每一个家庭选出最大的，然后逐层网上选举，最后就是最大的了
     * @param arr
     * @param size
     */
    private static void maxHeapify(int[] arr,int size){
        for (int i=size-1;i>=0;i--){
            heapify(arr,i,size);
        }
    }


    public static void main(String[] args){
        int[] arr={44,3,45,6,77,543,443,556,2};
        for (int i=0;i<arr.length;i++){
            maxHeapify(arr,arr.length-i);
            int temp=arr[0];
            System.out.println("本轮最大："+temp);
            arr[0]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(JSONObject.toJSONString(arr));

    }

}
