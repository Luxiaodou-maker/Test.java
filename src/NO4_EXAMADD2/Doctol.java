package NO4_EXAMADD2;

public class Doctol implements  Student {
    long id;
    String name;
    @Override
    public void getMassage(long id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public void putMassage() {
        System.out.println("博士生"+name+"的学号是"+id);
    }
}
