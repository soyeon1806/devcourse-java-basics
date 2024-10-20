package day02;

public class Ex23_Loop14 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            i++;

            int j = 0;
            while(j <= 5){
                j++;

                if(j == 3){
                    break; // 가장 가까운 반복문을 탈출함
                }

                System.out.println(i + "/ " + j);
            }
            System.out.println("=====");
        }
        
        System.out.println();

        int a = 0;
        while(a < 5){
            a++;

            int b = 0;
            while(b < 5){
                b++;

                if(b == 3){
                    continue; // 가장 가까운 반복문을 skip 함
                }

                System.out.println(a + "/ " + b);
            }
            System.out.println("=====");
        }
    }
}
