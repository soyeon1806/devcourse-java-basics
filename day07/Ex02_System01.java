package day07;

public class Ex02_System01 {
    public static void main(String[] args) {
        System.out.println("시작");

        if(args.length != 1){
            System.out.println("비정상 실행");
            // 프로그램 강제 종료
            // System.exit(0) -> 프로그램을 정상 종료하는 메서드로, 0은 정상 종료를 의미
            System.exit(0);
        }

        System.out.println("정상 실행");
        System.out.println("끝");
    }
}