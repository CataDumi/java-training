package clean.code.design_patterns.requirements.decorator;

public class Decorator implements Food {
    private Food newFood;

    public Decorator(Food newFood) {
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double foodPrice() {
        return newFood.foodPrice();
    }
}