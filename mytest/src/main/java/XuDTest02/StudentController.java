package XuDTest02;

//创建被测试的类，该类依赖于StudentDao的实例
public class StudentController {
    private StudentDao mStudentDAO;

    public Student getStudentInfo(int sid) {
        Student student = null;
        if (mStudentDAO != null) {
            student = mStudentDAO.getStudentFromDB(sid);
        }
        if (student == null) {
            student = fetchStudentInfo(sid);
        }
        return student;
    }

    private Student fetchStudentInfo(int sid) {
        System.out.println("从网络上获取学生信息");
        Student student = new Student();
        student.id = 666;
        student.name = "server-user";
        return student;
    }

    public void setStudentDAO(StudentDao dao) {
        this.mStudentDAO = dao;
    }
}
