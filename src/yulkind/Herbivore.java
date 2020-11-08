package yulkind;

public class Herbivore extends Animal {
    @Override
    public boolean eat(int amount, Food food) {
        if (food instanceof PlantFood){
            return super.eat(amount, food);
        }
        return false;
    }
}
