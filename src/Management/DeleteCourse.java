package Management;

public class DeleteCourse implements Strategy{

    Course course;
    int courseID ;
    String courseName ;

    public DeleteCourse(Course course, int courseID, String courseName){
        this.course=course;
        this.courseID=courseID;
        this.courseName=courseName;
    }


    @Override
    public String ManageCourses(String courseName, int courseID) {
        this.course.toString();
        String message = "course with id: " +courseID + " and name : "+ courseName+ " was successfully deleted! \n";
        return message;
    }
}
