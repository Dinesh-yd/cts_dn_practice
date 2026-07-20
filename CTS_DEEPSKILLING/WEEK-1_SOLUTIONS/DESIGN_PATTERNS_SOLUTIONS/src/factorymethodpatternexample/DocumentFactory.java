package factorymethodpatternexample;

/**
 * Abstract Factory Class

 Defines the factory method that concrete factories must implement.
 */
public abstract class DocumentFactory {

    /**
     Factory Method
     Creates and returns a document object.
     */
    public abstract Document createDocument();

    /**
     * Common operation using factory method.
     */
    public void displayDocument() {

        Document document = createDocument();

        System.out.println("Document created successfully.");

        document.openDocument();
    }
}