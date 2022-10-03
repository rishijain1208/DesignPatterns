package Prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry)
    {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("Apr22");
        aprBatchStudent.setAvgBatchPsp(90.0);

        studentRegistry.register("Apr22Batch",aprBatchStudent);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setIq(120);
        intelligentStudent.setBatch("Apr22Int");
        intelligentStudent.setAvgBatchPsp(100.0);

        studentRegistry.register("Apr22Int",intelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student ram = studentRegistry.get("Apr22Batch").clone();
        ram.setName("Ram");
        ram.setAge(25);
        ram.setStudentPsp(92);

        Student shyam = studentRegistry.get("Apr22Batch").clone();
        shyam.setName("Shyam");
        shyam.setAge(28);
        shyam.setStudentPsp(94);


        Student geeta = studentRegistry.get("Apr22Int").clone();
        geeta.setName("Geeta");
        geeta.setAge(22);
        geeta.setStudentPsp(90);
    }
}
