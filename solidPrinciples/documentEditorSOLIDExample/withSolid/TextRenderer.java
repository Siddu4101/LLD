package solidPrinciples.documentEditorSOLIDExample.withSolid;

public class TextRenderer implements DocumentElementsRenderer{
   private final String text;

    public TextRenderer(String text) {
        this.text = text;
    }

    @Override
    public StringBuilder render() {
        return new StringBuilder(text).append("\n");
    }
}
