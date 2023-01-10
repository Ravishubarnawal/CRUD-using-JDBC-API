import java.sql.*;
public class Insert {
    public static void main(String[] args) throws  Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP","root","");
        Statement st= con.createStatement();
//        String sql1 = "INSERT INTO LaptopInfo VALUES (100,'acer', 125000)";
//        st.executeUpdate(sql1);
        String sql2 = "INSERT INTO LaptopInfo VALUES (200, 'dell', 150000)";
        st.executeUpdate(sql2);
//        String sql3 = "INSERT INTO LaptopInfo VALUES (300, 'lenovo', 175000)";
//        st.executeUpdate(sql3);
        System.out.println("Table is created successfully");
        con.close();
    }
}
