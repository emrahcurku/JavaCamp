package entities;

public class Course {
    private int courseId;
    private String courseName;
    private double unitPrice;

    public Course(int courseId, String courseName, double unitPrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.unitPrice = unitPrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
