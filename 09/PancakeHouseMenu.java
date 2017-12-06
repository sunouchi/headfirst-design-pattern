import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&Bのパンケーキ朝食",
                "スクランブルエッグとトーストが付いたパンケーキ",
                true,
                2.99);

        addItem("通常のパンケーキ朝食",
                "卵焼きとソーセージが付いたパンケーキ",
                false,
                2.99);

        addItem("ブルーベリーパンケーキ",
                "新鮮なブルーベリーで作ったパンケーキ",
                true,
                3.49);

        addItem("ワッフル",
                "ブルーベリーかいちごの好きな方をのせたワッフル",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    // public ArrayList getMenuItems() {
    //     return menuItems;
    // }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}

