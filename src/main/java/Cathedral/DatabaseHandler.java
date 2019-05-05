package Cathedral;

import java.sql.*;

public class DatabaseHandler extends Configs{
    private ResultSet result;
    private PreparedStatement preStm;
    private Connection dbConnection;

    public Connection getDbConnection(String query)
            throws ClassNotFoundException, SQLException{
        String myDriver = "com.mysql.jdbc.Driver";
        String connectionString = "jdbc:mysql//"+ dbHost + ":"
                + dbPort + "/" + dbName;
        try {
            Class.forName(myDriver);
            dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
            return dbConnection;
        }
        catch (Exception e) {
        System.err.println("Ошибка подключения к базе данных!");
        System.err.println(e.getMessage());
        return null;
    }
    }

    public ResultSet resultQuery (String query) {
        try {
            preStm = dbConnection.prepareStatement(query);
            result = preStm.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
