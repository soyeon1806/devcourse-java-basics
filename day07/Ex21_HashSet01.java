package day07;

import java.util.HashSet;

public interface Ex21_HashSet01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("홍길동");
        set.add("박문수");
        set.add("임꺽정");
        set.add("홍길동"); // 중복된 값은 무시됨

        System.out.println(set);
    }
}
