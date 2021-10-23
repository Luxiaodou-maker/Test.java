package test;

import java.util.Scanner;

public class Example3_2 {
    public static void main(String[] args) {
        System.out.println("请输入5个数：");
        int array[]=new int[5];
        for (int i = 0; i < array.length; i++) {//输入数据
            Scanner reader=new Scanner(System.in);
            array[i]=reader.nextInt();
        }
        for (int i = 0; i <args.length ; i++) {
            if(array[i]>array[i+1]){
                array[i]=array[i+1];
                int t=array[i];
                array[i+1]=t;
            }
        }
        for (int k:array) {
            System.out.println(k);
        }

    }
}
