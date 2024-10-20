package day02;

public class Ex07_Condition07 {
    public static void main(String[] args) {
        /*
         * 10이면 10 출력
         * 20이면 20 출력
         * 30이면 30 출력
         * 그 외는 00 출력
         */

        int data = 20;

        switch(data){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("00");
        }


        // 문자열도 사용 가능함
        String str = "50";

        switch (str) {
            case "10":
                System.out.println("10");
                break;
            case "20":
                System.out.println("20");
                break;
            case "30":
                System.out.println("30");
                break;
            default:
                System.out.println("00");
                break;
        }
    }
}
