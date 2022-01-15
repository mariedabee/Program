
package Management;

        import com.company.Student;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

class StrategyPatternDemo {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the course name: ");
        String courseName = br.readLine();

        System.out.print("Enter the course id: ");
        int id = Integer.parseInt(br.readLine());
        System.out.print("Enter the teacher name: ");
        String teacher = br.readLine();
        System.out.print("Enter the students number: ");
        int noOfStudents = Integer.parseInt(br.readLine());

        Course course = new  Course(courseName,teacher,noOfStudents);
        course.setCourseID(id);
        course.setCourseName(courseName);
        course.setTeacher(teacher);
        course.setNoOfStudents(noOfStudents);

        Context context = new Context(new AddCourse(course, id, courseName));
        System.out.println( context.executeStrategy(courseName, id)+ "\n");

         Student student= new Student( 12,"Mariam Bari", "24","bremen" );
         context = new Context(new UpdateCourse(course, noOfStudents, courseName, student));
         System.out.println(context.executeStrategy(courseName, id)+ "\n");

         context = new Context(new DeleteCourse(course, id, courseName));
        System.out.println(context.executeStrategy(courseName, id)+ "\n");

    }

}