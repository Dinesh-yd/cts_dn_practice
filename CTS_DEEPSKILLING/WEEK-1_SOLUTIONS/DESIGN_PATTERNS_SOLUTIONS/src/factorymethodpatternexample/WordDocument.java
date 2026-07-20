package factorymethodpatternexample;

/**
  Represents a Microsoft Word document.
 */
public class WordDocument implements Document {
    @Override
    public void openDocument() {
        System.out.println("Opening Word Document...");
    }
}
