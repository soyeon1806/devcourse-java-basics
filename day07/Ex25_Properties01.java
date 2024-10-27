package day07;

import java.util.Properties;
import java.util.Set;

public class Ex25_Properties01 {
    public static void main(String[] args) {
        // 1. Properties 객체 생성 (사용자 정의 설정 값 저장용)
        // Properties는 키-값 쌍을 저장하는 클래스로, 문자열 기반 설정 정보를 관리할 때 사용됨
        Properties prop = new Properties();

        // 2. 사용자 설정 값 저장 (setProperty 메서드 사용)
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        // 3. 저장된 모든 키-값 쌍 출력
        // Properties 객체 자체를 출력하면 내부에 저장된 모든 키-값 쌍이 출력됨
        System.out.println(prop);

        System.out.println();

        // 4. Properties에 저장된 설정 항목 개수 출력
        System.out.println(prop.size());

        System.out.println();

        // 5. 특정 설정 값을 가져와 출력 (getProperty 메서드 사용)
        System.out.println(prop.getProperty("timeout"));
        System.out.println(prop.getProperty("language"));

        System.out.println();

        // 6. 모든 키 값 가져오기 (stringPropertyNames 메서드 사용)
        // 이 메서드는 Properties에 저장된 모든 키를 Set<String>으로 반환함
        Set<String> names = prop.stringPropertyNames();
        for(String name : names){
            System.out.println(name);
        }

        System.out.println();

        // 7. 시스템 속성 값 가져오기
        // System.getProperties() 메서드를 통해 JVM의 시스템 속성 정보를 가져옴
        Properties prop2 = System.getProperties();

        // 8. 시스템 속성에 저장된 모든 키를 가져오기
        Set<String> keys = prop2.stringPropertyNames();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println();

        // 9. 특정 시스템 속성 값 가져오기 (OS 이름, 줄바꿈, 자바 버전 등)
        System.out.println(prop2.getProperty("os.name"));           // 운영체제 이름 출력
        System.out.println(prop2.getProperty("line.separator"));    // 줄바꿈 문자 출력 (보통 \n, \r\n 등)
        System.out.println(prop2.getProperty("java.version"));      // 자바 버전 출력
    }
}
