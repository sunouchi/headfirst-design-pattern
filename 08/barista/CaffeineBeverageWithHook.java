public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (CustomerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("お湯を沸かします");
    }

    void pourInCup() {
        System.out.println("カップに注ぎます");
    }

    boolean CustomerWantsCondiments() {
        return true;
    }
}
