import java.sql.*;
public class Delete {
    public static void main(String[] args) throws  Exception {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://192.100.0.000:3306/LAPTOP", "root", "");
             Statement st = con.createStatement();
             String sql = "DELETE FROM LaptopInfo" +
                    "WHERE  id=200";
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("select * from LaptopInfo");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "...." + rs.getString(2) + "...." + rs.getInt(3));
            }
        con.close();
    }
}
