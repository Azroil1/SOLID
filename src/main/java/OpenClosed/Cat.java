package OpenClosed;

public class Cat implements Animal {
    private String name;
    private int paws;
    private int weight;
    private String breed;

    public Cat(String name, int paws, int weight, String breed) {
        this.name = name;
        this.paws = paws;
        this.weight = weight;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String say(){
        return "May - mya";
    }
}
