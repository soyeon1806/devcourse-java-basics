package day09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Ex09_PropertiesFileWriter 클래스
 * - Properties 클래스를 사용하여 프로그램 설정 파일을 생성하는 예제
 * - 설정 파일에 기본 사용자 정보 및 언어 설정을 저장
 */

public class Ex09_PropertiesFileWriter {
    public static void main(String[] args) {
        Properties properties = new Properties();
        
        properties.setProperty("username", "admin");
        properties.setProperty("password", "1234");
        properties.setProperty("language", "korean");
        
        try{
            FileWriter writer = new FileWriter("config.properties");
            properties.store(writer, "프로그램 설정 파일");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
