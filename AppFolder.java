public abstract class AppFolder extends RootFolder{
    private String permission;

    public AppFolder(String name, String path, String permission) {
        this.setName(name);
        this.setPath(path);
        this.permission = permission;
    }

    public abstract void deleteApp();
    public abstract void moveApp(String path);
    public abstract void changeApp();
    public abstract void startApp();

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
