package Chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3);  // 5는 3보다 크다 (참이면 true, 거짓이면 false)
        System.out.println(5 >= 3);  // 5는 3보다 크거나 같다 (true)
        System.out.println(5 >= 5);  // (true)
        System.out.println(5 <= 3);  // (false)

        System.out.println(5 == 5);  // 5는 5와 같다 (true)
        System.out.println(5 == 3);  // (false)
        System.out.println(5 != 5);  // 5는 5와 같지 않다 (false)
        System.out.println(5 != 3);  // (true)

        // System.out.println(1 < 3 < 5);  연속적으로 비교 연산은 불가
        System.out.println(1 < 3 && 3 < 5);  // 이렇게는 쓸 수 있음 (true)
        System.out.println((1 < 3) && (3 < 5));  // 가독성을 위해 괄호를 쓰는게 좋다
    }
}
