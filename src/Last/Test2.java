package Last;

public class Test2 {
    public static void main(String[] args) {
        double []a=new double[10000];
        double []b=new double[10000];
        double temp;
        for (int i = 0; i <a.length ; i++) {
            temp=Math.random();
            a[i]=Math.log10(temp);
        }
        long starttime=System.nanoTime();//开始时间
        System.arraycopy(a,0,b,2000,8000);
        long overtime=System.nanoTime();//结束时间
        //arraycopy的在用法是（被复制的数组，开始复制的位置，复制到的数组，开始接受复制的位置，被复制的数组给的长度）
        System.out.println("运行时间是"+(overtime-starttime)+"纳秒");//返回运行毫秒数
    }
}
