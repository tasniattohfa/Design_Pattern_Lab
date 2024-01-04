class ImageFile implements FileSystemVisitable {
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitImageFile(this);
    }
}