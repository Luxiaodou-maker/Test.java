package NO4_EXAMADD2;

public class StuInFoReader {//负责输出学生信息
    Student student;
    StuInFoReader(Student student){
        this.student=student;
    }
    public void putMassage(){
        student.putMassage();
    }
}
