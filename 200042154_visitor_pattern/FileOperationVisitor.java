class FileOperationVisitor implements FileSystemVisitor {
    @Override
    public void visitTextFile(TextFile file) {
        System.out.println("Visiting text file.");
    }

    @Override
    public void visitImageFile(ImageFile file) {
        System.out.println("Visiting image file.");
    }

    @Override
    public void visitSVGFile(SVGFile file) {
        System.out.println("Visiting SVG file.");
    }
}