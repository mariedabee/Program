package InternationalStudents;

import com.company.Student;

public class International implements Students {
    Student student;
    String studentName;

    public International() {
    }

    public International(String name) {
        studentName = student.getName();
        this.studentName = name;
    }

    @Override
    public void add(String studentName) {
        this.studentName = studentName;
        System.out.println(" student : " + studentName + " was successfully added as an International student! \n");
    }
}