package InternationalStudents;
import com.company.Student;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Student studentDutch = new Student(02, "Henk", "20", "Leipzig");
        Student studentExchnge = new Student(02, "Marla", "19", "Vlissingen");
        Student studentInternational = new Student(03, "Piet", "22", "Dubai");
        StudentFactory studentFactory = new StudentFactory();

        //get an object of Dutch and call its add method.
        Students studentDutchI = studentFactory.getStudent("DUTCH");
        Students studentExchngeI = studentFactory.getStudent("EXCHANGE");
        Students studentInternationalI = studentFactory.getStudent("INTERNATIONAL");

        //call add method of Student
        studentDutchI.add(studentDutch.getName());
        studentExchngeI.add(studentExchnge.getName());
        studentInternationalI.add(studentInternational.getName());
    }
}