package Cathedral;

import java.sql.*;

public class DatabaseHandler extends Configs{
    private ResultSet result;
    private PreparedStatement preStm;
    public static Statement dbConnection;

    public ResultSet getDbConnection(String query)
            throws ClassNotFoundException, SQLException{
        String myDriver = "com.mysql.jdbc.Driver";
        String connectionString = "jdbc:mysql//"+ dbHost + ":"
                + dbPort + "/" + dbName + "?useSSL=false";
        System.out.println("jdbc:mysql//"+ dbHost + ":"
                + dbPort + "/" + dbName + "?useSSL=false");
        try {
            Class.forName(myDriver);
            dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass).createStatement();
            result = dbConnection.executeQuery(query);
            return result;
        }
        catch (Exception e) {
        System.err.println("Ошибка подключения к базе данных!");
        System.err.println(e.getMessage());
        return null;
    }
    }

//    public ResultSet resultQuery (String query) {
//        try {
////            System.out.println(query);
////            preStm = dbConnection.prepareStatement(query);
//            result = dbConnection.executeQuery(query);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }

}
