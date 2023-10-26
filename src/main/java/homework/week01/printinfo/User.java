package homework.week01.printinfo;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private boolean active;

    public User(String firstName, String lastName, int age, double height, boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.active = active;
    }

    public void printInfo() {
        System.out.println(
                "First name=" + firstName +
                ", Last name=" + lastName +
                ", Age=" + age +
                ", Height[m]=" + height +
                ", Active=" + active
        );
    }
}
