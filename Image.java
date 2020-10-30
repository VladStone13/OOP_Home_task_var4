public class Image extends ContainerFolder{
    private double compression;

    @Override
    public void deleteContainer() {
    }

    @Override
    public void moveContainer(String path) {
    }

    Image(String name, String path, String typeImage, int sizeImage, int compression) {
        super(name, path, typeImage, sizeImage);
        this.compression = compression;
    }

    public void setCompression(double compression) {
        this.compression = compression;
    }

    public double getCompression() {
        return compression;
    }
}
