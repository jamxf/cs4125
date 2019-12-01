public class Login{

    private String username;
    private String password;
    private String accountType;
    private boolean isLoggedIn;

    public Login(){

    }

    //Create a new order with a specified orderID
    public Login(int user, String pass){
        this.username = user;
        this.password = pass;
        this.trackingNo = "NoTrackingNumSet";
    }

    public getUserName(){
        return this.username;
    }

    public getType(){
        return this.sccountType;

    }

    public checkType(){
        //connect to sql and check account type
        // SELECT type FROM users 

    }

}