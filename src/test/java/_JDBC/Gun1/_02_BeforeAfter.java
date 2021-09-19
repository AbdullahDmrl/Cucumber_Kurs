package _JDBC.Gun1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {

   private Statement statement;
   private Connection connection;

    @BeforeTest
    private void beforeTest() throws SQLException {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";
        connection= DriverManager.getConnection(url,user,password);
        statement = connection.createStatement();
    }

    @AfterTest
    private void afterTest() throws SQLException {
        connection.close();
    }


    @Test
    private void test1() throws SQLException {
      ResultSet rs=statement.executeQuery("select * from language");

      rs.next();
      int id=rs.getInt(1);
      String name=rs.getNString("name");
        System.out.println(id +" "+name);

        rs.next();
        id=rs.getInt(1);
        name=rs.getNString("name");
        System.out.println(id +" "+name);

        rs.next();
        id=rs.getInt(1);
        name=rs.getNString("name");
        System.out.println(id +" "+name);

    }
    @Test
    private void test2() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        int id=rs.getInt(1);
        String name=rs.getNString(2);
        System.out.println(id +" "+name);

        rs.next();
        id=rs.getInt(1);
        name=rs.getNString(2);
        System.out.println(id +" "+name);

        rs.next();
        id=rs.getInt(1);
        name=rs.getNString(2);
        System.out.println(id +" "+name);

        rs.previous(); // bir önceki   English   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        name=rs.getString(2);
        System.out.println("dilAdi onceki = " + name);



    }
}
