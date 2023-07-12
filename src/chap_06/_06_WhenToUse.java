package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
        // int result = number * number;  // number의 제곱을 구하는 식
        // return result;
        // 이럴 필요 없이 아래의 getPower() 메소드를 이용해서 제곱을 구할 수 있다.
        // number 를 2 만큼 반복해서 곱하면 그게 바로 제곱
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {  // number 을 exponent 만큼 반복해서 곱한다
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);  // 2 * 2 = 4

        // 3의 3승 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);  // 3 * 3 * 3 = 27

        // 4의 2승 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);  // 4 * 4 = 16

        // 값만 바뀌는 동일한 동작을 "중복" 하고 있다.
        // 메소드를 수정하려면 전부 수정해야하는 불편함

        System.out.println(getPower(2, 2));
        System.out.println(getPower(3, 3));
        System.out.println(getPower(4, 2));
    }

}
