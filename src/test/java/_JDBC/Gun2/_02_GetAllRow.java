package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_GetAllRow extends _JDBCParent {

    @Test
    private void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer");

        int rowCount=0;  // satir sayisini bulmak icin
       while (rs.next()){

           String ad=rs.getNString("first_name");
           String soyad=rs.getNString("last_name");
           System.out.println(ad+ " " + soyad);
            rowCount++;

       }
        System.out.println("rowCount = " + rowCount);

        // 2 yöntem

        rs.last();
        System.out.println("last row = " + rs.getRow());

        }

    @Test
    private void fortest1() throws SQLException {
        // yukaridaki örnegi for döngüsü ile yapiniz

        ResultSet rs = statement.executeQuery("select * from customer");
        rs.last();
        int rowCount= rs.getRow();   // En sonuncuya gidip row sayisini aldim
        rs.first(); // sonda oldugu icin tekrar basa aldim

        for (int i = 0; i < rowCount; i++) {

            String ad=rs.getNString("first_name");
            String soyad=rs.getNString("last_name");
            System.out.println(ad+ " " + soyad);
            rs.next();    // buraya koyduktan sonra her yazdiktan sonra otekine gececek
        }

    }
    @Test
    private void fortest2() throws SQLException {
        // ikinci cozum

        ResultSet rs = statement.executeQuery("select * from customer");
        rs.last();
        int rowCount= rs.getRow();   // En sonuncuya gidip row sayisini aldim

        for (int i = 1; i <= rowCount; i++) {
            rs.absolute(i);  // verilen index teki satira gider
            String ad=rs.getNString("first_name");
            String soyad=rs.getNString("last_name");
            System.out.println(ad+ " " + soyad);

        }

    }
    @Test
    private void fortest3() throws SQLException {
        // sondan basa dogru yazdirma

        ResultSet rs = statement.executeQuery("select * from customer");
        rs.last();
        int rowCount= rs.getRow();   // En sonuncuya gidip row sayisini aldim

        for (int i = rowCount; i > 0; i--) {
            rs.absolute(i);  // verilen index teki satira gider
            String ad=rs.getNString("first_name");
            String soyad=rs.getNString("last_name");
            System.out.println(ad+ " " + soyad);

        }

    }

}
