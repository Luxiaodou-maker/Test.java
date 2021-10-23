package Last;

public class Test3 {
    public static void main(String[] args) {
        double []a=new double[60];
        double temp;
        long starttime=System.nanoTime();//开始时间

        for (int i = 0; i <a.length ; i++) {
            temp=Math.random();
            a[i]=0.0+temp*100;
        }
        long overtime=System.nanoTime();//结束时间
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(starttime);
        System.out.println("开始时间："+stringBuffer);
        stringBuffer.append(overtime);
        System.out.println("结束时间："+stringBuffer);
    }
}
