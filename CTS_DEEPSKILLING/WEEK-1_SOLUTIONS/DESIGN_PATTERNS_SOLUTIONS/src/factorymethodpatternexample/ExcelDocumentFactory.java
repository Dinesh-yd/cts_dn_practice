package factorymethodpatternexample;

/**
  Factory responsible for creating ExcelDocument objects.
 */
public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}