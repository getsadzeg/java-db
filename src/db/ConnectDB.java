

package src.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectDB {
    private Connection conn;
    private final String user;
    private final String password;
    private final String url;
    
    
    public ConnectDB(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.conn = null;
        //load mysql driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found...");
			e.printStackTrace();
		}
    }
    public boolean openConnection() {
        boolean RESULT = false;
        try {
            conn = DriverManager.getConnection(this.url, this.user, this.password);
            RESULT = true;
        }
        catch(SQLException ex) {
            System.out.println("something blew up");
            ex.printStackTrace();
        }
        return RESULT;
    }
    }
    
}
