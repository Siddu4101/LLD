package solidPrinciples.documentEditorSOLIDExample.withSolid;

public class TabRenderer implements DocumentElementsRenderer{

    @Override
    public StringBuilder render() {
        return new StringBuilder("\t");
    }
}
