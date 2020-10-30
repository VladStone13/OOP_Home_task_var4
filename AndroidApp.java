public class AndroidApp extends AppFolder{
    private String AndroidAPI;

    AndroidApp(String name, String path, String permission, String androidAPI) {
        super(name, path, permission);
        AndroidAPI = androidAPI;
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
