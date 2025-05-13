public class Student {
    private String id;
    private String position;
    private String watchingVolleyBall;

    public Student(String id, String position, String watchingVolleyBall) {
        this.id = id;
        this.position = position;
        this.watchingVolleyBall = watchingVolleyBall;
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

    public String getWatchingVolleyBall() {
        return watchingVolleyBall;
    }

    public void setWatchingVolleyBall(String watchingVolleyBall) {
        this.watchingVolleyBall = watchingVolleyBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + position + '\'' +
                ", course='" + watchingVolleyBall + '\'' +
                '}';
    }
}