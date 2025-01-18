package Singleton;

public class DBConnection {
    private static DBConnection connectionObj;

    private DBConnection() {

    }

    // double locking
    public static DBConnection getInstance() {
        if (connectionObj == null) {
            synchronized (DBConnection.class) {
                if (connectionObj == null) {
                    connectionObj = new DBConnection();
                }
            }
        }

        return connectionObj;
    }
}
