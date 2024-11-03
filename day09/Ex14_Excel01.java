package day09;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class Ex14_Excel01 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try{
            workbook = Workbook.getWorkbook(new File("day09/data/excel.xls"));

            Sheet sheet = workbook.getSheet(0);

            for(int i = 3; i < sheet.getRows(); i++){
                Cell cell1 = sheet.getCell(13, i);
                Cell cell2 = sheet.getCell(14, i);
                Cell cell3 = sheet.getCell(15, i);
                System.out.printf("%s %s %s %n", cell1.getContents(), cell2.getContents(), cell3.getContents());
            }
        } catch (IOException e){
            System.out.println("[에러] " + e.getMessage());
        } catch (BiffException e){
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if(workbook != null){workbook.close();}
        }
    }
}
