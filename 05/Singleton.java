public class Singleton {
    private volatile static Singleton uniqueInstance;

    // コンストラクタはprivateで宣言されていて、
    // Singletonだけがこのクラスをインスタンス化できる
    private Singleton() {}

    // getInstance()メソッドはこのクラスをインスタンス化し、
    // そのインスタンスを返す
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
