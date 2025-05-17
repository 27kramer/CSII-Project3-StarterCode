import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//emil
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
            System.out.println("6. Analyze Data");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    createStudent(scanner);
                    break;
                case 2:
                    readStudents();
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
                case 6:
                    analyzeData();
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createStudent(Scanner scanner) {//nicky and aydin
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
        Student student = new Student(id, position, watchingVolleyBall, oneToTen, practicesSkipped, starter, willPlayInFuture);
        StudentList.createStudent(student);
        System.out.println("Student created successfully!");
    }

    private static void readStudents() { //william and aydin
        List<Student> students = StudentList.readStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nCurrent Students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }


    private static void updateStudent(Scanner scanner) { //william
        System.out.print("Enter the ID of the student to update: ");
        String id = scanner.nextLine();

        // Find the existing student
        List<Student> all = StudentList.readStudents();
        boolean found = all.stream().anyMatch(s -> s.getId().equals(id));
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
            return;
        }

        System.out.print("Enter new position: ");
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

        Student updated = new Student(
                id, position, watchingVolleyBall,
                oneToTen, practicesSkipped, starter, willPlayInFuture
        );
        StudentList.updateStudent(updated);
        System.out.println("Student updated successfully!");
    }


    private static void deleteStudent(Scanner scanner) { //William and emil
        System.out.print("Enter the ID of the student to delete: ");
        String id = scanner.nextLine();

        Student toDelete = new Student(id, "", "", 0.0, 0.0, false, false);
        StudentList.deleteStudent(toDelete);
        System.out.println("Student deleted successfully!");
    }
    private static void analyzeData() { //william
        List<Student> students = StudentList.readStudents();
        if (students.isEmpty()) {
            System.out.println("No data to analyze.");
            return;
        }

        double maxRating = Double.NEGATIVE_INFINITY;
        double minRating = Double.POSITIVE_INFINITY;
        double sumRating = 0;

        double maxSkipped = Double.NEGATIVE_INFINITY;
        double minSkipped = Double.POSITIVE_INFINITY;

        for (Student s : students) {
            double rating = s.getOneToTen();
            double skipped = s.getPracticesSkipped();

            // rating stats
            sumRating += rating;
            if (rating > maxRating) maxRating = rating;
            if (rating < minRating) minRating = rating;

            // practicesSkipped stats
            if (skipped > maxSkipped) maxSkipped = skipped;
            if (skipped < minSkipped) minSkipped = skipped;
        }

        double avgRating = sumRating / students.size();

        System.out.println("\n--- Data Analysis ---");
        System.out.printf("Rating (1–10) → max: %.1f, min: %.1f, avg: %.2f%n",
                maxRating, minRating, avgRating);
        System.out.printf("Practices Skipped → max: %.0f, min: %.0f%n",
                maxSkipped, minSkipped);
    }
}


