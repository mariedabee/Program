package InternationalStudents;

import com.company.Student;

public class Dutch implements Students{
    Student student ;
    String studentName ;

    public Dutch(){}
    public Dutch(String name){
        studentName = student.getName();
        this.studentName = name;
    }

    @Override
    public void add(String studentName) {
        this.studentName = studentName;
        System.out.println(" student : " + studentName + " was successfully added as a DUTCH student! \n" );
    }
}