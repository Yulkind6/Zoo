package yulkind;

public class Carnivarious extends Animal {
    @Override
    public boolean eat(int amount, Food food) {
        if (food instanceof AnimalFood){
            return super.eat(amount, food);
        }
        return false;
    }
}