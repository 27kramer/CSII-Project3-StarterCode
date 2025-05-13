public class Student {
    private String id;
    private String position;
    private String course;

    public Student(String id, String position, String course) {
        this.id = id;
        this.position = position;
        this.course = course;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + position + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}