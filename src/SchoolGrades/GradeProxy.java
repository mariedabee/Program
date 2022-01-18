package SchoolGrades;

public class GradeProxy implements Grade {

    private Teacher teacher;
    private Grade grade;

    public GradeProxy(Teacher teacher) {
        this.teacher = teacher;
        this.grade = new RealGrade();
    }

    @Override
    public void add() {
        if (teacher.getName().equals("Andries")) {
            grade.add();
        } else {
            System.out.printf("Sorry " + teacher.getName() + ", only Andries can add grades!\n");
        }
    }

    public static void main(String[] args) {
        Grade grade1 = new GradeProxy(new Teacher("Andries"));
        grade1.add();

        Grade grade2 = new GradeProxy(new Teacher("Not Andries"));
        grade2.add();
    }
}
