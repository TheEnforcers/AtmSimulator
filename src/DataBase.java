import java.sql.Connection;
import java.sql.*;
public class DataBase
{
    public static void main(String[] args)
    {
        Connection con=null;
        String url="jdbc:derby://localhost:1527/";
        String dbname = "customers";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String uname = "";
        String pass = "";
        try
        {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, driver, driver);
            
            
                    
        }
    }
    
}