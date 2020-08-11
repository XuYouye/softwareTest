package XuDTest02;

//创建实体类
public class Student {
    public int id;
    public String name;
    public String phonenum;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ",phonenum= "+ phonenum +"]";
       
    }
    public static  void main(String args[]) {
    	System.out.println("Jenkins集成测试");
    	System.out.println("JenkinsTest集成测试");
    }
    
    
}