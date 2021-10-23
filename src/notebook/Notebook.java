package notebook;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<String> notes=new ArrayList<String>();
        public void add(String s){
            notes.add(s);
        }
        public void add(String s,int location){
         notes.add(location,s);
        }
       public int getSize(){

            return notes.size();
        }
        public String getNote(int index){
            return notes.get(index);
        }
        public void removeNotes(int index){
            notes.remove(index);
        }
        public String[] list(){
            String[]a=new String[notes.size()];
            //for (int i = 0; i <notes.size() ; i++) {
              //  a[i]=notes.get(i);
          //  }
            notes.toArray(a);//与上面的赋值是一个效果
             return a;
        }

    public static void main(String[] args) {
        Notebook nu = new Notebook();
        nu.add("first");
        nu.add("second");
        nu.add("third",1);
        System.out.println(nu.getSize());
        System.out.println();
        System.out.println(nu.getNote(0));
        nu.removeNotes(1);
        String[]a=nu.list();
        for (String s:a) {
            System.out.println(s);

        }
    }

    }

