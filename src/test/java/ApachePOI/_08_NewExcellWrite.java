package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcellWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");
        Row row= sheet.createRow(0);
        Cell cell= row.createCell(0);
        cell.setCellValue("Hello World");

        for (int i = 1; i < 10; i++) {

            row=sheet.createRow(i);
            cell= row.createCell(0);
            cell.setCellValue(i);

        }

        FileOutputStream outputStream=new FileOutputStream("src/test/java/ApachePOI/resources/NewExcell.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }
}
