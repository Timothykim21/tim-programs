import java.util.PrimitiveIterator;

public class student {
    private String studentNameFirst;
    private String studentNameLast;
    private String courses;
    private int studentNum;
    private int grade;

    public student(String studentNameFirst, String studentNameLast, int studentNum, int grade, String courses){
        this.studentNameFirst = studentNameFirst;
        this.studentNameLast = studentNameLast;
        this.studentNum = studentNum;
        this.grade = grade;
        this.courses = courses;


    }

    public String getStudentNameFirst() {

        return studentNameFirst;
    }

    public void setStudentNameFirst(String studentNameFirst) {
        this.studentNameFirst = studentNameFirst;
    }

    public String getStudentNameLast() {
        return studentNameLast;
    }

    public void setStudentNameLast(String studentNameLast) {
        this.studentNameLast = studentNameLast;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
