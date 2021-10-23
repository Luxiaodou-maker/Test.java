package test;

public class Sum {
    public static void main(String[] args) {
        long a=8;
        long temp=0;
       long result=0;
        for (int i = 0; i <12; i++) {
           long sum= (long) (a*Math.pow(10.0,(double)i));
            temp+=sum;
            result+=temp;
        }
        System.out.println(result);
    }
}
