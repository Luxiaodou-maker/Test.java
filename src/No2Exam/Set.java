package No2Exam;

import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<String>();
        a.add("first");
        a.add("second");
        a.add("first");
        for (String k:
            a ) {
            System.out.println(k);
        }
        System.out.println(a);
        System.out.println("-------");
        HashSet<String>b=new HashSet<>();
        b.add("first");
        b.add("second");
        b.add("first");

        for (String m:b
             ) {
            System.out.println(m);
        }
        System.out.println(b);
    }
}
