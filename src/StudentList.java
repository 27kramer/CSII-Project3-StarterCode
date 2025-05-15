import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private static List<Student> students = new ArrayList<>();

    public static void createStudent(Student student) {
        students.add(student);
    }

    public static List<Student> readStudents() {
        return students;
    }

    public static void updateStudent(Student updatedStudent) {
        for (Student s : students) {
            if (s.getId().equals(updatedStudent.getId())) {
                s.setPosition(updatedStudent.getPosition());
                s.setWatchingVolleyBall(updatedStudent.getWatchingVolleyBall());
                s.setOneToTen(updatedStudent.getOneToTen());
                s.setPracticesSkipped(updatedStudent.getPracticesSkipped());
                s.setStarter(updatedStudent.getIsStarter());
                s.setWillPLayInFuture(updatedStudent.getWillPLayInFuture());
                break;
            }
        }
    }

    public static void deleteStudent(Student student) {
        students.removeIf(s -> s.getId().equals(student.getId()));
    }
}