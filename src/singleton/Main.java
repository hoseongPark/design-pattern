package singleton;

/**
 * 싱글톤(Singleton)
 * 생성 패턴중 하나
 *
 * 전역변수로 설정하는것이 아닌 하나의 인스턴스로 모두공유하여 사용할수있도록 하는 패턴.
 *
 * ex) 리모콘으로 100대의 스피커의 볼륨을 모두 조절해야한다.
 */

public class Main {
    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolum(11);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolum(22);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }
}