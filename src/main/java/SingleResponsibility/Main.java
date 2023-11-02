package SingleResponsibility;

public class Main {
    public static void main(String[] args) {
        Model model = new Person(1, "Vasya", 32);
        SavePerson sp = new SavePerson();
        sp.save("http://amir.ru", model);
    }
}
