package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // for 문
        int max = 20;  // 최대 치킨 판매 수량
        int sold = 0;  // 현재 치킨 판매 수량
        int noShow = 17;  // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 노쇼 고객이 있다면?
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 넘어갑니다.");
                continue;
            }

            sold++;
            if (sold == max)  {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");


        // while 문
        int index = 0;  // 손님 번호
        sold = 0;  // sold 초기화
        while (index < 50) {
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 넘어갑니다.");
                continue;
            }
            sold++;  // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
