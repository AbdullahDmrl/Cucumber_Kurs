package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
/**  Soru 2:
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
 */

public class Soru2 {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sheet1");

        for (int i = 0; i < 10; i++) {
            Row row= sheet.createRow(i);
            int number=0;
            for (int j =0 ; j < 10; j++) {
               Cell cell= row.createCell(number);
               cell.setCellValue(i+1);
               cell= row.createCell(number+1);
               cell.setCellValue("*");
               cell= row.createCell(number+2);
               cell.setCellValue(j+1);
               cell= row.createCell(number+3);
               cell.setCellValue("=");
                cell= row.createCell(number+4);
                cell.setCellValue((j+1)*(i+1));
                cell= row.createCell(number+5);
                number+=6;


            }
        }

        FileOutputStream outputStream=new FileOutputStream("src/test/java/ApachePOI/resources/CarpimTablosu.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }
}
