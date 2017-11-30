public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n紅茶を作っています...");
        teaHook.prepareRecipe();

        System.out.println("\nコーヒーを作っています...");
        coffeeHook.prepareRecipe();
    }
}
