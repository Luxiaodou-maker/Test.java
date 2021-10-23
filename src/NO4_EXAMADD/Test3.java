package NO4_EXAMADD;
//面向抽象的编程
public class Test3 {
    public static void main(String[] args) {
        University gt;
        StuInFoReader pt;
        Student student = null;
        Undergraduate s1=new Undergraduate();
        pt=new StuInFoReader(s1);
        gt=new University(s1);
        gt.getMassage(123,"张三");
        pt.putMassage();
        Master s2=new Master();
        pt=new StuInFoReader(s2);
        gt=new University(s2);
        gt.getMassage(456,"李白");
        pt.putMassage();
        Doctoral S3=new Doctoral();
        pt=new StuInFoReader(S3);
        gt=new University(S3);
        gt.getMassage(789,"小王");
        pt.putMassage();


    }
}
