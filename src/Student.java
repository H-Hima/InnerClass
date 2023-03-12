public class Student extends Human {
    public static Integer lastStudentID=1;
    final Integer studentID;

    Student() {
        super();
        studentID = lastStudentID + 1;
        lastStudentID=lastStudentID++;
    }
}

abstract class AbstractClass {
    Integer get() {
        return 10;
    }

    abstract void overided();
}
