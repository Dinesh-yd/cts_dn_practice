package factorymethodpatternexample;

/**
 * Test class to demonstrate
 * Factory Method Pattern.
 */
public class FactoryDesignPatternTest {

    public static void main(String[] args) {

        System.out.println("WORD DOCUMENT");

        DocumentFactory wordFactory = new WordDocumentFactory();

        wordFactory.displayDocument();

        System.out.println();

        System.out.println("PDF DOCUMENT");

        DocumentFactory pdfFactory = new PdfDocumentFactory();

        pdfFactory.displayDocument();

        System.out.println();

        System.out.println("EXCEL DOCUMENT");

        DocumentFactory excelFactory = new ExcelDocumentFactory();

        excelFactory.displayDocument();
    }
}
/*
  Factory Method Pattern is a creational design pattern that defines an interface for creating objects while allowing subclasses to decide which object to instantiate. It promotes loose coupling by separating object creation from object usage.
  OUTPUT:
  WORD DOCUMENT
  Document created successfully.
  Opening Word Document...

  PDF DOCUMENT
  Document created successfully.
  Opening PDF Document...

  EXCEL DOCUMENT
  Document created successfully.
  Opening Excel Document...

Process finished with exit code 0

 */