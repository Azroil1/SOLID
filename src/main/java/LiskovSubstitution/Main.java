package LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Papa");
        Child child = new Child("Son");

        System.out.println(parent.run());
        System.out.println(child.run());
        System.out.println(child.learning());
        System.out.println(child.name);
    }
}
