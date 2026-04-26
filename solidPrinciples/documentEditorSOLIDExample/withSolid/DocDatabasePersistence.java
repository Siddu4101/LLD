package solidPrinciples.documentEditorSOLIDExample.withSolid;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DocDatabasePersistence implements DocPersistence{
    private final String renderedDoc;

    public DocDatabasePersistence(String renderedDoc) {
        this.renderedDoc = renderedDoc;
    }

    @Override
    public void save(String renderedDoc) {
        log.info("Saving document to the Postgres database...");
    }
}
