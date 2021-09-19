package _JDBC.Gun1;

import _JDBC._JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Example extends _JDBCParent {

    @Test
    private void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        rs.relative(5); // adana
        String cityName= rs.getString(2);
        int id= rs.getInt("city_id");
        System.out.println("cityName = " +id +" "+ cityName);    // 5 Adana

        rs.relative(5); // Akishima
        cityName= rs.getString(2);
        id= rs.getInt("city_id");
        System.out.println("cityName = " +id +" "+ cityName);    // 10 Akishima
    }

    @Test
    private void test2_LastFirstKeyword() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        rs.last(); // en son kayda gidiyor   !!!!!!!!!!!!!!!!
        String cityName= rs.getString(2);
        int countryId = rs.getInt("country_id");
        int city_id= rs.getInt("city_id");
        System.out.println("cityName = " + cityName);  // cityName = Ziguinchor
        System.out.println("countryId = " + countryId);  // countryId = 83

        System.out.println(city_id+" " + cityName+" "+ countryId); // 600 Ziguinchor 83


        rs.first(); // ilk kayda gidiyor   !!!!!!!!!!!!!!!!!!!!
        cityName= rs.getString(2);
        countryId = rs.getInt("country_id");
        city_id= rs.getInt("city_id");
        System.out.println("cityName = " + cityName); // cityName = A Corua (La Corua)
        System.out.println("countryId = " + countryId);  // countryId = 87

        System.out.println(city_id+" " + cityName+" "+ countryId); // 1 A Corua (La Corua) 87
    }

}