package InternationalStudents;
import com.company.Student;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setSid(109);
        student01.setName("Tom");
        student01.setAge("22");
        student01.setAddress("bremen");
        String name = student01.getName();

        Student student02 = new Student(02, "Henk", "20", "Leipzig");
        Student student03 = new Student(03, "Piet", "22", "Dubai");
        StudentFactory studentFactory = new StudentFactory();


        //get an object of Dutch and call its add method.
        Students student1 = studentFactory.getStudent("DUTCH");
        Students student2 = studentFactory.getStudent("EXCHANGE");
        Students student3 = studentFactory.getStudent("INTERNATIONAL");

        //call add method of Student
        student1.add(name);
        student1.add(student02.getName());
        student1.add(student03.getName());

        //System.out.println("First student" + student01.toString() + "was successfully added! \n" );
    }
}
