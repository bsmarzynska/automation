package inheritance;

public class Person {
    private String name;

    public void sayHi() {
        System.out.println("I'm base class!");
    }

    public void explainNonstaticMethod() {
        System.out.println("I'm nonstatic method!");
        System.out.println("You have to create object to use me!");
    }

    static public void explainStaticMethod() {
        System.out.println("I'm static method!");
        System.out.println("You don't need to create object to use me!");
    }
}
