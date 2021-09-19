package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class _04_GetRowColumnMetod extends _JDBCParent {

    @Test
    public void task1() throws SQLException {
        // actor tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.
        getTable("select * from actor");
    }
    public void getTable(String Query) throws SQLException {
        ResultSet rs = statement.executeQuery(Query);
        ResultSetMetaData rsmd=rs.getMetaData();
        int columnCount=rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            String columnName=rsmd.getColumnName(i);
            System.out.printf("%-15s",columnName+" ");
        }
        System.out.println();
        while (rs.next()){
            for (int i = 1; i <=columnCount ; i++) {
                System.out.printf("%-15s",rs.getString(i)+" ");
            }
            System.out.println();
        }
    }

    @Test
    @Parameters("tableName")
    public void task2(String tableName) throws SQLException {
        // Kullanicidan alacaginiz dosyanin tüm satırları ve tüm sütunları metod ile yazdırınız,

        getTable("select * from "+tableName);
    }

    public String gettableName(){
        String tableName="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Dosya ismini giriniz= ");
        tableName=sc.nextLine();

        return tableName;
    }

}
