package Management;

import com.company.Student;

public class UpdateCourse implements Strategy{

    Course course;
    int NoOfStudents;
    String courseName ;
    Student newStudent;

    public UpdateCourse(Course course, int NoOfStudents, String courseName, Student newStudent){
        this.course=course;
        this.NoOfStudents=NoOfStudents;
        this.courseName=courseName;
        this.newStudent=newStudent;
    }

//to update number of enrollments
    @Override
    public String ManageCourses(String courseName, int NoOfStudents) {
        course.setCourseName(courseName);
        course.setNoOfStudents(NoOfStudents);
        course.addStudent(newStudent);
        String messagestudent = "student : " +newStudent.toString()+ " was successfully added to the course " + courseName +"\n";
        String message = "course with name: " +courseName + " and id : "+ course.getCourseID() + " was successfully updated! \n";
        String message2 = " new Number of InternationalStudents.Students for this course:  "+ course.getNoOfStudents()+ "\n";
        return messagestudent+ message + message2;
    }
}
