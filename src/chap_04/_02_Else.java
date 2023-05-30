package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        // 오후 3시 이전이면 아메리카노, 이후엔 디카페인 주문
        int hour = 10;
        if (hour < 15) {
            System.out.println("아메라카노 +1");
        }
        else {
            System.out.println("디카페인 아메리카노 +1");
        }
        System.out.println("주문 완료 #1");

        // 오후 3시 이후거나, 모닝커피를 마신 경우 디카페인. 그 외엔 아메리카노
        hour = 16;
        boolean morningCoffee = false;
        if (hour > 15 || morningCoffee) {
            System.out.println("디카페인 아메리카노 +1");
        }
        else {
            System.out.println("아메리카노 +1");
        }
        System.out.println("주문 완료 #2");
    }
}
