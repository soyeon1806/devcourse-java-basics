package day07;

public class Ex03_System02 {
    public static void main(String[] args) {
        // 현재 시스템 시간(밀리초 단위) 가져오기
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        System.out.println();

        /*
         * System.lineSeparator()는 실제 줄바꿈을 출력하지 않음 (줄바꿈 문자를 반환할 뿐)
         * 이를 출력하려면 명시적으로 출력 메서드와 함께 사용해야 함
         */
        System.out.print("Hello");
        System.lineSeparator();
        System.out.print("Hello");
        System.out.print("\n");     // 줄바꿈 처리
        System.out.println("Hello");

        // 시스템 정보 가져오기
        System.out.println(System.getProperty("os.name"));   // 운영체제 이름 출력
        System.out.println(System.getProperty("user.name")); // 사용자 이름 출력
        System.out.println(System.getProperty("user.home")); // 사용자 홈 디렉터리 출력

        // 환경 변수 PATH 가져오기
        System.out.println(System.getenv("PATH"));
    }
}
