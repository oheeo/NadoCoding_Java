package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean coffee = true;
        boolean cake = true;
        boolean icecream = false;

        // Or 연산  ||
        System.out.println(coffee || cake || icecream);  // 셋 중 하나라도 true면 true
        System.out.println((5 > 3) || (1 > 3));  // 하나는 참이기에 true
        System.out.println((5 < 3) || (1 > 3));  // 둘 다 거짓이기에 false
        System.out.println(5 < 3 || 1 > 3);  // 이렇게도 가능 false (가독성을 위해 괄호를 적는게 좋겠지?)

        // And 연산  &&
        System.out.println(coffee && cake && icecream);  // 모두 true 이면 true
        System.out.println((5 > 3) && (1 > 3));  // false
        System.out.println((5 > 3) && (1 < 3));  // true
        System.out.println(5 > 3 && 1 < 3);  // 이렇게도 가능 true (가독성을 위해 괄호를 적는게 좋겠지?)

        // System.out.println(1 < 3 < 5);  // 연속적으로 비교 연산은 불가

        // 논리 부정 연산자  !
        System.out.println(!true);  // true의 반대값을 출력 => false
        System.out.println(!false);  // true
        System.out.println(!(5 == 5));  // 5==5 는 true지만 ! 붙었기에 false 출력
        System.out.println(!(5 == 3));  // 5==3 은 false지만 ! 붙었기에 true 출력
    }
}
