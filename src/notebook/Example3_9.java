package notebook;

import java.util.Scanner;

public class Example3_9 {
    public static void main(String[] args) {
        System.out.println("输入三个数据：");
        double a,b,c;
        Scanner reader=new Scanner(System.in);
        a=reader.nextDouble();
        b=reader.nextDouble();
        c=reader.nextDouble();
        System.out.println("和是"+(a+b+c));
        System.out.println("平均数是"+((a+b+c)/3));
    }
}
