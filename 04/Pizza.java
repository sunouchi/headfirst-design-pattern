import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println(name + "を下処理" + name);
        System.out.println("生地をこねる......");
        System.out.println("ソースを追加......");
        System.out.println("トッピングを追加......");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("350度で25分間焼く");
    }

    void cut() {
        System.out.println("ピザを扇形に切り分ける");
    }

    void box() {
        System.out.println("PizzaStoreの正式な箱にピザを入れる");
    }

    public String getName() {
        return name;
    }
}
