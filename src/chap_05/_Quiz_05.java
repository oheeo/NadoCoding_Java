package chap_05;

public class _Quiz_05 {
/*    배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오.
      - 신발 사이즈는 250 부터 295 까지 5 단위로 증가
      - 신발 사이즈 수는 총 10가지  */
    public static void main(String[] args) {

        // 내가 푼 방법
//        int[] size = new int[10];
//        int j = 250;
//        for (int i = 0; i < size.length; i++) {
//            size[i] = j;
//            j = j+5;
//            System.out.println("사이즈 "+ size[i] + " (재고 있음)");
//        }

        int[] sizeArr = new int[10];
        for (int i = 0; i < sizeArr.length; i++) {
            sizeArr[i] = 250 + (5 * i);
        }
        for (int size : sizeArr) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

    }
}