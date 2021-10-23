package NO4_ecxam;

public class ChinaPeople extends People{
    //由于父类中的height和weight是private，不能继承
    public void putMessage(){
        System.out.println("中国人的体重是"+getWeight()*0.95);
        System.out.println("中国人的身高是"+getHeight()*0.85);
    }
    public void speak(){
        System.out.println("你好");
    }
}
