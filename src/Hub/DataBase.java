package Hub;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<CD>listCD=new ArrayList<CD>();
    public void add (CD cd)
    {
        listCD.add(cd);
    }
    public void list(){
        for (CD cd:listCD) {
            cd.print();
        }
    }

    public static void main(String[] args) {
        DataBase db=new DataBase();
        db.add(new CD("ABC","XIAOBAI",4,60,"Good"));
        db.list();
    }
}
