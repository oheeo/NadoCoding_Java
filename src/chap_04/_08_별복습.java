package chap_04;

public class _08_별복습 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------");

        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num);
                num ++;
            }
            System.out.println();
            num = 1;
        }

        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------");

    }
}
