package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private final Connection connection;

    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/IJSE", "root", "1234");
    }

    public static DbConnection getDbConnection() throws SQLException, ClassNotFoundException {
        return dbConnection == null ? dbConnection = new DbConnection() : dbConnection;
    }

    public static DbConnection getInstance() throws SQLException, ClassNotFoundException {
        if (dbConnection==null){
            dbConnection= new DbConnection();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
