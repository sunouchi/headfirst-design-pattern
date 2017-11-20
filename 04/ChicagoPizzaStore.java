public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("チーズ")) {
            return new ChicagoStyleCheezePizza();
        } else if (item.equals("ギリシャ")) {
            return new ChicagoStyleGreekPizza();
        } else if (item.equals("ペパロニ")) {
            return new ChicagoStylePepperoniPizza();
        } else if (item.equals("クラム")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("野菜")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
