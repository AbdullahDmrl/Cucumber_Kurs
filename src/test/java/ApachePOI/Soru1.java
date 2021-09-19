package ApachePOI;
/**  Soru 1:
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
 */

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Soru1 {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sheet1");
        int number=0;
        Row row=null;
        for (int i = 0; i < 10; i++) {

            for (int j =0 ; j < 10; j++) {
               row= sheet.createRow(number);
               Cell cell= row.createCell(0);
               cell.setCellValue(i+1);
               cell= row.createCell(1);
               cell.setCellValue("*");
               cell= row.createCell(2);
               cell.setCellValue(j+1);
               cell= row.createCell(3);
               cell.setCellValue("=");
               cell= row.createCell(4);
               cell.setCellValue((j+1)*(i+1));

                number++;

            }
            row= sheet.createRow(number++);

        }

        FileOutputStream outputStream=new FileOutputStream("src/test/java/ApachePOI/resources/CarpimTablosu.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }
}
