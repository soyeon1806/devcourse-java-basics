package day03;

public class Ex09_Array09 {
    public static void main(String[] args) {
        // 3차원 배열
        int[][][] arr1 = new int[3][2][3];

        int[][][] arr2 = {
            {
                {1, 2, 3},
                {10, 20, 30}
            },
            {
                {4, 5, 6},
                {40, 50, 60}
            },
            {
                {7, 8, 9},
                {70, 80, 90}
            }
        };

        System.out.println(arr2[0][0][0]);
        System.out.println(arr2[1][1][1]);
    }
}
