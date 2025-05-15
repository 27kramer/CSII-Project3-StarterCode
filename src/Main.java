import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO: Create a Student List object that stores preloaded student objects
        Student s1 = new Student("001", "Libero", "No", 9, 0, false, true);
        Student s2 = new Student("002", "outside", "yes", 10, 0, true,true);
        Student s3 = new Student("003", "Middle", "yes", 7, 0, true, true);
        Student s4 = new Student("004", "right side", "hell naw", 7, 5, true, true);
        Student s5 = new Student("005", "outside hitter and libero", "yes", 8, 0, false, true);
        Student s6 = new Student("006", "outside, setter", "yes", 10, 0, true, true);
        Student s7 = new Student("007", "libero", "yes", 9, 0, true, true);
        Student s8 = new Student("008", "middle back", "yes", 8, 10, true, false);
        Student s9 = new Student("009", "Outside/rightside", "no", 8, 1, false, true);
        Student s10 = new Student("010", "Middle Blocker and Libero", "no", 10, 0, true, true);
        StudentList.createStudent(s1);
        StudentList.createStudent(s2);
        StudentList.createStudent(s3);
        StudentList.createStudent(s4);
        StudentList.createStudent(s5);
        StudentList.createStudent(s6);
        StudentList.createStudent(s7);
        StudentList.createStudent(s8);
        StudentList.createStudent(s9);
        StudentList.createStudent(s10);
        // Student objects should be each student with info you collected

        while (true) {
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    createStudent(scanner);
                    break;
                case 2:
                    readStudents(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        // TO DO 1: fill out the rest of this
        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Do they watch volleyball? (yes/no): ");
        String watchingVolleyBall = scanner.nextLine();

        System.out.print("How much do they like volleyball (1–10): ");
        double oneToTen = scanner.nextDouble();

        System.out.print("How many practices have they skipped: ");
        double practicesSkipped = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Are they a starter? (true/false): ");
        boolean starter = scanner.nextBoolean();

        System.out.print("Will they play in the future? (true/false): ");
        boolean willPlayInFuture = scanner.nextBoolean();
        scanner.nextLine(); // consume newline

        // TO DO 2: create a student object with this information
        StudentList.createStudent(student);
        System.out.println("Student created successfully!");
    }

    private static void readStudents(Scanner scanner) {
        List<Student> students = StudentList.readStudents();
        // TO DO 3: print out each student
    }

    private static void updateStudent(Scanner scanner) {
        // TO DO 4: ask for new information to update student

        Student student = new Student(id, position, watchingVolleyBall, oneToTen, practicesSkipped, starter, willPlayInFuture);
        StudentList.updateStudent(student);
        System.out.println("Student updated successfully!");
    }

    private static void deleteStudent(Scanner scanner) {
        // TO DO 5: ask for student ID and store in a variable

        Student student = new Student(id, "", "");
        StudentList.deleteStudent(student);
        System.out.println("Student deleted successfully!");
    }
}