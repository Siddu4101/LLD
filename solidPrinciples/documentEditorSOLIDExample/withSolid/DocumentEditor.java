package solidPrinciples.documentEditorSOLIDExample.withSolid;

public class DocumentEditor {
    private final Document document;
    private final DocPersistence docPersistence;
    private StringBuilder renderedDoc = new StringBuilder();

    /*
    * This follows SOLID principle and all-most all the work of single class is now delegated(Single responsibility)
    * and using abstract contract (interface) for (open-close + interface segragation + dependency inversion)
    * substitution also works as we have many child from interface and using them to invoke respective render save using runtime polymorphism
    * */
    public DocumentEditor(Document document, DocPersistence docPersistence) {
        this.document = document;
        this.docPersistence = docPersistence;
    }

    public void addElement(DocumentElementsRenderer element){
        document.addElement(element);
    }

    public StringBuilder renderDoc(){
        if(!renderedDoc.isEmpty())
            return renderedDoc;

        document.docElements.forEach(element-> renderedDoc.append(element.render()));
        return renderedDoc;
    }

    public void save(){
        docPersistence.save(renderDoc().toString());
    }
}
