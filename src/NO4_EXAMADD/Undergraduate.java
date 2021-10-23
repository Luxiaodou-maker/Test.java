package NO4_EXAMADD;

public class Undergraduate extends Student {
    long id;
    String name;
//Undergraduate(long id,String name){
   // this.id=id;
    //this.name=name;
//}

    @Override
    public void getMessage(long id,String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public void putMesaage() {
        System.out.println("本科生"+name+"的学号是"+id);
    }
}
