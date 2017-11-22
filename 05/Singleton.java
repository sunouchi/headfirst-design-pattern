public class Singleton {
    private static Singleton uniqueInstance;

    // 有効な他の変数をここに宣言

    // コンストラクタはprivateで宣言されていて、
    // Singletonだけがこのクラスをインスタンス化できる
    private Singleton() {}

    // getInstance()メソッドはこのクラスをインスタンス化し、
    // そのインスタンスを返す
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
