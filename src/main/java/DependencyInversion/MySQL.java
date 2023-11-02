package DependencyInversion;

public class MySQL implements DataBase{
    @Override
    public void save(Model model) {
        System.out.println("Save in MySQL");
    }
}
