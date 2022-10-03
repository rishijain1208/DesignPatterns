package Prototype;

public class Student implements Prototype<Student>{

    private int age;
    private String name;
    private String batch;
    private double avgBatchPsp;
    private double studentPsp;

    public Student()
    {
    }

    public Student(Student student)
    {
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.avgBatchPsp = student.avgBatchPsp;
        this.studentPsp = student.studentPsp;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student clone()
    {
        return new Student(this);
    }
}
