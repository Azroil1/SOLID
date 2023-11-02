package DependencyInversion;

public class SaveModelInDB {
    public void save(Model model, DataBase dataBase){
        dataBase.save(model);
    }
}
