package solidPrinciples.documentEditorSOLIDExample.withSolid;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class DocFilePersistence implements DocPersistence{

    @Override
    public void save(String renderedDoc) {
        File file = new File("solidPrinciples/documentEditorSOLIDExample/withSolid/renderedDoc.txt");
        try{
            if(file.exists())
                file.delete();

            if (file.createNewFile()){
                try(FileWriter fileWriter = new FileWriter("solidPrinciples/documentEditorSOLIDExample/withSolid/renderedDoc.txt")){
                    fileWriter.write(renderedDoc);
                }
            }
            log.info("document saved successfully at solidPrinciples/documentEditorSOLIDExample/withSolid/renderedDoc.txt ");
        } catch(IOException ex){
            log.info("couldn't save document! {}", ex.getMessage());
        }
    }
}
