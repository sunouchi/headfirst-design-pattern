public class ChicagoStyleCheezePizza extends Pizza {
    public ChicagoStyleCheezePizza() {
        name = "シカゴスタイルのディープディッシュチーズピザ";
        dough = "極厚クラフト生地";
        sauce = "プラムトマトソース";

        toppings.add("刻んだモッツァレラチーズ");
    }
    void cut() {
        System.out.println("ピザを四角形に切り分ける");
    }
}
