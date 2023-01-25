package SpecialMethods;

public class Main {
    public static void main(String[] args) {
        // Let's create a new Student Object, AKA an instance of hte
        // Student (CLASSES ARE TYPES OF OBJECTS)
        Student kayla = new Student("Kayla", "Cato", "Tom");

        kayla.setTA("Steve");
//        System.out.println(kayla.getTA());

        // Let's override the default behavior of the toString method in the
        // the Student class so that when we print a Student object to the console
        // a nice formatted sentence containing information about the object
        // shows up in the console
        System.out.println(kayla.toString());

        Student mayfield = new Student("Donniqua", "Mayfield", "Amanda");
        System.out.println(mayfield);

        Student mayfieldClone = new Student("Donniqua", "Mayfield", "Amanda");

        System.out.println(mayfieldClone.equals(mayfield));

        System.out.println(kayla.getTA().equals(mayfield.getTA()));
    }
}
