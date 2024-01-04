class TextFile implements FileSystemVisitable {
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitTextFile(this);
    }
}