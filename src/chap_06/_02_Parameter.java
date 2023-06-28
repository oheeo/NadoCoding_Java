package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number) {  // Parameter 매개변수
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // Argument 인수
        power(2);  // 2 * 2 = 4
        power(5);  // 5 * 5 = 25

        powerByExp(2, 3);  // 2 * 2 * 2 = 8
        powerByExp(3, 4);  // 3 * 3 * 3 * 3 = 81
        powerByExp(10, 0);  // 1 (어떤수의 0승은 항상 1)
    }
}