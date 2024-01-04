public class MainFileSystem {
    public static void main(String[] args) {
        FileSystemVisitor fileOperationVisitor = new FileOperationVisitor();
        FileSystemOperation fileSystemOperation = new ConcreteFileSystemOperation();

        TextFile textFile = new TextFile();
        ImageFile imageFile = new ImageFile();
        SVGFile svgFile = new SVGFile();

        textFile.accept(fileOperationVisitor);
        fileSystemOperation.performOperation(textFile);

        imageFile.accept(fileOperationVisitor);
        fileSystemOperation.performOperation(imageFile);

        svgFile.accept(fileOperationVisitor);
        fileSystemOperation.performOperation(svgFile);
    }
}
