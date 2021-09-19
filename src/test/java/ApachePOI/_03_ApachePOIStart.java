package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
    //Excel OKUMA işlemi
    // Dosyanın yolu alındı.
       String path="src/test/java/ApachePOI/resources/ApacheExcel2.xlsx";

    // Dosya okuma işlemcisine dosyanın yolunu veriyoruz
      FileInputStream  inputStream=new FileInputStream(path);

    //Dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
       Workbook workbook=WorkbookFactory.create(inputStream);

    //istediğim isimdeki çalışma sayfasını alıyorum
       Sheet sheet=workbook.getSheet("Sheet1");
      // Sheet sheet=workbook.getSheetAt(0);

        //istenen Satırı alıyorum
        Row row=sheet.getRow(0);

        //istenen satırdaki istenen hücre aliniyor.
        Cell cell=row.getCell(0);

        System.out.println("hucre = " + cell);

        // toplu yazdirmak istersem row ve hucre uzunluguna göre yapabiliyorum

        int rowcount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowcount; i++) {
            row=sheet.getRow(i);
            int cellcount=row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellcount; j++) {

                System.out.print( row.getCell(j)+" ");
            }
            System.out.println();
        }

    }

}
