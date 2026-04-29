package solidPrinciples.documentEditorSOLIDExample.withSolid;

import java.util.ArrayList;
import java.util.List;

public class Document {
    public List<DocumentElementsRenderer> docElements = new ArrayList<>();

    public void addElement(DocumentElementsRenderer element){
        docElements.add(element);
    }
}
