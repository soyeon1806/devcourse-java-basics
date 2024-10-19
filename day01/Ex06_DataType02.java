public class Ex06_DataType02 {
    public static void main(String[] args){
        // 문자열 (Character) -> '문자'
        // 문자열 (String) -> "문자열"

        char c1 = 'A';
        char c2 = '1';

        System.out.println(c1);
        System.out.println(c2);

        // ascii code -> 문자를 숫자 코드로 저장하는 방법
        char c3 = 1; // 빈 문자
        char c4 = 97; // A
        char c5 = 67; //C

        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        // 유니코드 -> 다국어
        char c6 = '\uC790'; // 자
        System.out.println(c6);

    }
}
