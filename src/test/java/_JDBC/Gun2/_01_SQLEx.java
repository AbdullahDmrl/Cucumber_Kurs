package _JDBC.Gun2;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

   // // address tablosundaki teki disrict alanını önce 10.satırdakini sonra, 22.satırdaki,
    //    // sonra en son satırdaki bilgisini yazdırınız.
public class _01_SQLEx extends _JDBCParent {

    @Test
    private void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from address");

        rs.absolute(10);
        String district= rs.getString("district");
        System.out.println("district 10 = "+district);
        rs.absolute(22);   //  rs.relative(12);
        district= rs.getString("district");
        System.out.println("district 22 = "+district);
        rs.last();
        district= rs.getString("district");
        System.out.println("district last = "+district);

    }




}
