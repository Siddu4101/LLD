package solidPrinciples.documentEditorSOLIDExample.withoutSolid;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DocumentEditor {
    private final List<String> docElements = new ArrayList<>();
    private StringBuilder renderedDoc = new StringBuilder();

    public void addText(String textElement){
        docElements.add(textElement);
    }

    public void addImage(String imgPathElement){
        docElements.add(imgPathElement);
    }

    public void saveDoc(){
        File file = new File("solidPrinciples/documentEditorSOLIDExample/withoutSolid/renderedDoc.txt");
        try{
            if(file.exists())
                file.delete();
            if (file.createNewFile()){
                try(FileWriter fileWriter = new FileWriter("solidPrinciples/documentEditorSOLIDExample/withoutSolid/renderedDoc.txt")){
                renderedDoc = renderedDoc != null ? renderedDoc : renderedDoc();
                fileWriter.write(renderedDoc.toString());
                }
            }
            log.info("document saved successfully at solidPrinciples/documentEditorSOLIDExample/withoutSolid/renderedDoc.txt ");
        } catch(IOException ex){
            log.info("couldn't save document! {}", ex.getMessage());
        }
    }

    public StringBuilder renderedDoc() {
       docElements.forEach(element->{
           if(element.endsWith(".png")){
               renderedDoc.append("![ ").append(element).append(" ]").append("\n");
           }else {
               renderedDoc.append(element).append("\n");
           }
       });
       return renderedDoc;
    }
}
