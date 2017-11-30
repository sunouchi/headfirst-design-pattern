public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

        System.out.println("Turkeyの出力...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuckの出力...");
        testDuck(duck);

        System.out.println("\nTurkeyAdaptorの出力...");
        testDuck(turkeyAdaptor);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
