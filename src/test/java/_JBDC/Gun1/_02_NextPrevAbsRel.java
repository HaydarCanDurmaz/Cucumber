package _JBDC.Gun1;

import _JBDC.JBDCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JBDCParent {
    @Test
    public void NextPrev() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();// ilk satır
        System.out.println("1.satır DilAdi=" + rs.getString(2));// konum adı 2 colum sırası Englisch

        rs.next();// 2 satır
        System.out.println("2.satır DilAdi=" + rs.getString(2));// italian

        rs.next();// 3 satır
        System.out.println("3.satır DilAdi=" + rs.getString(2));// Japanese

        rs.previous(); // 2 satıra geri gitti
        System.out.println("2.satır DilAdi=" + rs.getString(2));// italien


    }

    @Test
    public void AbsoluteRelative() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from film");

        // rs.next() : sonraki satır
        // rs.previous : önceki satır
        // rs.absolute(10) : baştan itibaren 10.satıra gider.
        // rs.relative(10) : bulunduğu yerden 10.satıra gider.
        // rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
        // rs.relative(-5) :  - (eksi) bulundu yerden 5 satır geri

        rs.absolute(10);  // 10.satır git
        System.out.println("10.satır - title = " + rs.getString("title"));

        //rs.absolute(5); // 5.satıra giderdi.

        rs.relative(5);  // 15.satıra gider. Niye? çünkü en son bulunduğu yerden 5 satır gider
        System.out.println("15.satır - title = " + rs.getString("title"));

        rs.absolute(-10); // sondan 10.satır a git
        System.out.println("sondan 10.satır - title = " + rs.getString("title"));
    }
}
