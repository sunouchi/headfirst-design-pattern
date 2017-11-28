public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new noCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed() {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------- リモコン-------\n");
        for (int i = 0; i < 7; i++) {
            stringBuff.append(" [スロット" + i + "] " + onCommands[i].getClass().getName()
                              + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

    // public static void main(String[] args) {
    //     SimpleRemoteControl remote = new SimpleRemoteControl();
    //     Light light = new Light();
    //     LightOnCommand lightOn = new LightOnCommand(light);

    //     remote.setCommand(lightOn);
    //     remote.buttonWasPressed();
    // }
}