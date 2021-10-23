package test;
//构造100以内的素数表
public class Prime2 {
    public static void main(String[] args) {
        boolean[] isPrime =new boolean[100];//默认值为0，下面要将它初始化
        for (int i = 2; i <isPrime.length ; i++)//初始化全部为true
        {
         isPrime[i]=true;
        }
        for (int i = 2; i <isPrime.length ; i++)
        {
         if(isPrime[i])
         {
             for (int k = 2; i*k < isPrime.length; k++)//出现倍数说明就不是素数了，因此只要将是倍数的标记为false
             {
                 isPrime[i*k]=false;
             }
         }
        }
        System.out.println("100以内的素数有");
        for (int i = 0; i <isPrime.length ; i++)
        {
         if(isPrime[i])
         {
             System.out.println(i+" ");
         }
        }

    }
}
