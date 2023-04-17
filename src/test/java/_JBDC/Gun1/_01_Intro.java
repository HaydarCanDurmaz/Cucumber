package _JBDC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void test1() throws SQLException {
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        // connetions açılıyor i fileInputstream
        Connection connection = DriverManager.getConnection(hostUrl, username, password);// baglantıya click 1.madde

        Statement statement = connection.createStatement(); // sorguları çalıştırmak için sorgu gönderme ortamı

        // sorguyu yazdım ve  çalıştırdım
        ResultSet rs = statement.executeQuery("select * from customer");// sorgu çalıştı sonuçları nerde

        // ilk satırımı yada son satırı yada 5 satırımı istiyorsun diye
        rs.next();// sıradaki 1.satıra ilk satıra gitti

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        System.out.println("1 satırdaki müşterinin adı soyadı = " + firstName + " " + lastName);

        rs.next();// sıradaki 2.satıra 2 satıra gitti


        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");
        System.out.println("2 satırdaki müşterinin adı soyadı = " + firstName + " " + lastName);

        connection.close();


    }
}
