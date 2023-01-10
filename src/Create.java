import java.sql.*;
public class Create {
    public static void main(String[] args) throws  Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP","root","");
        Statement st= con.createStatement();
        String sql = "CREATE TABLE LaptopInfo" +
                " (id INTEGER not NULL, " +
                " LapName VARCHAR(255), " +
                " LapPrice INTEGER(50)," +
                " PRIMARY KEY (id))";
        st.executeUpdate(sql);
        System.out.println("Table is created successfully");
        con.close();
    }
}