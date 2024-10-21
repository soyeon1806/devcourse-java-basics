package day03;

public class Ex03_Array03 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {10, 20, 30, 40, 50};
        int[] arr2 = new int[] {10, 20, 30};
        int[] arr3 = new int[10];

        // . -> 메모리 참조 연산자
        System.out.println("개수 : " + arr1.length);
        System.out.println("개수 : " + arr2.length);
        System.out.println("개수 : " + arr3.length);

        System.out.println();

        // 전통적인 for문으로 접근하기
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        // 향상된 for문으로 접근하기
        for (int data : arr1){
            System.out.println(data);
        }

    }
}
