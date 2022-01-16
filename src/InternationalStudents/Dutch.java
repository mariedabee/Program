package InternationalStudents;

import com.company.Student;

public class Dutch implements Students{
    Student student = new Student();
    String studentName =  student.getName();

    @Override
    public void add(String Student) {
        this.studentName = Student;
        System.out.println("First student" + student.toString() + "was successfully added! \n" );



    }
}
