package com.chryl.controller.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created By Chr on 2019/7/3.
 */
public class Test {

    public static void main(String[] args) throws IOException {


    }

    public static void showEngNum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        int b = 0;
        for (int j = 0; j < sb.length(); j++) {
            //65——90代表A-Z,97-122代表a——z
            if (sb.charAt(j) <= 90 & sb.charAt(j) >= 65 | sb.charAt(j) <= 122
                    & sb.charAt(j) >= 97) {
                b++;
            }
        }
        System.out.println("字母数:" + b);
    }


    public static void dateFromat() {
        String str = "2019年7月3日";
        System.out.println(str.replace("年", "/0")
                .replace("月", "/0")
                .replace("日", ""));
    }

    public static void numSort() {
        System.out.println("请输入你的第一数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入你的第二数");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入你的第三 数");
        int c = new Scanner(System.in).nextInt();
        if (a == b && b == c) {
            System.out.println(a + "=" + b + "=" + c);
            return;
        }
        //三目表达式
        int max = a > c ? (a > b ? a : b) : (c > b ? c : b);//最大数
        int min = a < c ? (a < b ? a : b) : (c > b ? c : b);//最小数
        int mid = a < c ? (a > b ? a : (c > b ? b : c)) : (a < b ? a : (b < c ? c : b));//中间值
        System.out.println(max + ">" + mid + ">" + min);
    }
}
