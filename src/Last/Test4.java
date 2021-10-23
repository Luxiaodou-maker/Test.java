package Last;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        String a[]=new String[10];//储存输入信息
        String b[]=new String[10];//储存数字
        double temp[]=new double[10];//数字运算中转
        String regEx="[^0-9]";
        for (int i = 0; i <a.length ; i++) {//使用键盘输入10行文本
            Scanner in=new Scanner(System.in);
            a[i]=in.nextLine();
        }
        System.out.println("文本里包含的数字是：");
        for (int i = 0; i <a.length ; i++) {//输出数字
            System.out.println( a[i].replaceAll(regEx,""));
            b[i]=a[i].replaceAll(regEx,"");
        }
        for (int i = 0; i <b.length ; i++) {//将字符串数组转化为double型的数组，便于运算
            temp[i]=Integer.parseInt(b[i]);//字符串替换为数字进行运算
            temp[i]+=1+Math.random()*99;
            b[i]=String.valueOf(temp[i]);//再转为字符串，便于后续替换
        }
        System.out.println("替换后的文本是");
        for (int i = 0; i < a.length; i++) {
           String s1 = a[i].replaceAll("\\d+", b[i]);
            System.out.println(s1);
        }
    }
}
