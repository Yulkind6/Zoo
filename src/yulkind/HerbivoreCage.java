package yulkind;

public class HerbivoreCage extends Cage{
    HerbivoreCage(int amount) {
        super(amount);
    }
    public boolean addAnimal(Animal animal) {
        if (animalsCount >= maxAnimals) {
            System.out.println("No space");
            return false;
        }
    }
}
