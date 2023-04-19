package _JBDC.Gun2;

import _JBDC.JBDCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _01_GetAllRowColumn extends JBDCParent {
    @Test
    public  void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();
        // Sonuçların haricindeki diğer bilgiler: colon sayısı, isimleri, tipleri

        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {
            System.out.print("Column name=" + rsmd.getColumnName(i));
            System.out.println("\tColumn type=" + rsmd.getColumnTypeName(i));
        }
        }
}
