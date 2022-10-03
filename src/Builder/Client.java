package Builder;

public class Client {

    public static void main(String[] args) {
         Student student = Student.getBuilder()
                                .setAge(20)
                                .setName("Tom")
                                .setGradYear(2023)
                                .build();
    }
}
