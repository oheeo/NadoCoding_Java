package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4
        // 9 * 9 = 81

        for (int i = 2; i < 10; i++) {
            int j = 1;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 1 = 2
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 2 = 4
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 3 = 6
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 4 = 8
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 5 = 10
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 6 = 12
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 7 = 14
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 8 = 16
            j++;
            System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 9 = 18

            System.out.println();
        }

        // 이걸 이중 반복문으로 간단하게!

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}