package day03;

public class Ex11_Array11 {
    public static void main(String[] args) {
        /*
         * args는 프로그램 실행 시 전달되는 명령줄 인자를 담고 있으며,
         * 인자의 수는 가변적임
         * -> args 배열은 비어있을 수도 있고, 여러 개의 값을 포함할 수도 있음
         * 
         * ex) java MainExample Hello World 123
         *     -> args 배열은 ["Hello", "World", "123"]의 값을 가지며, 배열의 길이는 3임
         */

        System.out.println(args.length);
    }
}
