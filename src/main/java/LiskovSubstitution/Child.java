package LiskovSubstitution;

public class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    public String learning(){
        return "I am study";
    }
}
