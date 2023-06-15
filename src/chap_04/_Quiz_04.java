package chap_04;

public class _Quiz_04 {
/*    조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.
      - 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
      - 경차 또는 장애인 차량은 최종 요금에서 50% 할인
      [예시]- 일반 차량 5시간 주차시 20000원
           - 경차 5시간 주차시 10000원
           - 장애인 차량 10시간 주차시 15000원  */

    public static void main(String[] args) {
        int hour = 10;  // 주차 시간
        boolean smallCar = false;  // 경차
        boolean disabled = true;  // 장애인

        int fee = hour * 4000;  // 요금

        if (fee > 30000) {
            fee = 30000;
        }
        if (smallCar || disabled) {
            fee /= 2;
        }
        System.out.println("주차 요금은 " + fee + "원 입니다.");

        }

}
