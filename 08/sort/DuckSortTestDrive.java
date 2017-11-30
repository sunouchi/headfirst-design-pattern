import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("ダフィー", 8),
            new Duck("デューイ", 2),
            new Duck("ハワード", 7),
            new Duck("ルーイ", 2),
            new Duck("ドナルド", 10),
            new Duck("ヒューイ", 2),
        };

        System.out.println("ソート前...");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nソート後...");
        display(ducks);
    }

    public static void display(Duck[] ducks){
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
