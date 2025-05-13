public class Student {
    private String id;
    private String position;
    private String watchingVolleyBall;
    private Double onetoten;

    public Student(String id, String position, String watchingVolleyBall) {
        this.id = id;
        this.position = position;
        this.watchingVolleyBall = watchingVolleyBall;
        this.onetoten = onetoten;
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

    public void setOnetoten(Double onetoten) {this.onetoten = onetoten;}

    public double getOnetoten(){return onetoten;}

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + position + '\'' +
                ", course='" + watchingVolleyBall + '\'' +
                '}';
    }
}