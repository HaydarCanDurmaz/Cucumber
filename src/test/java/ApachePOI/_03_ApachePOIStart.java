package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        // dosyanın yolunu degişkene atalım
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // JavaDosya okuma işlemcisine doyanı yolun u veriyoruz
        // böylece program ile dosya arasında baglantı oluştu
        FileInputStream dosyaokumaBaglantisi = new FileInputStream(path);


        // Dosya okuma işlemcisi üzerinden Çalışam Kitabını oluşturuyorum
        //hafızada workbook u alıp oluşturdu
        Workbook calismakitabi = WorkbookFactory.create(dosyaokumaBaglantisi);

        // istedigim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi = calismakitabi.getSheet("sheet1");

        // istenilen satırı alıyorum
        Row satir = calismaSayfasi.getRow(0);

        // istenilen hücreyi aldım
        Cell hucre = satir.createCell(0);

        System.out.println(hucre);


    }
}
