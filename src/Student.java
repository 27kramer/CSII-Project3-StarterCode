public class Student {
    private String id;
    private String position;
    private String watchingVolleyBall;
    private Double oneToTen;
    private Double practicesSkipped;
    private boolean starter;
    private boolean willPLayInFuture;

    public Student(String id, String position, String watchingVolleyBall) {
        this.id = id;
        this.position = position;
        this.watchingVolleyBall = watchingVolleyBall;
        this.oneToTen = oneToTen;
        this.practicesSkipped = practicesSkipped;
        this.starter = starter;
        this.willPLayInFuture = willPLayInFuture;
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

    public Double getOneToTen() {
        return oneToTen;
    }
    public void setOneToTen(Double oneToTen) {
        this.oneToTen = oneToTen;
    }
    public Double getPracticesSkipped(){
        return practicesSkipped;
    }
    public void getSetPracticesSkipped(Double practicesSkipped) {
        this.practicesSkipped = practicesSkipped;
    }

    public boolean setIsStarter() {
        return starter;
    }
    public void setStarter(boolean starter) {
        this.starter = starter;
    }

    public boolean getWillPLayInFuture() {
        return willPLayInFuture;
    }
    public void setWillPLayInFuture(boolean willPLayInFuture) {
        this.willPLayInFuture = willPLayInFuture;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", do they watch volleyball='" + watchingVolleyBall + '\'' +
                ", how much do they like volleyball=" + oneToTen + '\'' +
                "practices skipped=" + practicesSkipped + '\'' +
                "is starter=" + starter + '\'' +
                "will play in future=" + willPLayInFuture + '\'' +
                '}';
    }
}