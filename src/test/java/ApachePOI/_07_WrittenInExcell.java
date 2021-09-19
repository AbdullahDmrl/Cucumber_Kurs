package ApachePOI;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WrittenInExcell {
    public static void main(String[] args) throws IOException {


        String path="src/test/java/ApachePOI/resources/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");


        Row row=sheet.createRow(0);
        Cell cell= row.createCell(0);
        cell.setCellValue("Merhaba Musti");

       for (int i = 1; i < 10; i++)
       {
           cell=row.createCell(i);
           cell.setCellValue(i);

       }
        // baltina bes satir merhaba musti yazdirirsam
        for (int i = 1; i < 5; i++)
        {
            row=sheet.createRow(i);
            for (int j = 0; j < 10; j++)
            {
                cell=row.createCell(j);
                cell.setCellValue("Merhaba Musti");
            }
        }


        inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();






    }

}
