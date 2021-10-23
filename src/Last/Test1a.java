package Last;

public class Test1a {
    public static void main(String[] args) {
        String []b=new String[999];
        for (int i = 0; i <b.length ; i++) {
            b[i]= String.valueOf(System.getenv());
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
            System.out.println();
        }
    }
}
