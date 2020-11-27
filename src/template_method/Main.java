package template_method;

/**
 * Template Method Pattern (템플릿 메소드 패턴)
 *
 * 공통적인 프로세스를 묶어주는 패
 *
 * 구현하는 알고리즘이 일정한 프로세스가 있다.
 * 구현하는 알고리즘이 변경 가능성이 있다.
 */
public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();

        helper.requestConnection("접속 정보");
    }
}
