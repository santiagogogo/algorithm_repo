package com.lailai.pattern.HuiWenTest;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collections;

public class HuiWenTest {

    /**
     * 字符串翻转，判断是否一致
     * @param str
     * @return
     */
    public static boolean isHuiWen(String str){
        if (str==null||str.length()==0){
            return true;
        }
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String newStr=new String(sb);
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=newStr.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isHuiWen2(String str){
        if (str==null||str.length()==0){
            return true;
        }
        int length=str.length();
        for (int i=0;i<length-1;i++){
            if (str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println("最终："+JSONObject.toJSONString(sortAll("abc")));

    }



    public static ArrayList<String> sortAll(String str) {
        ArrayList<String> ans=new ArrayList<>();//所有排列的可能都在这里
        if(str!=null||str.length()>0){
            help(0,str.toCharArray(),ans);
            //Collections.sort(ans);
        }

        return ans;
    }


    public static void help(int i,char[] cha,ArrayList<String> ans){
        if(i==cha.length-1){
            String val = String.valueOf(cha);
            if(!ans.contains(val)){
                ans.add(val);
                System.out.println("加入list:"+val);
            }
        }else{
            for(int j=i;j<cha.length;j++){
                swap(i,j,cha);//依次选一个数固定住
                System.out.println(JSONObject.toJSONString(cha));
                help(i+1,cha,ans);//让后面的进行全排列
                swap(i,j,cha);//恢复原来的模样，回溯关键
                System.out.println(JSONObject.toJSONString(cha));
            }
        }

    }

    public static void swap(int i,int j,char[] cha){
        char temp=cha[i];
        cha[i]=cha[j];
        cha[j]=temp;
    }

}
