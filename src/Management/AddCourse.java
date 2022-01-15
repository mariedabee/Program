package Management;

public class AddCourse implements Strategy{

    Course course;
    int courseID ;
    String courseName ;

    public AddCourse(Course course, int courseID, String courseName){
        this.course=course;
        this.courseID=courseID;
        this.courseName=courseName;
    }

    @Override
    public String ManageCourses(String courseName, int courseID) {
        course.setCourseName(courseName);
        course.setCourseID(courseID);
        String message = "course with id: " +courseID + " and name : "+ courseName+ " was successfully added! \n";
        return message;
    }
}
