package classmatch;

public class Example4_9 {
    public static void main(String[] args) {
        SIM sim1=new SIM(13888637611L);
        MobileTelePhone mobile=new MobileTelePhone();
        mobile.setSIM(sim1);//拥有同样的实体sim1的操作权给了mobile中的sim.
        System.out.println("手机号码"+mobile.lookNumber());
        SIM sim2=new SIM(15887423376L);
        mobile.setSIM(sim2);//更换手机号码
        System.out.println("手机号码"+mobile.lookNumber());
    }
}
