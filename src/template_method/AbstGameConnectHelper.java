package template_method;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // Template Method
    public String requestConnection(String str) {

        // 보안작업 -> 암호화 된 문자열을 복호화 한다.
        doSecurity(str);

        // 인증작업 -> 아이디와, 패스워드가 맞는가?
        String id = "hoseong";
        String password = "hoseong";
        authentication(id, password);

        // 권한작업 -> 사용할수있는 권한이 있는가?
        String userName = "hoseong";
        int i = authorization(userName);

        switch (i) {
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("권한 없음");
                break;
            default:
                System.out.println("기본 회원");
                break;
        }

        return connection("hoseong");
    }
}
