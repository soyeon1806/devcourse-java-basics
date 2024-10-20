package day02;

public class Ex24_Loop15 {
    public static void main(String[] args) {
        int i = 0;

        outer: // 라벨 (label)
        while (i < 5){
            i++;
            
            int j = 0;
            while(j <= 5){
                j++;

                if(j == 3){
                    break outer; // 라벨링한 반복문을 탈출함
                }
                System.out.println(i + " / " + j);
            }
        }

        System.out.println();

        int a = 0;

        outer2: // 라벨 (label)
        while (a < 5){
            a++;
            
            int b = 0;
            while(b <= 5){
                b++;

                if(b == 3){
                    continue outer2; // 라벨링한 반복문을 skip 함
                }
                System.out.println(a + " / " + b);
            }
        }
    }
}
