
public abstract class RootFolder {
    private String path;
    private String name;


    public RootFolder() {
        path = "root";
        name = "root";
    }

    public RootFolder(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
