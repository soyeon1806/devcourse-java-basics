public class Ex04_Variable02 {
    public static void main(String[] args){

        /*
         * final 키워드는 변수를 한 번만 할당할 수 있도록 제한함
         */

        final int num;
        num = 10;
        System.out.println(num);

        /*
         * 아래 명령어 실행하면 에러 발생
         * num = 20;
         * System.out.println(num);
         */

        final int NUM;
        NUM = 20;
        System.out.println(NUM);
    }
}
