package NO4_EXAMADD;

public class Master extends Student {
    long id;
    String name;
   // Master(long id,String name){
      //  this.id=id;
     //   this.name=name;
    //}
    @Override
    public void getMessage(long id,String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public void putMesaage() {
        System.out.println("研究生"+name+"的学号是"+id);
    }



}
