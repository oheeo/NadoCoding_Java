package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I love Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ","));  // " and" 를 "," 로 변환
        System.out.println(s.substring(7));  // 인덱스 기준 7 부터 시작 => Java and Python and C. 출력
        System.out.println(s.substring(s.indexOf("Java")));  // 7 = s.indexOf("Java") => 위와 동일하게 출력
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Python")));
        // Java and 출력 ("Java" 가 시작하는 위치부터, "Python" 이 시작하는 위치 바로 앞까지)

        // 공백 제거
        s = "       I love you.        ";
        System.out.println(s);  //  [      I love you.       ] 출력
        System.out.println(s.trim());  // 앞 뒤 공백 제거 => [I love you.] 출력

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + "," + s2);  // Java,Python
        System.out.println(s1.concat(",").concat(s2));  // s1에 "," 결합 . s2결합 => Java,Python
    }
}
