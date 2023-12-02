class Student extends Person {
    Classroom classroom;

    //here is student class
    public Student(int id,
                   String name, int age, String classroom, boolean parent_permission)
    {
        super(id,name, age);
    }

    public Classroom getClassroom() {
        return classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}