package E6_7;

public class Test {
    public static void main(String[] args) {
        String s="cfabgd";
        char b[]=s.toCharArray();
        Sort sort=new Sort();
        sort.sort(b);
        for (int i = 0; i<s.length() ; i++) {
            System.out.println(" "+s);
        }
    }
}
