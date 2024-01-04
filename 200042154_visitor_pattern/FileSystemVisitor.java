interface FileSystemVisitor {
    void visitTextFile(TextFile file);
    void visitImageFile(ImageFile file);
    void visitSVGFile(SVGFile file);
}