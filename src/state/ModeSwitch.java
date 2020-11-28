package state;

public class ModeSwitch {
    private ModeState modeState = new ModeStateLight();

    public void setState(ModeState modeState) {
        this.modeState = modeState;
    }

    public void onSwitch() {
        modeState.toggle(this);
    }
}
