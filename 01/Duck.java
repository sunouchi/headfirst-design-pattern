public abstract class Duck {
  // 振る舞いインタフェース型のための2つの参照変数を宣言する
  // 同一パッケージ内のすべての鴨サブクラスはこれらを継承する
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("すべての鴨は浮かびます。おとりの鴨でも！");
  }

  public void setFlyBehavior(FlyBehavior fb) {
      flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
      quackBehavior = qb;
  }
}
