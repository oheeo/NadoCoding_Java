package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));  // 문자열 내용이 같으면 true
        System.out.println(s1.equals(s2));  // 다르면 false

        System.out.println(s1.equals("java"));  // 대소문자 달라서 false
        System.out.println(s1.equalsIgnoreCase("java"));  // 대소문자 구분 없이 문자열 내용이 같으면 true

        // 문자열 비교 심화
        s1 = "1234";  // 메모리 공간에 저장
        s2 = "1234";  // s2의 "1234"는 메모리에 새로 할당되는게 아닌, s1의 "1234"와 같기에 참조한다.
        System.out.println(s1.equals(s2));  // true (내용 비교)
        System.out.println(s1 == s2);  // true (참조 비교)

        s1 = new String("1234");  // 메모리 공간에 저장
        s2 = new String("1234");  // 또 다른 메모리 공간에 저장
        System.out.println(s1.equals(s2));  // true (내용 비교)
        System.out.println(s1 == s2);  // false (s1 과 s2 가 참조하는곳이 달라)

        // 문자열의 내용을 비교할땐 == 보단 equals 를 쓰자
    }
}
