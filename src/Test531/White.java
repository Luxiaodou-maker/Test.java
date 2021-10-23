package Test531;

public class White implements Advetisement{
    @Override
    public void showAdvetisment() {
        System.out.println("***************");
        System.out.println("劳动是爹，土地是妈");
        System.out.println("***************");
    }

    @Override
    public String getName() {
        return"白云有限公司";
    }
}
