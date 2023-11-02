package OpenClosed;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal animal1 = new Cat("Murka", 4, 3, "Чеширская");
        Animal animal2 = new Cat("Вurka", 3, 2, "Чеширская");
        Animal animal3 = new Dog("Bob", 4, 6, "Дворняга");
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).say());
        }

    }
}
