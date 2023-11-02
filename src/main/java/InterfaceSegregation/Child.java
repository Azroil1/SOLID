package InterfaceSegregation;

public class Child implements IStudy{
    String name;

    Child(String name){
        this.name = name;
    }

    @Override
    public String study() {
        return "I study";
    }
}
