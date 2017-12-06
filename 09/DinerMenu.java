public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("ベジタリアンBLT",
                "レタス、トマト（偽）ベーコンをはさんだ全粒小麦パンサンドイッチ", true, 2.99);
        addItem("BLT",
                "レタス、トマト、ベーコンをはさんだ全粒小麦パンサンドイッチ", false, 2.99);
        addItem("本日のスープ",
                "ポテトサラダを添えた本日のスープ", true, 3.29);
        addItem("Hotdog",
                "ザワークラウト、レリッシュ、玉ねぎ、チーズをはさんだホットドッグ", false, 3.05);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("すみません、メニューがいっぱいです！メニューに項目を追加できません。");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    // public MenuItem[] getMenuItems() {
    //     return menuItems;
    // }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
