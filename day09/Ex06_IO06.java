package day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Ex06_IO06 클래스
 * - ObjectOutputStream을 사용하여 객체를 직렬화하여 파일에 저장하는 예제
 * - 배열 데이터를 직렬화하여 파일에 출력
 */

public class Ex06_IO06 {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try{
            // ObjectOutputStream을 통해 객체를 직렬화하여 파일에 저장
            oos = new ObjectOutputStream(new FileOutputStream("./day09/test/object.ser"));

            // 직렬화할 데이터 생성
            String[] names = {"홍길동", "박문수", "임꺽정"};
            int[] ages = {55,23, 47};
            double[] weights = {71.4, 67.9, 58.6};

            // 데이터를 파일에 쓰기
            oos.writeObject(names);
            oos.writeObject(ages);
            oos.writeObject(weights);

            System.out.println("출력 완료");
        } catch (IOException e){
            System.out.println("[에러] " + e.getMessage());
        } finally {
            // ObjectOutputStream 자원 해제
            if(oos != null){try {oos.close();} catch(IOException e){}}
        }
    }
}
