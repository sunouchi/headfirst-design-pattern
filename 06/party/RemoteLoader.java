public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("リビングルーム");
        TV tv = new TV("リビングルーム");
        Stereo stereo = new Stereo("リビングルーム");
        Hottub hottub = new Hottub();

        // Onオブジェクト
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        // Offオブジェクト
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        // Commadの実現クラス
        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // remoteControlにコマンドをロードする
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        // 出力
        System.out.println(remoteControl);
        System.out.println("------マクロのOnを押す------");
        remoteControl.onButtonWasPressed(0);
        System.out.println("------マクロのOffを押す------");
        remoteControl.offButtonWasPressed(0);
    }
}
