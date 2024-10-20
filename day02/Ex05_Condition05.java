package day02;

public class Ex05_Condition05 {
    public static void main(String[] args) {
        /*
         * 6시 ~ 9시 -> 아침
         * 9시 ~ 12시 -> 오전
         * 12시 ~ 15시 -> 오후
         * 15시 ~ 18시 -> 저녁
         */

        int time = 13;

        if(time <= 12){
            if(time <= 9){
                System.out.println("아침");
            }
            else{
                System.out.println("오전");
            }
        }
        else{
            if(time <= 15){
                System.out.println("오후");
            }
            else{
                System.out.println("저녁");
            }
        }
    }
}
