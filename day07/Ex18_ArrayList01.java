package day07;

import java.util.ArrayList;
import java.util.List;

public class Ex18_ArrayList01 {
    public static void main(String[] args) {
        // ArrayList 생성 (기본 생성자 사용, 초기 크기는 10)
        ArrayList ar1 = new ArrayList<>();

        // 초기 크기가 100인 ArrayList 생성
        ArrayList ar2 = new ArrayList<>(100);

        // List 인터페이스로 ArrayList 참조 (다형성)
        List list = new ArrayList();

        // 데이터 추가 (add 메서드)
        ar1.add("홍길동");

        // String을 Object로 변환하여 추가 (참조형은 자동으로 Object로 변환 가능)
        String str = "박문수";
        Object obj = str;
        ar1.add(obj);

        // 직접 String 추가
        ar1.add("임꺽정");

        // 현재 ArrayList의 크기와 내용 출력
        System.out.println(ar1.size());
        System.out.println(ar1);

        // 새로운 요소 추가
        ar1.add("이몽룡");
        System.out.println(ar1);

        // 특정 인덱스의 요소를 가져오기 (캐스팅 필요)
        String str1 = (String)ar1.get(0);
        System.out.println(str1);

        System.out.println();

        // for문을 사용한 ArrayList 요소 순회 (인덱스 기반)
        for(int i = 0; i < ar1.size(); i++){
            System.out.println((String)ar1.get(i));
        }

        System.out.println();

        // 향상된 for문을 사용한 ArrayList 요소 순회
        for(Object data : ar1){
            System.out.println((String)data);
        }
    }
}
