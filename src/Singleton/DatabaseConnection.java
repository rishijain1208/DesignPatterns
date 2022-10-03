package Singleton;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(String name)
    {

    }

    public static DatabaseConnection getInstance(String name)
    {
        if(databaseConnection==null)
        {
            synchronized (DatabaseConnection.class)
            {
                if(databaseConnection==null)
                {
                    databaseConnection = new DatabaseConnection(name);
                }
            }
        }
        return databaseConnection;
    }
}
