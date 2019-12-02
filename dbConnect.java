import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbConnect {

    private static String servername = "sql2.freemysqlhosting.net";
    private static String username = "sql2310859";
    private static String dbname  = "sql2310859";
    private static Integer portnumber  = 3306;
    private static String password = "vV9%dB2!";
    
    public static Connection getConnection()
    {
        Connection connect = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            connect = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + dbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connect;
    }
    
}
