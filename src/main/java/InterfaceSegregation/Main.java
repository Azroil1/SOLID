package InterfaceSegregation;

import LiskovSubstitution.Child;

public class Main {
    public static void main(String[] args) {
       Parent parent = new Parent("Bob");
       System.out.println(parent.work());
    }
}
