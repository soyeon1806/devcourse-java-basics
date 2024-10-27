package day07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex23_HashMap01 {
    public static void main(String[] args) {
        HashMap<String, String> hm1 =new HashMap<>();

        // HashMap에 키-값 쌍 추가 (put 메서드 사용)
        hm1.put("a", "홍길동");
        hm1.put("b", "박문수");
        hm1.put("c", "임꺽정");

        System.out.println(hm1);

        System.out.println();

        hm1.put("d", "장길산");
        System.out.println(hm1);

        System.out.println();

        // 기존 키 "c"에 새로운 값 "장길산" 저장 (덮어쓰기)
        // 기존에 저장된 "c"의 값이 "임꺽정"에서 "장길산"으로 변경됨
        hm1.put("c", "장길산");
        System.out.println(hm1);

        System.out.println();

        // 특정 키에 대한 값 가져오기 (get 메서드 사용)
        System.out.println(hm1.get("a"));
        System.out.println(hm1.get("b"));

        System.out.println();

        // HashMap에 저장된 모든 키를 가져오기 (keySet 메서드 사용)
        Set<String> keys = hm1.keySet();
        System.out.println(keys);

        System.out.println();

        // 반복문을 사용해 모든 키에 해당하는 값을 출력
        for (String key : keys) {
            // 각 키에 해당하는 값을 출력
            System.out.println(hm1.get(key));
        }

        System.out.println();

        // HashMap에 저장된 모든 값 가져오기 (values 메서드 사용)
        Collection<String> values = hm1.values();
        // 반복문을 사용해 모든 값을 출력
        for (String value : values) {
            System.out.println(value);  // 홍길동, 박문수, 장길산, 장길산
        }
    }
}
