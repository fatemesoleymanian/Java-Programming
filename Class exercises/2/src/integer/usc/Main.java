package integer.usc;

public class Main extends Student {


    @Override
    public void role() {

        System.out.println("i'm a teacher!...");
    }

    public static void main(String[] args) {
        Employee employee = new RoleEmployee();
        employee.role();
        Teacher teacher=new RoleTeacher();
        teacher.role();
        Student student=new Main();
        student.role();
    }
}
