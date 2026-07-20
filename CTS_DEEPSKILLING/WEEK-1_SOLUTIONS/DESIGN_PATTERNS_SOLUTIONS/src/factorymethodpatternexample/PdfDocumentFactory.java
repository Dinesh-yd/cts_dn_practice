package factorymethodpatternexample;

/**
  Factory responsible for creating PdfDocument objects.
 */
public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}