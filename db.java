
package MyApplication;

import java.sql.*;
import javax.swing.JOptionPane;

public class db {
    
    Connection conn=null;
    public static Connection javadb()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","");
           return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
