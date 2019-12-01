import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Login{

    private String username;
    private String password;
    private String accountType;
    private boolean isLoggedIn;

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public Login(){
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Setup the connection with the DB
            connect = DriverManager
                .getConnection("DB-URL"
                + "user=root&password=");

            statement = connect.createStatement();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Create a new order with a specified orderID
    public Login(int user, String pass){
        this.username = user;
        this.password = pass;
        
    }

    public getUserName(){
        return this.username;
    }

    public getType(){
        return this.sccountType;

    }

    public boolean checkDetails(){
        

    }

    public checkType(){
        //connect to sql and check account type
        // SELECT type FROM users 

    }

    public getDB(){
        

    }

}