package day09;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Ex10_PropertiesFileReader 클래스
 * - Properties 파일을 읽어오는 예제
 * - config.properties 파일을 로드하여 프로그램 설정 값들을 출력
 * - key 값으로 "username", "password", "language"을 가져와 출력
 */

public class Ex10_PropertiesFileReader {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try{
            FileReader reader = new FileReader("config.properties");
            properties.load(reader);
            reader.close();

            System.out.println("username: " + properties.getProperty("username"));
            System.out.println("password: " + properties.getProperty("password"));
            System.out.println("language: " + properties.getProperty("language"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
