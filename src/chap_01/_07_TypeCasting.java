package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // int to float, double
        int score = 93;
        System.out.println(score);   // 93
        System.out.println((float) score);   // 93.0
        System.out.println((double) score);  // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 99.9;
        System.out.println((int) score_f);   // 93
        System.out.println((int) score_d);   // 99

        // 정수형 변수 = 정수 + 실수 연산
        score = 93 + (int)98.8;      // 98 + 98
        System.out.println(score);   // 191

        // 실수형 변수 = 정수 + 실수 연산
        score_d = (double)93 + 98.8;  // 93.0 + 98.8
        System.out.println(score_d);  // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedDouble = score;  // 191 -> 191.0 int였던 score이 double로 자동 형변환 됨
        // int -> long -> float -> double (작은 범위에서 큰 범위로 자동 형변환 됨)

        int convertedUnt = (int) score_d;
        // double -/> float -/> long -/> int (큰 범위에서 작은 범위로 자동 형변환 안됨(score_d 는 double인데 int 보다 범위가 큰 값이다))

        // 숫자를 문자열로
        String s1 = String.valueOf(93);  // 93이라는 정수를 문자열에 넣을때
        s1 = Integer.toString(93);       // 다른 방법
        System.out.println(s1);  // 93

        String s2 = String.valueOf(93.5);
        s2 = Double.toString(93.5);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");  // 문자열 93을 정수로
        double d = Double.parseDouble("98.8");  //문자열 98.8을 실수로
        System.out.println(d);

        int error = Integer.parseInt("숫자 아니지롱");
        System.out.println(error);   // 에러 -> 숫자로 된 문자열만 바꿀 수 있다
    }
}
