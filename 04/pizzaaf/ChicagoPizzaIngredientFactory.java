public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlamTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
        return new veggies();
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clam createClam() {
        return new FrozenClams();
    }

}
