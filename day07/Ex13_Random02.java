package day07;

import java.util.Random;

public class Ex13_Random02 {
    public static void main(String[] args) {
        // 현재 시스템 시간을 기반으로 Random 객체 생성
        Random rand = new Random(System.currentTimeMillis());
    
        // 5줄의 로또 번호 생성
        for(int i = 1; i <= 5; i++){
            // 한 줄당 6개의 랜덤한 숫자 생성 (1 ~ 45 범위)
            for (int j = 1; j <= 6; j++){
                // 1에서 45 사이의 값을 생성하고, 두 자리 수로 출력
                System.out.printf("%2d ", rand.nextInt(45) + 1);
            }
            System.out.println();
        }
    }
}
