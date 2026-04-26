package solidPrinciples.documentEditorSOLIDExample.withSolid;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestDocEditorWithSolid {
    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor(new Document(), new DocFilePersistence());
        documentEditor.addElement(new TextRenderer("Hey I am Sid, my profile picture as below "));
        documentEditor.addElement(new TabRenderer());
        documentEditor.addElement(new ImageRenderer("profile.png"));
        documentEditor.addElement(new TextRenderer("Bye..."));

        StringBuilder renderedDoc = documentEditor.renderDoc();
        log.info("The rendered document is {}", renderedDoc.toString());

        documentEditor.save();
    }
}
