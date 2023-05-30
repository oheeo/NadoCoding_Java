package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)

        System.out.println("자바가\n너무\n재밌어요");  //  \n : 줄바꿈
     /* 자바가
        너무
        재밌어요 */

        System.out.println("해물파전\t9000원");  //  \t : tab키
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t7000원");
     /* 해물파전	9000원
        김치전	8000원
        부추전	7000원 */

        System.out.println("C:\\Program Files\\Java");  //  \\ : 역슬래시
        // 특수문자는 \n, \t 이런식으로 쓰이니까 정작 역슬래시를 쓰고싶을땐 두번 적어야 한다
        // C:\Program Files\Java

        System.out.println("나비가 \"냐옹\"이라고 했어요");  //  \" : 큰따옴표
        // 나비가 "냐옹"이라고 했어요
        System.out.println("나비가 \'냐옹\'이라고 했어요");  //  \' : 작은따옴표
        // 나비가 '냐옹'이라고 했어요

        // 큰따옴표 안에 작은따옴표는 따로 특수문자로 안적고 그대로 써도 출력되지만 언제 필요하냐?
        char c = 'A';
        c = '\'';  // char은 작은따옴표를 쓰는데 그 안에 작은따옴표를 쓰고 싶을때
        System.out.println(c);  // ' 만 출력된다
    }
}
