public class teachers {
    private String teacherNamefirst;
    private String teacherNameLast;
    private String subject;

    public teachers(String teacherNamefirst, String teacherNameLast, String subject){
        this.subject = subject;
        this.teacherNamefirst = teacherNamefirst;
        this.teacherNameLast = teacherNameLast;
    }

    public String getTeacherNamefirst() {
        return teacherNamefirst;
    }

    public void setTeacherNamefirst(String teacherNamefirst) {
        this.teacherNamefirst = teacherNamefirst;
    }

    public String getTeacherNameLast() {
        return teacherNameLast;
    }

    public void setTeacherNameLast(String teacherNameLast) {
        this.teacherNameLast = teacherNameLast;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
