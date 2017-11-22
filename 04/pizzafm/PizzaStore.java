public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // ファクトリメソッドはCreatePizza
    protected abstract Pizza CreatePizza(String type);

    // SimplePizzaFactory factory;

    // public PizzaStore(SimplePizzaFactory factory) {
    //     this.factory = factory;
    // }
}
