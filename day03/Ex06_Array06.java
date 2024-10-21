package day03;

public class Ex06_Array06 {
    public static void main(String[] args) {
        // 기타 자료형의 배열
        String[] arr = new String[3];

        arr[0] = "1번";
        arr[1] = "2번";
        arr[2] = "3번";

        for (String str : arr){
            System.out.println(str);
        }
    }
}
