package _JDBC.Gun1;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends _JDBCParent {

    @Test
    private void test1() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from film");

        rs.absolute(10); // absolute verilen satıra gider.
        int id= rs.getInt("film_id");
        String title=rs.getString("title");
        System.out.println("10 row title = " +id+" "+title);  //10 ALADDIN CALENDAR

        rs.absolute(15); // 15.satıra git.
        id=rs.getInt("film_id");
        title=rs.getString("title");
        System.out.println("15 row title = " +id+" "+title);   //15 ALIEN CENTER

        rs.absolute(-15); //sondan 15.satıra git.!!!!!!!!!!!!
        id=rs.getInt("film_id");
        title=rs.getString("title");
        System.out.println("-15 rowtitle = " +id+" "+title);      //986 WONKA SEA

        rs.relative(5); // en son bulunduğu yerden 5 ileri gider. yani -10. ye gider !!!!!!!!!!!!!!!!
        id=rs.getInt("film_id");
        title=rs.getString("title");
        System.out.println("title = " +id+" "+title);   //  991 WORST BANGER

        rs.relative(-5); // en son bulunduğu yerden 5 geri gider. yani 15. ye gider !!!!!!!!!!!!!!!!!!!
        id=rs.getInt("film_id");
        title=rs.getString("title");
        System.out.println("title = " + id+" "+title);     //986 WONKA SEA
    }


}
