import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clasms clam;

    abstract void prepare();

    void bake() {
        System.out.println("350度で25分間焼く");
    }

    void cut() {
        System.out.println("ピザを扇形に切り分ける");
    }

    void box() {
        System.out.println("PizzaStoreの正式な箱にピザを入れる");
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        // ピザを出力するコード
    }
}
