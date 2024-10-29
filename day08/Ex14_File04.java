package day08;

import java.io.File;
import java.io.IOException;

public class Ex14_File04 {
    public static void main(String[] args) {
        try{
            // 파일 객체 생성
            File file = new File("./day08/example.txt");

            // 파일이 존재하는지 확인
            if(file.exists()){
                System.out.println("파일이 존재합니다");
            }
            else{
                // 파일이 존재하지 않으면 파일 생성
                if(file.createNewFile()){
                    System.out.println("새로운 파일이 생성되었습니다");
                }
                else{
                    System.out.println("파일을 생성할 수 없습니다");
                }
            }

            // 파일 이름 확인
            System.out.println("파일 이름 : " + file.getName());

            // 파일 절대 경로 확인
            System.out.println("파일 경로 : " + file.getAbsolutePath());

            // 파일 크기 (바이트 단위) 확인
            System.out.println("파일 크기 : " + file.length() + "바이트");

            // 파일 읽기 가능 여부 확인
            if(file.canRead()){
                System.out.println("파일 읽기 가능");
            }
            else{
                System.out.println("파일 읽기 불가능");
            }

            // 파일 쓰기 가능 여부 확인
            if(file.canWrite()){
                System.out.println("파일 쓰기 가능");
            }
            else{
                System.out.println("파일 쓰기 불가능");
            }

            // 파일 삭제 시도
            if(file.delete()){
                System.out.println("파일이 삭제되었습니다");
            }
            else{
                System.out.println("파일을 삭제할 수 없습니다");
            }

            // 디렉토리 생성
            File dir = new File("./day08/example");
            if(dir.mkdir()){
                System.out.println("디렉토리가 생성되었습니다");
            }
            else{
                System.out.println("디렉토리를 생성할 수 없습니다");
            }

            // 디렉토리 내 파일 목록 출력
            File[] files = dir.listFiles();
            if(files != null) {
                for (File f : files) {
                    System.out.println("디렉토리 안의 파일: " + f.getName());
                }
            }
            else{
                System.out.println("디렉토리가 비어있거나 존재하지 않습니다");
            }
        } catch (IOException e){
            System.out.println(e.getStackTrace());
        }
    }
}
