package NO4_EXAMADD;

public class Doctoral extends Student{
    long id;
    String name;
   // Doctoral(long id,String name){
     //   this.id=id;
      //  this.name=name;
    //}
    @Override
    public void getMessage(long id,String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public void putMesaage() {
        System.out.println("博士生"+name+"的学号是"+id);
    }
}
