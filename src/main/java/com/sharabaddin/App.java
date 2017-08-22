package com.sharabaddin;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class App {

    private App() {
        //utility class and should not be constructed.
    }

    /**
     * This will print the documents text in a certain area.
     *
     * @param args The command line arguments.
     *
     * @throws IOException If there is an error parsing the document.
     */
    public static void main(String[] args)  throws IOException {
        System.setProperty("sun.java2d.cmm", "sun.java2d.cmm.kcms.KcmsServiceProvider");
        try {
            FileUtils.copyURLToFile(new URL("https://bank.gov.ua/files/genlicbank.pdf"), new File("download_files/genlicbank.pdf"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try (PDDocument document = PDDocument.load(new File("download_files/genlicbank.pdf"))) {
            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
            stripper.setSortByPosition( true );
            Rectangle rect = new Rectangle( 10, 255, 700, 60 );
            stripper.addRegion( "class1", rect );
            PDPage firstPage = document.getPage(0);
            stripper.extractRegions( firstPage );
            System.out.println( "Text in the area:" + rect );
            System.out.println( stripper.getTextForRegion( "class1" ) );
        }
    }

    /**
     * This will print the usage for this document.
     */
    private static void usage()
    {
        System.err.println( "Usage: java " + App.class.getName() + " <input-pdf>" );
    }

}

