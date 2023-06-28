package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        // 반환하는 값과 같은 타입인 String (void 는 반환값이 없을때)
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";  // 값 자체를 리턴할 수도 있다
    }

    // 호텔 엑티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래발";
    }

    public static void main(String[] args) {
        // 반환값 return
        String contactNumber = getPhoneNumber();  // 메소드 호출 후 반환되는 값을 받아서 뭔가들 해야겠지? 그러려면 변수로 선언
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 액티비티 : " + getActivities());  // 메소드를 바로 쓸 수도 있다
    }
}
