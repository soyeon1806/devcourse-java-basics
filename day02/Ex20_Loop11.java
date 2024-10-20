package day02;

public class Ex20_Loop11 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            int j = 1;
            while(j <= 5){
                System.out.println(i + " / " + j);
                j++;
            }
            System.out.println("=====");
            i++;
        }
    }
}
