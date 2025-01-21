package ObjectPool;

public class Main {
    public static void main(String[] args) {
        PoolManager poolManager = PoolManager.getInstance();

        DBConnection connection1 = poolManager.getDBConnection();
        DBConnection connection2 = poolManager.getDBConnection();
        DBConnection connection3 = poolManager.getDBConnection();
        DBConnection connection4 = poolManager.getDBConnection();
        DBConnection connection5 = poolManager.getDBConnection();
        DBConnection connection6 = poolManager.getDBConnection();
        poolManager.getDBConnection(); // it will return null

        poolManager.releaseDBConnection(connection1);
    }
}
