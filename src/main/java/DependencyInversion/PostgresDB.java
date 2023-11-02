package DependencyInversion;

public class PostgresDB implements DataBase{

    @Override
    public void save(Model model) {
        System.out.println("Save in Postgres");
    }
}
