package day02;

public class Ex08_Condition08 {
    public static void main(String[] args) {
        /*
         * score를 기준으로
         * 90점 이상 -> A
         * 80점 이상 -> B
         * 70점 이상 -> C
         * 60점 이상 -> D
         * 기타 -> F
         */

        int score = 88;

        switch(score / 10){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
