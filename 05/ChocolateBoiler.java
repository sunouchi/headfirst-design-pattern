public class ChocolateBoiler {
    private boolean empty;
    private boolean boied;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 牛乳とチョコレートの混合液でボイラを満たす
        }
    }

    // 残りのChocolateBoilerのコード...
}
