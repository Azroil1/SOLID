package SingleResponsibility;

public class SavePerson implements Save {

    @Override
    public void save(String link, Model model){
        System.out.println("Сохранеие человека " + model + " в " + link);
    }

}
