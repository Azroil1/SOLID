package InterfaceSegregation;

public class Parent implements IWork,IRun {
    String name;

    Parent(String name) {
        this.name = name;
    }

    @Override
    public String work() {
        return "I work";
    }

    @Override
    public String run(){
        return "I run";
    }
}
