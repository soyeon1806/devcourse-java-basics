package day08;

import java.io.File;
import java.util.Date;

public class Ex11_File01 {
    public static void main(String[] args) {
        // 디렉토리 생성
        File dir = new File("./day08/test");
        System.out.println(dir.mkdir());

        // 파일 생성
        File file = new File("./day08/test/test.txt");
        try {
            System.out.println("파일 생성 성공 여부: " + file.createNewFile());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 디렉토리와 파일의 존재 여부 확인
        System.out.println(dir.exists());
        System.out.println(file.exists());

        // 파일 크기 출력 (KB 단위로 변환)
        long fileSize = file.length();
        System.out.println("File Size : " + fileSize / 1024);

        // 파일 마지막 수정 날짜 출력
        long fileDate = file.lastModified();
        System.out.println(fileDate);
        System.out.println(new Date(fileDate).toLocaleString());
    }
}
