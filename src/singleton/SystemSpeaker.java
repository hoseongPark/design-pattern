package singleton;

public class SystemSpeaker {

    static SystemSpeaker instance;
    private int volum;

    private SystemSpeaker() {
        volum = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        } else {
            System.out.println("이미 생성");
        }

        return instance;
    }

    public int getVolume() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }
}
