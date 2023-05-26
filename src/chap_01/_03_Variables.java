package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "시리";
        int hour = 10;
        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "자비스";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println(pass);

        double d = 3.1423456789;
        float f = 3.1423456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        long i = 1_000_000_000_000L;
        System.out.println(l);
        System.out.println(i);
    }
}
