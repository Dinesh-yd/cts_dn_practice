package factorymethodpatternexample;

/* Factory responsible for creating WordDocument objects.
 */
public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
