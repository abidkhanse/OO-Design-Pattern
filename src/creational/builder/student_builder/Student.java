package src.creational.builder.student_builder;

public class Student {

    private String name;
    private int age;
    private String id;
    private String address;

    Student() {}

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setId(String id) {
        this.id = id;
        return this;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }


    public Student build() {
        return this;
    }

    public static Student builder() {
        return new Student();
    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
