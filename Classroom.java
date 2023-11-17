public class Classroom {
    private String label;
    private Student[] students;
    private int studentCount;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public Classroom(String label, int capacity) {
        this.label = label;
        this.students = new Student[capacity];
        this.studentCount = 0;
    }

    // other methods...

    public int getStudentCount() {
        return studentCount;
    }

    public void addStudent(Student student1) {
    }
}