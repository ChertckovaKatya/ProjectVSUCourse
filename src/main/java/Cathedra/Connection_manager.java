package Cathedra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connection_manager {
    private PreparedStatement Stmt;

    private Connection Connected(String query){
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost:3306/sys_analysis_management?useSSL=false";
        try {
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            Stmt = conn.prepareStatement(query);
            return conn;
        } catch (Exception e) {
            System.err.println("Ошибка подключения к базе данных!");
            System.err.println(e.getMessage());
            return null;
        }
    }
}
