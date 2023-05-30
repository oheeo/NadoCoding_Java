package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 망고에이드가 있다면 +1
        // 없으면 토마토주스 +1
        // 토마토주스도 없으면 오렌지주스 +1
        // 셋 다 없으면 아메리카노 +1
        boolean mangoAde = false;
        boolean tomatoJuice = false;
        boolean orangeJuice = true;

        if (mangoAde) {
            System.out.println("망고에이드 +1");
        } else if (tomatoJuice) {
            System.out.println("토마토주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지수스 +1");
        } else {
            System.out.println("아메리카노 +1");
        }
        System.out.println("주문 완료");
    }
    // else if 는 여러번 사용 가능
    // else 는 없어도 가능 (else 없다면 조건 만족하는거 없을때 아무것도 출력 X)
}
