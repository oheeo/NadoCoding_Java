package chap_06;

public class _07_VariableScope {

    public static void methodA(int number) {
        // System.out.println(result);
        System.out.println(number);  // 디폴트값인 0 출력
    }

    public static void methodB() {
        int result = 1;  // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i);  // for문 내에서 선언된 변수 i는 for문 내에서만 사용 가능

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        // System.out.println(j);
    }

}
