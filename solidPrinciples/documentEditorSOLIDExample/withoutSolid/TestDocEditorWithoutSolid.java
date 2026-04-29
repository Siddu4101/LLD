package solidPrinciples.documentEditorSOLIDExample.withoutSolid;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestDocEditorWithoutSolid {
    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.addText("Hey I am Sid, my profile picture as below ");
        documentEditor.addImage("profile.png");
        documentEditor.addText("Bye...");

        StringBuilder renderedDoc = documentEditor.renderedDoc();
        log.info("The rendered document is {}", renderedDoc.toString());

        documentEditor.saveDoc();
    }
}
