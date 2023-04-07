package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        // hafızadaki workbook ve sheet ini oluturucam
        XSSFWorkbook workbook = new XSSFWorkbook(); // hafızada bir workbook oluşturdu
        XSSFSheet sheet = workbook.createSheet("Sayfa1"); // içine sheet oluşturdum

        // Hafızadaki işlemlerle devam edyorum
        Row yeniSatir = sheet.createRow(0);
        Cell yeniHucre = yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dünya");

        // path ini verip Yazdırma işlmei Save işlemi

        String path ="src/test/java/ApachePOI/resource/NewExcel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();
        System.out.println("işlemler Tamalnadı");

    }
}
