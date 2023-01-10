import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP","root","");
        Statement st= con.createStatement();
        String sql = "UPDATE LaptopInfo "+
                "SET LapPrice = 177000 WHERE id=300";
        st.executeUpdate(sql);
        ResultSet rs= st.executeQuery("select * from LaptopInfo");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"...."+rs.getString(2)+"..."+ rs.getInt(3));
        }
        con.close();
    }
}
