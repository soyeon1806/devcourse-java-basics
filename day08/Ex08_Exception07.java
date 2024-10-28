package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08_Exception07 {
    public static void main(String[] args) {
        Scanner sc = null;

        try{
            File file = new File("nonexistentfile.txt");
            sc = new Scanner(file);

            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다");
        } finally {
            if(sc != null){
                sc.close();
            }
            System.out.println("자원 해제 완료");
        }
    }
}
