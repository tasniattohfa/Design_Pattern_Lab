class SVGFile implements FileSystemVisitable {
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitSVGFile(this);
    }
}
