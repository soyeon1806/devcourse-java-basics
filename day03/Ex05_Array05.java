package day03;

public class Ex05_Array05 {
    public static void main(String[] args) {
        /*
         * 기본 자료형은 값을 복사할 때,
         * 원본과 복사본이 별개의 값으로 처리됨
         */

        int a1 = 10;
        int a2 = a1;
        System.out.println(a1);
        System.out.println(a2);

        a2 = 20;  // a2의 값을 변경해도 a1에는 영향이 없음
        System.out.println(a1);
        System.out.println(a2);

        System.out.println();
        
        /*
         * 참조 자료형인 경우,
         * 배열 등의 데이터는 실제 값이 아닌 데이터의 참조 주소를 복사함
         */

        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; // arr1의 참조 주소를 arr2에 복사 (arr1과 arr2는 같은 배열을 참조)

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        // arr1과 arr2가 같은 배열을 참조하므로, arr1에서도 첫 번째 값이 변경됨
        arr2[0] = 100;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
