package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeA = "아메리카노";
        String coffeeB = "라떼";
        String coffeeC = "카푸치노";
        String coffeeD = "카페모카";

        System.out.println(coffeeA + " 하나");
        System.out.println(coffeeB + " 하나");
        System.out.println(coffeeC + " 하나");
        System.out.println(coffeeD + " 하나");
        System.out.println("주세요.");

        // 배열 선언 첫번째 방법
        // String[] coffees = new String[4];

        // 두번째 방법
        // String coffees[] = new String[4];

//        coffees[0] = "아메리카노";
//        coffees[1] = "라떼";
//        coffees[2] = "카푸치노";
//        coffees[3] = "카페모카";

        // 세번째 방법
        // String[] coffees = new String[] {"아메리카노", "라떼", "카푸치노", "카페모카"};

        // 네번째 방법
        String[] coffees = {"아메리카노", "라떼", "카푸치노", "카페모카"};

        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소";  // 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요.");

        int[] i = new int[2];
        i[0] = 1;
        i[1] = 2;
        i[1] = 3;
        double[] d = new double[] {1.5, 3.14, 10.1, 11.5};
        boolean[] b = {true, true, false};

    }
}
