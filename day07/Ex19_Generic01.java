package day07;

import java.util.ArrayList;

public class Ex19_Generic01 {
    public static void main(String[] args) {
        // 제네릭을 사용하지 않은 ArrayList에는 다양한 타입이 들어갈 수 있음
        ArrayList a1 = new ArrayList();

        a1.add("A");
        a1.add("B");
        a1.add(10);
        a1.add(20);
        a1.add('a');
        a1.add('b');

        System.out.println(a1);

        System.out.println();

        /*
         * 이 코드는 컴파일 시에는 문제가 없지만, 실행 시 ClassCastException 에러가 발생함
         * -> ArrayList에서 데이터를 가져올 때 Object로 반환되기에
         *    문자열로 형 변환을 시도하지만, 다른 타입이 들어가 있으면 에러 발생
         * for(int i = 0; i < a1.size(); i++){
         *     String data = (String) a1.get(i);
         *     System.out.println(data);
         * }
         */

        // 제네릭을 사용한 ArrayList
        ArrayList<String> a2 = new ArrayList<>();

        a2.add("aa");
        a2.add("bb");
        a2.add("cc");

        // 제네릭을 사용한 ArrayList에서 데이터를 가져올 때에는 형변환이 필요 없음
        for(int i = 0; i < a2.size(); i++){
            String data = a2.get(i);
            System.out.println(data);
        }

        System.out.println();

        for(String data : a2){
            System.out.println(data);
        }
    }
}
