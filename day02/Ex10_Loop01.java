package day02;

public class Ex10_Loop01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println();

        // 1 ~ 10 사이의 수 중에서 홀수만 출력하기       
        for (int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        System.out.println();

        // 2씩 증가하도록
        for(int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }
    }
}
