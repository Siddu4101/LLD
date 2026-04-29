package solidPrinciples.documentEditorSOLIDExample.withSolid;

public class ImageRenderer implements DocumentElementsRenderer{
    private final String imgPath;

    public ImageRenderer(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public StringBuilder render() {
        return new StringBuilder("![ ").append(imgPath).append(" ]").append("\n");
    }
}
