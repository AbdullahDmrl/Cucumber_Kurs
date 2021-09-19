package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetRowColumn extends _JDBCParent {

    @Test
    private void test1() throws SQLException {
       ResultSet rs = statement.executeQuery("select * from customer");

       ResultSetMetaData rsmd=rs.getMetaData();
        // Sonuçların haricindeki diğer bilgiler: colon sayısı, isimleri, tipleri alabiliyoruz

        int columnCount= rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i =1; i <= columnCount; i++) {
            String columnName=rsmd.getColumnName(i);
            String columnType=rsmd.getColumnTypeName(i);
            System.out.println(columnName+" "+columnType);

        }
    }
    @Test
    public void test2() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd=rs.getMetaData();
        int columnCount=rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {      // once baslik kismini yazdirdim
            String columnName=rsmd.getColumnName(i);
            System.out.print(columnName+" ");
        }
        System.out.println();

        while (rs.next()){              //Daha sonra tüm satirlarin
            for (int i = 1; i <=columnCount ; i++) {    // sütun bilgilerini yadirdim
                System.out.print(rs.getString(i)+" ");
            }
            System.out.println();
        }
    }
    @Test
    public void testPrintf() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları asagidaki gibi yazdirsaydik
        /*
            language_id   name        last_update
            1             English     2006-02-15 05:02:19
            2             Italian     2006-02-15 05:02:19
            3             Japanese    2006-02-15 05:02:19
            4             Mandarin    2006-02-15 05:02:19
            5             French      2006-02-15 05:02:19
            6             German      2006-02-15 05:02:19
            !!!formatli yazdirma!!!!!!!!!!! s burada String
            printf("%15s", değişken adı)  değeri 15 haneye yaz(default sağa dayalı yazar) !!!!!!!!!!!
            printf("%-15s", değişken adı) değeri 15 haneye yaz(default sola dayalı yazar) !!!!!!!!!!!!
            orlali yok ya saga ya da sola dayali yaziyor
             */
        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd=rs.getMetaData();
        int columnCount=rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);
        // saga dayali sigmadigi icin 25 yaptim
        for (int i = 1; i <= columnCount; i++) {
            String columnName=rsmd.getColumnName(i);
            System.out.printf("%25s",columnName+" ");   // uzun oldugu icin 25 yaptim
        }
        System.out.println();
        while (rs.next()){
            for (int i = 1; i <=columnCount ; i++) {
                System.out.printf("%25s",rs.getString(i)+" ");
            }
            System.out.println();
        }
    }
    @Test
    public void testPrintf2() throws SQLException {
     // sola dayali
      ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd=rs.getMetaData();
        int columnCount=rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);
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

}
