package day07;

import java.util.Arrays;

public class Ex14_Array01 {
    public static void main(String[] args) {
        // 배열의 내용을 문자열 형태로 출력
        String[] arr = {"aaa", "bbb", "ccc"};
        System.out.println(Arrays.toString(arr));

        // 배열을 특정 값으로 채우기 (fill)
        Arrays.fill(arr, "xxx");
        System.out.println(Arrays.toString(arr));

        // 배열 비교 (== vs Arrays.equals())
        String[] arr1 = {"aaa", "bbb", "ccc"};
        String[] arr2 = {"aaa", "bbb", "ccc"};

        System.out.println(arr1 == arr2);              // ==는 두 배열의 주소값을 비교 (false)
        System.out.println(Arrays.equals(arr1, arr2)); // Arrays.equals()는 배열의 내용을 비교 (true)

        System.out.println();

        // 정수형 배열의 내용을 출력하고 정렬하기
        int[] intArr = {5, 2, 3, 1, 4};
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr); // 배열을 오름차순으로 정렬
        System.out.println(Arrays.toString(intArr));
    }
}
