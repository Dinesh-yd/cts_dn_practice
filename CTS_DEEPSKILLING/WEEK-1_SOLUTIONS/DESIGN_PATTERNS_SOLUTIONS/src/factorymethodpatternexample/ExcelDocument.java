package factorymethodpatternexample;

/**
   Represents an Excel document.
 */
public class ExcelDocument implements Document {
    @Override
    public void openDocument() {
        System.out.println("Opening Excel Document...");
    }
}