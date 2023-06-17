package chap_05;

public class _04_MultiArrayLoop_for_each {
    public static void main(String[] args) {

        // 복사한 배열 값 변경
        int[] b = {1, 2, 3};
        int[] c = b;
        c[0] = 7;
        System.out.println(b[0]);
        System.out.println(c[0]);

        System.out.println("----------");

        // for 문으로 배열 꺼내기
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (i + 3);
            System.out.println(a[i]);
        }

        System.out.println("----------");

        // for each 문으로 배열 꺼내기
        int[] numbers = new int[5];
        int i = 1;
        for (int k : numbers) {
            numbers[k] = i;
            System.out.print(numbers[k]);
            i++;
        }
        // i++ 을 이렇게 축약할 수도 있다
//        int[] numbers = new int[5];
//        int i = 1;
//        for (int k : numbers) {
//            numbers[k] = i++;
//            System.out.print(numbers[k] + " ");
//        }

        System.out.println("----------");

        // for each 문으로 2차원 배열 꺼내기 (방법1)
//        int[][] numArr = new int[2][];
//        int[] num1 = new int[5];
//        int[] num2 = new int[10];
//
//        for (int j = 0; j < num1.length; j++) {
//            num1[j] = j + 1;
//        }
//
//        for (int j = 0; j < num2.length; j++) {
//            num2[j] = j + 6;
//        }
//
//        numArr[0] = num1;
//        numArr[1] = num2;
//
//        for (int[] arr : numArr) {
//            for (int n : arr) {
//                System.out.print(n + " ");
//            }
//            System.out.println();
//        }

        System.out.println("----------");

        // for each 문으로 2차원 배열 꺼내기 (방법2)
//        int[][] cc = new int[2][];
//        cc[0] = new int[5];
//        cc[1] = new int[10];
//
//        int k = 1;
//        for (int nn[] : cc) {
//            for (int j : nn) {
//                nn[j] = k++;
//                System.out.print(nn[j] + " ");
//            }
//            System.out.println();
//
//        }

        System.out.println("----------");

        // for each 문으로 다중 배열 꺼내기 (방법1)
//        int[][] multiArr = {
//                {1, 1, 1},
//                {2, 2, 2, 2, 2, 2},
//                {3, 3, 3, 3}
//        };
//
//        for (int[] e : multiArr) {
//            for (int f : e) {
//                System.out.print(f + " ");
//            }
//            System.out.println();
//        }

        System.out.println("----------");

        // for each 문으로 다중 배열 꺼내기 (방법2)
        int[][] multiArr = new int[3][];
        multiArr[0] = new int[5];
        multiArr[1] = new int[7];
        multiArr[2] = new int[10];

        int k = 10;
        for (int arr[] : multiArr) {
            for (int j : arr) {
                arr[j] = k++;
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
