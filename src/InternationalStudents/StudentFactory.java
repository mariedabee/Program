package InternationalStudents;

import com.company.Student;

public class StudentFactory {

    //use getStudent method to get object of type students
    public Students getStudent(String studentType){
        if(studentType == null){
            return null;
        }
        if(studentType.equalsIgnoreCase("DUTCH")){
            return new Dutch();

        } else if(studentType.equalsIgnoreCase("INTERNATIONAL")){
            return new International();

        } else if(studentType.equalsIgnoreCase("EXCHANGE")){
            return new Exchange();
        }

        return null;
    }
}