package Database;

import java.sql.*;

public class Database {
    
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE = "jdbc:mysql://localhost:3306/Database_TPSIT?user=root&password=Lazzarelli&serverTimezone=Europe/Rome";
    static final String QUERY_1 = "SELECT Alunni.* FROM Alunni";

    public Database() {
        init();
    }
        
    // method to connect to database
    public void init (){
        
        try{           
            Class.forName(DRIVER);
            Connection cs = DriverManager.getConnection(DATABASE);

        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }     
}
