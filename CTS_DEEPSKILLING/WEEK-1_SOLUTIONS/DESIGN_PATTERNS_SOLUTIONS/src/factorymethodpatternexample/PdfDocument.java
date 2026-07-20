package factorymethodpatternexample;

/**
  Represents a PDF document.
 */
public class PdfDocument implements Document {

    @Override
    public void openDocument() {
        System.out.println("Opening PDF Document...");
    }
}
