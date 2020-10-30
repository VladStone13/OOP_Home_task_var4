public class WindowsApp extends AppFolder{
    private String WindowsAPI;

    WindowsApp(String name, String path, String permission, String androidAPI) {
        super(name, path, permission);
        WindowsAPI = androidAPI;
    }

    @Override
    public void deleteApp() {
    }

    @Override
    public void moveApp(String path) {
    }

    @Override
    public void changeApp() {
        if(super.getPermission() == "YES") {
        }
    }

    @Override
    public void startApp() {
    }
}
