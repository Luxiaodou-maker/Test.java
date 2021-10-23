package NO4_ecxam;

public class CBC extends Bank {
    double Interest1;
    double Interest2;
    double total;
    public double caculateInerest(int year,double day,double principal){//方法重写的参数个数与类型必须完全相同
        Interest1=super.caculateInerest(year,day,principal);
        Interest2=(day/365)*0.45*principal;
        return ( total=Interest1+Interest2);
    }

}
