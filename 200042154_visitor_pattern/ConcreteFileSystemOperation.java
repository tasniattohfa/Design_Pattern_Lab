class ConcreteFileSystemOperation implements FileSystemOperation {
    @Override
    public void performOperation(TextFile file) {
        System.out.println("Performing operation on text file.");
    }

    @Override
    public void performOperation(ImageFile file) {
        System.out.println("Performing operation on image file.");
    }

    @Override
    public void performOperation(SVGFile file) {
        System.out.println("Performing operation on SVG file.");
    }
}