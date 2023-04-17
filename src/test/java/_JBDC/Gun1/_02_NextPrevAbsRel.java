package _JBDC.Gun1;

import _JBDC.JBDCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JBDCParent {
    @Test
    public void NextPrev() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();// ilk satır
        System.out.println("1.satır DilAdi="+rs.getString(2));// konum adı 2 colum sırası Englisch

        rs.next();// 2 satır
        System.out.println("2.satır DilAdi="+rs.getString(2));// italian

        rs.next();// 3 satır
        System.out.println("3.satır DilAdi="+rs.getString(2));// Japanese

        rs.previous(); // 2 satıra geri gitti
        System.out.println("2.satır DilAdi="+rs.getString(2));// italien



    }
}
