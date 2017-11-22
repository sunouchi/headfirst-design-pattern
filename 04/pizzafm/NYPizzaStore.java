public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("チーズ")) {
            return new NYStyleCheezePizza();
        } else if (item.equals("野菜")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("クラム")) {
            return new NYStyleClamPizza();
        } else if (item.equals("ペパロニ")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
