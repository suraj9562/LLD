package ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class PoolManager {
    List<DBConnection> freeConnections = new ArrayList<DBConnection>();
    List<DBConnection> inUseConnections = new ArrayList<DBConnection>();
    final static int INITIAL_POOL_SIZE = 3;
    final static int MAX_POOL_SIZE = 6;
    private static PoolManager poolManager = null;

    private PoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnections.add(new DBConnection());
        }
    }

    public static PoolManager getInstance() {
        if (poolManager == null) {
            synchronized (PoolManager.class) {
                if (poolManager == null) {
                    poolManager = new PoolManager();
                }
            }
        }

        return poolManager;
    }

    public synchronized DBConnection getDBConnection() {
        if (freeConnections.isEmpty() && inUseConnections.size() < MAX_POOL_SIZE) {
            freeConnections.add(new DBConnection());
        } else if (freeConnections.isEmpty() && inUseConnections.size() >= MAX_POOL_SIZE) {
            return null;
        }

        DBConnection connection = freeConnections.remove(freeConnections.size() - 1);
        inUseConnections.add(connection);
        return connection;
    }

    public synchronized void releaseDBConnection(DBConnection connection) {
        if (connection == null) {
            // throw null pointer exception
        }

        inUseConnections.remove(connection);
        freeConnections.add(connection);
    }
}
