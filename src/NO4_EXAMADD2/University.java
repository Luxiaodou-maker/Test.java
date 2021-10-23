package NO4_EXAMADD2;

public class University {//负责输入学生信息
    Student student;
    University(Student student){
        this.student=student;
    }
    public  void gtm(long id,String name){
        student.getMassage(id, name);
    }
}
