public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // すべての機器を適切な位置に作成する
        // Receiverの設定
        Light livingRoomLight = new Light("リビングルーム");
        Light kitchenLight = new Light("キッチン");
        CeilingFan ceilingFan = new CeilingFan("リビングルーム");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("リビングルーム");

        // すべてのLightコマンドオブジェクトを作成する
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // 天井の扇風機用のOnとOffのコマンドを作成する
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // 車庫用の「開く」「閉じる」コマンドを作成する
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        // ステレオのOnとOffのコマンドを作成する
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // すべてのコマンドをリモコンのスロットにロードする
        // Invoker に Command を読み込む
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        // toStringメソッドを使い、リモコンの各スロットに割り当てられたコマンドを出力する
        System.out.println(remoteControl);

        // 各スロットのボタンを押す
        // remoteControl.onCommands[0].onButtonWasPressed();
        // remoteControl.offCommands[0].onButtonWasPressed();
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }
}
