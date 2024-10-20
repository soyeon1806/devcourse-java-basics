package day02;

public class Ex22_Loop13 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            i++;
            if(i == 3){
                break; // 3일 때 반복문을 탈출함
            }
            System.out.println(i);
        }

        System.out.println();

        int j = 0;
        while (j <= 5){
            j++;
            if(j == 3){
                continue; // 3일 때 반복문을 뛰어 넘음 (skip)
            }
            System.out.println(j);
        }
    }
}
