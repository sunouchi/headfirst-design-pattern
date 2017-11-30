import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("フィルタでコーヒーをドリップします");
    }

    public void addCondiments() {
        System.out.println("砂糖とミルクを追加します");
    }

    public boolean CustomerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("コーヒーに砂糖とミルクを淹れますか？ (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("回答読み込み時のI/Oエラー");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
