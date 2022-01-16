package InternationalStudents;

import com.company.Student;

public class Exchange implements Students{
    Student student;
    String studentName;

    public Exchange() {
    }

    public Exchange(String name) {
        studentName = student.getName();
        this.studentName = name;
    }

    @Override
    public void add(String studentName) {
        this.studentName = studentName;
        System.out.println(" student : " + studentName + " was successfully added as an Exchange student! \n");
    }
}