package adapter;

/**
 * Adapter Pattern (어댑터 패턴)
 *
 * 이미 주어진 기능을 어댑터를 통해 필요에 맞게 사용할수 있도록 구현을 한다.
 *
 * ex) 110V의 전기를 220V를 어댑터를 사용해 220V 전기를 사용할수있도록 한다.
 */
public class Main {

    public static void main(String[] args) {

        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100F));
        System.out.println(adapter.half(100F));
    }
}