package NO4_EXAMADD2;
//面向接口的编程
public class Test4 {
    public static void main(String[] args) {
       Undergraduate s1=new Undergraduate();
       Master s2=new Master();
       Doctol s3=new Doctol();
       University yunda;
       StuInFoReader pt;
       yunda=new University(s1);
       pt=new StuInFoReader(s1);
       yunda.gtm(123,"小黑");
       pt.putMassage();
       yunda=new University(s2);
       pt=new StuInFoReader(s2);
       yunda.gtm(456,"小白");
       pt.putMassage();
        yunda=new University(s3);
        pt=new StuInFoReader(s3);
        yunda.gtm(789,"小蔡");
        pt.putMassage();

    }
}
