package day08;

import java.io.File;

public class Ex12_File02 {
    public static void main(String[] args) {
        // 디렉토리 객체 생성
        File dir = new File("./day08");

        // 1. list() 메서드로 파일 이름 목록 가져오기
        String[] files = dir.list();
        for(String file : files){
            System.out.println(file);
        }

        System.out.println();

        // 2. listFiles() 메서드로 파일 객체 목록 가져오기
        File[] files2 = dir.listFiles();
        for(File file : files2){
            // 디렉토리인 경우
            if(file.isDirectory()){
                System.out.printf("[%s]%n", file.getName());
            }
            // 파일인 경우
            else{
                System.out.println(file.getName());
            }
        }
    }
}
