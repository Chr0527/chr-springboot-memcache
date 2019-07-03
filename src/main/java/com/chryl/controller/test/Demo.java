package com.chryl.controller.test;

/**
 * Created By Chr on 2019/7/3.
 */
public class Demo {
    public static boolean isHuiWen(String s) {

        // TODO Auto-generated method stub
        boolean flag = false;
        byte[] byteval = s.getBytes();

        for (int k = 0; k < byteval.length; k++) {
            if (byteval[k] == byteval[byteval.length - k - 1]) {
                flag = true;
            } else {
                flag = false;
                k = byteval.length - 1;
            }
        }
        return flag;
    }


    public static void main(String args[]) {
        boolean huiWen = isHuiWen("1211321");
        System.out.println(huiWen);
    }
}
