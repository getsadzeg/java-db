

package src.main;
import src.db.ConnectDB;
import src.utils.Credentials;


public class Main {
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB("jdbc:mysql://107.170.50.225:3306/lake", Credentials.user, Credentials.password); //Your credentials in that class
        System.out.println(db.openConnection());
        
        System.out.println(db.runStatement("SELECT Name, Surname, ID, phoneNumber, Password FROM users"));
        System.out.println(db.runUpdate("INSERT into users (Name, Surname) values('Tornike', 'Shavidze')"));


        db.displayData();
        
        System.out.println(db.closeConnection());
        
        
    }
}
