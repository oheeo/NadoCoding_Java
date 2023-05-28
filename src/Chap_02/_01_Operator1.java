package Chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 일반 연산
        System.out.println(4 + 2);  // 6
        System.out.println(4 - 2);  // 2
        System.out.println(4 * 2);  // 8
        System.out.println(4 / 2);  // 2
        System.out.println(5 / 2);  // 2 (2.5지만 결과는 정수값으로 나옴)
        System.out.println((double)5 / 2);  // 2.5
        System.out.println(4 % 2);  // 0 (4를 2로 나눈 나머지값)
        System.out.println(5 % 2);  // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);  // 6 (곱하기 먼저)
        System.out.println((2 + 2) * 2);  // 8 (괄호 먼저)

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;  // 일단 변수 c 선언

        c = a + b;
        System.out.println(c);  // 30

        c = a / b;  // 전에 c 값이 뭐였든간에 a/b값을 왼쪽 c에 집어 넣는것
        System.out.println(c);  // 2

        c = a % b;
        System.out.println(c);  // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);  // 10
        System.out.println(++val);  // val+1 => System.out.println 을 통해 출력 => 11(출력된 값)
        System.out.println(val);  // 11 (위에서 출력 전 val=11 이 됐으니)
        // ++val  (val+1 후 앞 문장에 수용되는것)

        val = 10;  // 다시 10으로 업데이트
        System.out.println(val);  // 10
        System.out.println(val++);  // System.out.println 을 통해 val 값만 출력 => 10(출력된 값) => val+1 해놔(여기서 val의 값이 변함)
        System.out.println(val);  // 11 (위에서 출력 후 val=11 이 됐으니)
        // val++ (현재 val의 값으로 앞 문장 수용 후 val+1)

        val = 10;
        System.out.println(val);  // 10
        System.out.println(val--);  // System.out.println 을 통해 val 값만 출력 => 10(출력된 값) => val-1 해놔(여기서 val의 값이 변함)
        System.out.println(val);  // 9 (위에서 출력 후 val=9 가 됐으니)
        
        // 증감 연산 예시) 은행 대기번호 표
        int waitting = 0;  // 내가 첫 손님일때
        System.out.println("대기 인원: " + waitting++);  // 내게 출력된 값은 0이지만 내 다음 부터 +1 증가한다 (대기표 뽑았을때)
        System.out.println("대기 인원: " + waitting++);  // 대기 인원: 1
        System.out.println("대기 인원: " + waitting++);  // 대기 인원: 2 (출력은 2지만 이후 waitting은 3이 된다)
        System.out.println("총 대기 인원:" + waitting);  // 3 (직원이 볼 땐 대기인원 3명인거야)
    }
}
