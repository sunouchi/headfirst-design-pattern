public class SimplePizzaFactory {
    public SimplePizzafactory(String type) {
        Pizza pizza = null;

        if (type.equals("チーズ")) {
            pizza = new CheezePizza();
        } else if (type.equals("ギリシャ")) {
            pizza = new GreekPizza();
        } else if (type.equals("ペパロニ")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("クラム")) {
            pizza = new ClamPizza();
        } else if (type.equals("野菜")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
