package _JBDC.Gun1;

import _JBDC.JBDCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowgetType extends JBDCParent {
    @Test
    public  void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select  city from city");

        rs.last(); // son satıra gider
        System.out.println("son satırın şeir adı="+rs.getString(1));

        rs.first();// ilk satırın adı
        System.out.println("ilk satırın şeir adı="+rs.getString(1));


        rs.last();
        int kacinciSatirdayim=rs.getRow(); // kaçıncı satırdayım
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);
    }
}
