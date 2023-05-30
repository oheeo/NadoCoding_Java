package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        // 수영장에서 수영을 할 때 키가 엄청 큰 사람?

        // while 문은 조건을 먼저 보고 참이면 안에 있는 문장을 실행
        int distance = 25;  // 전체 거리 25m
        int move = 0;  // 현재 이동 거리 0m
        int height = 25;  // 키 25m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        // [출력] 도착했습니다.


        // do while 문은 조건 상관없이 일단 do 에 있는 문장을 실행 후 조건을 보고 반복할지 결정
        // 최소 한번은 do 영역 실행
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
        // [출력] 발차기를 계속 합니다.
        //       현재 이동거리 : 0
        //       도착했습니다.
    }
}
