package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 이마트에 손님이 오면?
        System.out.println("어서오세요. 이마트입니다.");
        // 또 다른 손님이 오면?
        System.out.println("어서오세요. 이마트입니다.");
        System.out.println("어서오세요. 이마트입니다.");
        System.out.println("어서오세요. 이마트입니다.");
        // 만약 인사법이 바뀌면?
        System.out.println("환영합니다. 이마트입니다.");
        System.out.println("환영합니다. 이마트입니다.");
        System.out.println("환영합니다. 이마트입니다.");
        // 만약 매장 이름이 바뀌면?
        System.out.println("환영합니다. 롯데마트입니다.");
        System.out.println("환영합니다. 롯데마트입니다.");
        System.out.println("환영합니다. 롯데마트입니다.");

        // 반복문 For 사용
        for (int i = 0; i < 10 ; i++) {
            // System.out.println("어서오세오. 이마트입니다.");
            // System.out.println("환영합니다. 이마트입니다.");
            System.out.println("환영합니다. 롯데마트입니다. " + i);
        }
        // i 라는 int 형 변수를 만들고 초기값을 0으로 설정
        // i 가 10 보다 작을때까지 반복
        // 한번 돌때마다 i = i + 1
        // "환영합니다. 롯데마트입니다. " 뒤에 +i 는 그냥 내가 보려고 적은것

        // For 응용
        // 짝수만 출력
        // 02468
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        // System.out.print();  print 뒤에 ln 떼면 줄바꿈 없이 출력됨

        System.out.println();

        // 홀수만 출력
        // 13579
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 출력
        // 54321
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;  // 처음엔 0으로 초기화
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
        // 처음엔 sum=0 이었지만 반복문이 돌때마다 sum=sum+i(1) -> sum=sum+i(1)+i(2) -> sum=sum+i(1)+i(2)+i(3)...
            
    }
}
