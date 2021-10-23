package No2Exam;

public class Test1 {
    public static void main(String[] args) {
        Lader lader1=new Lader(3.5,4.6,7.0);//第一个梯形
        System.out.println("第一个梯形的面积是"+lader1.calculateArea());
        Lader lader2=new Lader(6,9,7);
        System.out.println("第二个梯形面积是"+lader2.calculateArea());
        System.out.println(Lader.calculateArea());
    }

}
