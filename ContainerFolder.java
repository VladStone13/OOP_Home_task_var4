public abstract class ContainerFolder extends RootFolder{
    private String typeContent;
    private int sizeContent;

    ContainerFolder(String name, String path, String typeContent, int sizeContent) {
        super(name, path);
        this.typeContent = typeContent;
        this.sizeContent = sizeContent;
    }

    public abstract void deleteContainer();
    public abstract void moveContainer(String path);


}
