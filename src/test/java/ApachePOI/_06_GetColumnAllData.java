package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * LoginData.xlsx i kullanarak, istneilen kolondaki bilgileri
 * ekrana yazdıran programı metod kullanarak yazdırınız.metod kolon numarası alsın.
 *  * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _06_GetColumnAllData {
    public static void main(String[] args) {

        System.out.print("Column number=");
        Scanner sc=new Scanner(System.in);
        int columnNumber=sc.nextInt();

        String columnData=getColumnData(columnNumber);
        System.out.println("Column Data = " + columnData);

    }
    public static String getColumnData(int number){

        String path="src/test/java/ApachePOI/resources/LoginData.xlsx";
        Workbook workbook=null;
        String columnDatum="";

        try {
            FileInputStream inputStream=new FileInputStream(path);
            workbook= WorkbookFactory.create(inputStream);
        }
       catch (Exception ex){

       }
         Sheet sheet=workbook.getSheetAt(0);
         int rowCount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
           Row row=sheet.getRow(i);
           int cellCount=row.getPhysicalNumberOfCells();

          if (cellCount>number)
               columnDatum+=row.getCell(number)+" ";  //yan yana yazmak istersem
               //   columnDatum+="\n"+row.getCell(number);  //alt alta yazmak istersem

        }

        return columnDatum;
    }





}
