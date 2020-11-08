package yulkind;

public class Cage {
    private Animal[] animals;
    private int maxAnimals;
    private int animalsCount;
    Cage(int amount) {
        if (amount > 0) {
            animals = new Animal[amount];
            maxAnimals = amount;
        }
        else {
            System.out.print("No cage can be created");
        }
    }
    public boolean addAnimal(Animal animal) {
        if (animalsCount >= maxAnimals) {
            System.out.println("No space");
            return false;
        }
        else {
            animals[animalsCount] = animal;
            animalsCount ++;
        }
    }
}
