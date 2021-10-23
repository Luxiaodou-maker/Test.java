package NO4_EXAMADD2;

public class Undergraduate implements  Student {
    long id;
    String name;
    @Override
    public void getMassage(long id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public void putMassage() {
        System.out.println("本科生"+name+"的学号是"+id);
    }
}
