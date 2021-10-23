package notebook;

import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        System.out.println("请输入一个1-99999的数：");
        int a=0,result=0;
        Scanner reader=new Scanner(System.in);
        int count=0;
        a=reader.nextInt();
        int b=a;
       do{
          int digt=a%10;
          result=result*10+digt;
          a/=10;
          count++;
       }while(a>0);
        System.out.println("这是一个"+count+"位数");

       if(b>=1&&b<100000)
       {
           if(result==b){
               System.out.println(b+"是回文数");
           }
           else
               System.out.println(b+"不是会回文数");
       }
       else
           System.out.println("这个数不在范围");
    }
}
