package day03;

public class Ex08_Array08 {
    public static void main(String[] args) {
        // 선언, 생성, 초기화 동시에 하기
        int[][] arr1 = new int[][] {{10, 20}, {30, 40}, {50, 60}};
        int[][] arr2 = {{10, 20}, {30, 40}, {50, 60}};

        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][1]);

        System.out.println();

        System.out.println("arr1 : " + arr1);
        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[0][0] : " + arr1[0][0]);
        System.out.println("arr1.length : " + arr1.length);       // 행의 개수
        System.out.println("arr1[0].length : " + arr1[0].length); // 열의 개수

        System.out.println();

        for(int[] row : arr1){
            for(int data : row){
                System.out.println(data);
            }
        }
    }
}
