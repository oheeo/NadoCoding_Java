package chap_06;

public class _05_Overloading {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

//    public static int getPowerStr(String strNumber) {  // "4" 처럼 문자열로 받고
//        int number = Integer.parseInt(strNumber);  // 정수로 변환
//        return number * number;
//    }
    // 문자열로 받아도 number * number 을 쓸 수 있게 됐다.
    // 그러나 매개변수의 타입에 따라 메서드를 여러개 만들면 혼란이 올 수 있다.
    // 이럴땐 메서드 오버로딩! 메서드명을 동일하게 해주면 된다.
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

//    public static double getPower(int number, int exponent) {
//        return 0.1;
//    }
      // 반환형이 다른 타입으로는 중복 정의 할 수 없다.

    public static void main(String[] args) {
        System.out.println(getPower(3));  // 3 * 3 = 9
        System.out.println(getPower("4"));  // 4 * 4 = 16
        System.out.println(getPower(3, 3));  // 3 * 3 * 3 = 27
        // 전달되는 자료형에 따라 메서드 이름은 똑같지만 전달값이 다른 메서드를 각각 호출함
        // 메서드 오버로딩 : 같은 이름의 메서드를 여러번 선언
        // 전달값의 타입이 다르거나
        // 전달값의 개수가 다르거나
        // 반환형이 다른 타입으로는 X
    }

}
