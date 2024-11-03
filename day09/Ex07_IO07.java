package day09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * Ex07_IO07 클래스
 * - 직렬화된 객체를 읽어와 배열 데이터를 출력하는 예제
 */

public class Ex07_IO07 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream( new FileInputStream( "./day09/test/object.ser" ) );

            String[] names = (String[])ois.readObject();
            int[] ages = (int[])ois.readObject();
            double[] weights = (double[])ois.readObject();

            System.out.println(Arrays.toString( names) );
            System.out.println(Arrays.toString( ages) );
            System.out.println(Arrays.toString( weights ) );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (ois != null) { try { ois.close(); } catch (IOException e) {} }
        }
    }
}
