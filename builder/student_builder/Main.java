package builder.student_builder;

public class Main {
    public static void main(String[] args) {

        Student student = Student.builder()
                .setAge(20)
                .setName("Sher")
                .setId("BS-123").
                setAddress("Stockholm")
                .build();

        System.out.println(student.toString());

    }
}
