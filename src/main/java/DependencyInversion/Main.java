package DependencyInversion;

public class Main {
    public static void main(String[] args) {
        SaveModelInDB saveModelInDB = new SaveModelInDB();
        Person person = new Person("Pop");
        PostgresDB postgresDB = new PostgresDB();
        MySQL mySQL = new MySQL();
        saveModelInDB.save(person,postgresDB);
        saveModelInDB.save(person,mySQL);
    }
}
