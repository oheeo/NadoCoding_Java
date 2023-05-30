package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 1등 : 전액 장학금
        // 2등, 3등, 4등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 범위에 해당하는 조건)
        int ranking = 3;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2  || ranking == 3 || ranking == 4) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            case 4:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");
        /* 특정 case 에 해당한다면 case 내부에 있는 문장을 수행하고
          break 를 만나서 남은 switch case 문을 빠져나옴 */

        // case 2, case 3, case 4 를 통합
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");
        // break 가 없다면 다음 case 문장 수행


        // 중고상품 등급에 따른 가격을 책정 (1급: 최상 ~ 4급: 최하)
        int grade = 3;  // 등급
        int price = 5000;  // 기본 가격
        switch (grade) {
            case 1:
                price += 1000;   // price = price + 1000; 같은 뜻
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 8000원  (1등급의 경우 case 1으로 가서 +1000 수행 후 break가 없으니 아래 +1000 두개 더 수행)
        // 2등급 제품의 가격 : 7000원  (2등급의 경우 case 2으로 바로 가서 +1000 수행 후 아래 +1000도 수행)
        // 3등급 제품의 가격 : 6000원  (3등급의 경우 case 3으로 바로 가서 +1000 만 수행)
    }
}
