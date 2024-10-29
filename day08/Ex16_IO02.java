package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex16_IO02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("./day08/test/test.txt");

            fos.write('a');
            fos.write('b');
            
            //fos.write("b"); // 문자열은 직접 쓸 수 없음

            System.out.println("출력 완료");
        } catch (FileNotFoundException e) {
            System.out.println("[에러] 파일을 찾을 수 없습니다 : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] 파일을 쓰는 도중에 문제가 발생했습니다 : " + e.getMessage());
        } finally {
            if(fos != null){
                try{
                    fos.close();
                } catch (IOException e) {
                    System.out.println("[에러] 파일 스트림을 닫는 도중 문제가 발생했습니다 : " + e.getMessage());
                }
            }
        }
    }
}
