package NO4_EXAMADD;

public  class University {
    Student stu;
    University(Student stu){
        this.stu=stu;
    }
    public void getMassage(long id,String name){
       stu.getMessage(id, name);
    }
}
