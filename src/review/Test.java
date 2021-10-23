package review;

public class Test {
    public static void main(String[] args) {
        int f=2;
        int m=2;
        int x=(f*m++)+m;
        int y=(f*++m)+m;
        System.out.println(x);
        System.out.println(y);
    }

}