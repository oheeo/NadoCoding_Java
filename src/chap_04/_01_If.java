package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10;  // 오전 10시

        // 오후 3시 이전이면 커피 주문, 이후엔 주문 X

        // if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if (hour < 15)
            System.out.println("아메리카노 +1");
        
        // if 문 내에서 2개 이상의 문장을 실행할 때느 { } 생략 불가
        if (hour < 15) {
            System.out.println("아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("주문 완료 #1");


        // 오후 3시 이전이고, 모닝커피를 마시지 않은 경우 주문
        hour = 10;
        boolean morningCoffee = false;
        if (hour < 15 && !morningCoffee) {
            System.out.println("아메리카노 +1");
        }
        System.out.println("주문 완료 #2");
        // if (hour < 15 && morningCoffee == false)
        // if (hour < 15 && !morningCoffee) 같은 뜻


        // 오후 3시 이후거나 모닝커피를 마신 경우 디카페인 주문
        hour = 16;
        morningCoffee = true;
        if (hour >= 15 || morningCoffee) {
            System.out.println("디카페인 아메리카노 +1");
        }
        System.out.println("주문 완료 #3");
        // if (hour >= 15 || morningCoffee == true)
        // if (hour >= 15 || morningCoffee) 같은 뜻
    }
}
