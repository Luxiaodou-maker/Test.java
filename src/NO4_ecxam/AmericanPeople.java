package NO4_ecxam;

public class AmericanPeople extends People{
    public void putMessage(){
        System.out.println("美国人的体重是"+getWeight()*0.98);
        System.out.println("美国人的身高是"+getHeight()*0.95);
    }
    public void speak(){
        System.out.println("Hello");
    }
}
