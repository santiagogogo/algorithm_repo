package com.lailai.algorithm_repo.HuiWenTest;

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
        String a="asd 7777 dsa";
        boolean res=isHuiWen(a);
        boolean res2=isHuiWen2(a);
        System.out.println("res:"+res);
        System.out.println("res2:"+res2);
    }
}
