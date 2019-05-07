package Cathedral;

import java.sql.ResultSet;

public class Auth extends DatabaseHandler {
    DatabaseHandler conn;
    private static Auth instance = new Auth();

    public static Auth getInstance() {
        return instance;
    }

    public Boolean CheckLoginName (User user){
        String query = "SELECT Name,Password from User where Name='"+ Const.USER_NAME +"' AND Password = '" + Const.USER_PASSWORD + "';";
        System.out.println("SELECT Name,Password from User where Name='\"+ Const.USER_NAME +\"' AND Password = '\" + Const.USER_PASSWORD + \"';");
        ResultSet result = conn.resultQuery(query);
        if (result !=null) {
            return true;
        }
        else {
            return false;
        }
    }




}
