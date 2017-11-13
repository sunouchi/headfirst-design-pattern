public class MallardDuck extends Duck {
  public MallardDuck() {
    // MallardDuckはQuackクラスを使用してなく振る舞いを処理しているため
    // performQuack()が呼び出されると、なく振る舞いの責務をQuackオブジェクトに委譲し、
    // 実際のなく振る舞いを取得している
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("本物のマガモです");
  }
}

