interface FileSystemOperation {
    void performOperation(TextFile file);
    void performOperation(ImageFile file);
    void performOperation(SVGFile file);
}