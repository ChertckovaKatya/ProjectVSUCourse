package Cathedra.Contr;

import Cathedra.Model.User;

import java.sql.*;

import static Cathedra.Contr.Config.*;

public class DatabaseHandler  {
    private Connection conn = null;
    private ResultSet result;
    private PreparedStatement preStm;
    public static Statement dbConnection;

    public DatabaseHandler() {
//        String myDriver = "com.mysql.cj.jdbc.Driver";
        String myUrl = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName+"?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        System.out.println(myUrl);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(myUrl, dbUser, dbPass);
//            dbConnection = DriverManager.getConnection(myUrl,dbUser,dbPass).createStatement();
//            result = dbConnection.executeQuery(query);
        } catch (ClassNotFoundException e) {
            System.err.println("Ошибка подключения к базе данных!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Ошибка подключения к базе данных!");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.conn;
    }


    public ResultSet resultQuery (String query) {
        try {
            dbConnection = this.conn.createStatement();
            result = dbConnection.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public Boolean CheckLoginName (User user) throws SQLException, ClassNotFoundException {
        ResultSet result = null;
        String name = user.getName();
        String password = user.getPassword();
        String query = "SELECT Name,Password from User where Name='"+ name +"' AND Password = '" + password + "';";
        System.out.println("SELECT Name,Password from User where Name='"+ name +"' AND Password = '" + password + "';");
        result = resultQuery(query);
        if (result.next()) {
            return true;
        }
        else {
            return false;
        }
    }



    public User.ROLE getRoleByLoginPassword(User user) throws SQLException, ClassNotFoundException {
        User.ROLE role = User.ROLE.UNKNOWN;
        ResultSet result = null;
        String line_role = null;
        String name = user.getName();
        String password = user.getPassword();
        String query = "SELECT Role from User where Name='"+ name +"' AND Password = '" + password + "';";
        System.out.println("SELECT Role from User where Name='"+ name +"' AND Password = '"+ password +"';");
        try {
            result = resultQuery(query);
            while (result.next()) {
                line_role = result.getString("Role");
                System.out.println(result.getString("Role"));
            }


            if (line_role.equals("USER")){
                role= User.ROLE.USER;
            }
            else{
                if(line_role.equals("ADMIN")){
                    role= User.ROLE.ADMIN;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }

}
