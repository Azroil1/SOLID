package LiskovSubstitution;

public class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    protected String run(){
        return "i run";
    }
    protected String work(){
        return "I work";
    }
}
