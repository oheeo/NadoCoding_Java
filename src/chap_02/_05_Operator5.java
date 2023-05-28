package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;  // x > y 참이면 x값, 거짓이면 y값
        System.out.println(max);  // x값인 5 출력

        int min = (x < y) ? x : y;
        System.out.println(min);  // y값인 3 출력

        String s = (x != y) ? "같지 않다" : "같다";
        System.out.println(s);  // 같지 않다

        boolean b = (x == y) ? true : false;
        System.out.println(b);  // false
    }
}
