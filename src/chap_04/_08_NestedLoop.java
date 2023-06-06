package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
        /*

         *****
         *****
         *****
         *****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         /*  for (int j = 0; j < 5; j++) {
              System.out.print("*");
             }
             System.out.println();
             이 작업을 5번 한다고 생각하면돼  */

        System.out.println("---------------#1---------------");

        /*
        12345
        12345
        12345
        12345
        12345
         */
        int start = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(start);
                start++;
            }
            start = 1;
            System.out.println();
        }

        System.out.println("---------------#2---------------");

        // 별 (*) 왼쪽 삼각형 만들기
        /*

         *
         **
         ***
         ****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*
        반복문 없이 풀어 쓰면
        for (int i = 1; i <= 1; i++) {
            System.out.print("*");   // 한번 반복
        }
        System.out.println();        // 줄바꿈
        for (int i = 1; i <= 2; i++) {
            System.out.print("*");   // 두번 반복
        }
        System.out.println();        // 줄바꿈
        for (int i = 1; i <= 3; i++) {
            System.out.print("*");   // 세번 반복
        }
        System.out.println();        // 줄바꿈
        for (int i = 1; i <= 4; i++) {
            System.out.print("*");   // 네번 반복
        }
        System.out.println();        // 줄바꿈
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");   // 다섯번 반복
        }
*/
       // j <= i  조건은  j < i + 1  로 써도 같다.

        System.out.println("---------------#3---------------");

        /*

         *****
          ****
           ***
            **
             *

         */
        for (int i = 0; i < 5; i++) {
            // 스페이스 반복문 (첫줄 실행X, 둘째줄 1번, 셋째줄 2번, 넷째줄 3번, 다섯번째줄 4번)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 반복문 (j>i)
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // ↑ 다른 방법 ↓
        System.out.println("---------------다른 방법---------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("---------------#4---------------");

        /*

             *
            **
           ***
          ****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 나는 이렇게 풀었는데↑ 인강에선 이렇게 풀음↓ (규훈님께서 아래 방법을 선호하심. 0부터 시작하는걸 좋아해서)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }
