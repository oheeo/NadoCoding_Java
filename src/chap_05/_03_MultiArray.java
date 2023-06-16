package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B2
        // C1 - C2

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3(행) x 5(열) 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // C2 에 접근하려면?  (0부터 시작)
        System.out.println(seats[2][1]);
        System.out.println(seats[1][3]);  // B4

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[0][2]);  // A3
//        System.out.println(seats2[0][4]);  // 오류 (배열의 범위를 벗어났다)


        // 3차원 배열 (세로, 가로, 높이)
//        String[][][] marray = new String[][][] {
//                { {}, {}, {} },
//                { {}, {}, {} },
//                { {}, {}, {} },
//        };

//        String[][][] marray = new String[3][3][3];
    }
}
