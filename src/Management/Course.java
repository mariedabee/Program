package Management;

import com.company.Student;
import java.util.ArrayList;


public class Course {

        ArrayList<Student> studentList;
        private String courseName;
        private int courseID;
        private String teacher;
        private int noOfStudents;

    public Course(String courseName, String teacher, int noOfStudents){
        this.courseName = courseName;
        this.teacher = teacher;
        noOfStudents = noOfStudents;
        studentList = new ArrayList<Student>();
    }

    //Setters
    public void setCourseID(int courseID){
        this.courseID = courseID;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setNoOfStudents(int noOfStudents){
        this.noOfStudents = noOfStudents;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }


    //Getters
        public int getCourseID(){
            return courseID;
        }
        public String getCourseName(){
            return courseName;
        }
        public int getNoOfStudents(){
            return noOfStudents;
        }
        public String getTeacher(){
            return teacher;
        }




        public void addStudent(Student newStudent){
            if(studentList.size()==noOfStudents){
                System.out.println("The class is full, you cannot enrol. \n");
            }
            else {
                studentList.add(newStudent);
            }
        }

        public String toString() {
            return "Course Name: \n" + this.courseName + " Teacher: \n" + this.teacher
                    + " Number of InternationalStudents.Students: \n" + this.noOfStudents;
        }

}
