package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入性別ex: man/woman");
        String ss = sc.next();
        System.out.println("輸入年齡");
        int age = sc.nextInt();
        if(ss.equalsIgnoreCase("man")){
            if(age>=18){
                System.out.println("yes可以結婚");
            }else{
                System.out.println("no不能結婚");
            }

        }else if(ss.equalsIgnoreCase("woman")){
            if(age>=16){
                System.out.println("yes可以結婚");
            }else{
                System.out.println("no不能結婚");
            }

        }else{
            System.out.println("性別輸入錯誤");
        }

    }

}
