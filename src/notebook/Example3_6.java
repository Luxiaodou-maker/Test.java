package notebook;

import java.util.Scanner;

//递归
public class Example3_6 {
    public static double fc(int a){
        if(a==0||a==1){
            return 1;
        }
        else if(a>0){
            double result=a*fc(a-1);
            return result;
        }
        else
            return 1;
    }
    public static void main(String[] args) {
        //System.out.println("输入需要阶乘的数：");
        System.out.println("输入需要求多少项和");
        Scanner in=new Scanner(System.in);
        int i;
        i=in.nextInt();
        double sum=0;
        double temp=0;
        //System.out.println(i+"的阶乘是"+fc(i));
        for (int j = 1; j <=i ; j++) {
            temp+=1/fc(j);

        }
        System.out.println(temp);
    }
}
