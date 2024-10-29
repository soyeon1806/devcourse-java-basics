package day08;

import java.io.File;

public class Ex13_File03 {
    public static void main(String[] args) {
        
        // 디렉토리 생성, 이름 변경, 삭제 실습
        
        //File dir = new File("./day08/test2");
        //dir.mkdir();
        
        //dir.renameTo(new File("./day08/test1"));

        File dir2 = new File("./day08/test1");
        dir2.delete();
    }
}
