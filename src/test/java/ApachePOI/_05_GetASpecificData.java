package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Verilen Exceldeki bilgilerden istenilen bilgiyi bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _05_GetASpecificData {

    public static void main(String[] args) {
        System.out.print("Search word=");
        Scanner sc=new Scanner(System.in);
        String searchWord=sc.nextLine();

        String otherData=GetData(searchWord);
        System.out.println("Other data = " + otherData);
    }

    public static String GetData(String searchWord)
    {
        String path="src/test/java/ApachePOI/resources/LoginData.xlsx";
        String datum="";

        Workbook workbook=null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        }
        catch (Exception ex)
        {
        }

        Sheet sheet=workbook.getSheetAt(0);
        int rowCount=sheet.getPhysicalNumberOfRows();

        for(int i=0;i< rowCount;i++)
        {
            Row row=sheet.getRow(i);

            //aradığım kelime 1.hücrede var mı ; her satırın 1.hücresini kontrol ettim
            if (row.getCell(0).toString().equalsIgnoreCase(searchWord))
            {
                // yandaki hücrelerin hepsini ekleyip tek bir stringe dönüştürücem
                int cellCount= row.getPhysicalNumberOfCells();

                for(int j=1;j<cellCount;j++)
                {
                    datum+=row.getCell(j);
                }
            }
        }
        return datum;
    }


}
