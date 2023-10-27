package homework.week01.printinfo;

public class User {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide user details: <First Name> <Last Name> <Age> <Height[m]>");
        } else {
            String firstName = args[0];
            String lastName = args[1];
            int age = Integer.parseInt(args[2]);
            double height = Double.parseDouble(args[3]);

            System.out.println("User details:");
            System.out.println("First name = " + firstName);
            System.out.println("Last name = " + lastName);
            System.out.println("Age = " + age);
            System.out.println("Height = " + height + " m");
        }
    }
}
