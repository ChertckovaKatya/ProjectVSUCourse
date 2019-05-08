package Cathedra;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Auth extends DatabaseHandler {

    public DatabaseHandler statement= new DatabaseHandler();
    private static Auth instance = new Auth();

    public static Auth getInstance() {
        return instance;
    }

    public Boolean CheckLoginName (User user) throws SQLException, ClassNotFoundException {
        ResultSet result = null;
        String name = user.getName();
        String password = user.getPassword();
        String query = "SELECT Name,Password from User where Name='"+ name +"' AND Password = '" + password + "';";
        //System.out.println("SELECT Name,Password from User where Name='"+ name +"' AND Password = '" + password + "';");
        result = statement.getDbConnection(query);
              while (result.next()) {
            System.out.println(result.getString("Name")+" , "+ result.getString("Password"));
        }
        if (result!=null) {
            return true;
        }
        else {
            return false;
        }
    }
}
