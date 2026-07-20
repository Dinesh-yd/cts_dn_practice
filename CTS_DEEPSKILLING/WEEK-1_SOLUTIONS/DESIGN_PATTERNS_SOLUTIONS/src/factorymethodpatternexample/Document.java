package factorymethodpatternexample;

/**
  Common interface for all document types.
  Every document should provide its own implementation of openDocument().
 */
public interface Document {

    void openDocument();
}
