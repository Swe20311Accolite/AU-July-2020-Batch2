import java.sql.*;
public class JDBCconnection5{
    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("localhost/127.0.0.1","root", "");
            Statement s = conn.createStatement();
            String q1 = "select Top 10 id from hospitals";
            ResultSet r = s.executeQuery(q1);
            if (r.next())
            {
                System.out.println("hid: " + r.getString(1));
            }
            else
            {
                System.out.println("No such user id is already registered");
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("exception occurs");
        }
    }
}

