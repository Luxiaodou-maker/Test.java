package Test531;

public class Black implements  Advetisement{
    @Override
    public void showAdvetisment() {
        System.out.println("*********");
        System.out.println("飞机中的战斗机");
        System.out.println("***********");
    }

    @Override
    public String getName() {
        return "黑土有限公司";
    }
}
