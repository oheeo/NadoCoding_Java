package chap_02;

public class _Quiz_02 {
/*    어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
      조건 1. 키가 120 cm 이상인 경우에만 탑승 가능
      조건 2. 삼항 연산자 사용  */

    public static void main(String[] args) {
        int height = 115;

/* 나의 풀이 String result = (height >= 120) ? "키가 " + height + "cm 이므로 탑승 가능합니다" : "키가 " + height + "cm 이므로 탑승 불가능합니다";
            System.out.println(result);
            결과는 똑같이 나오지만 코드가 지저분함 */

        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
