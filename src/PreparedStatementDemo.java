import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP","root","");
        String sqlQuery="INSERT INTO LaptopInfo (Id,LapName,LapPrice) VALUES (?,?,?)";
        PreparedStatement myStmt = connection.prepareStatement(sqlQuery);
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter Laptop Id");
            int Id= sc.nextInt();
            System.out.println("Enter Laptop Name");
            Scanner sc1=new Scanner(System.in);
            String LapName= sc1.nextLine();
            System.out.println("Enter Laptop Price");
            int LapPrice=sc.nextInt();
            myStmt.setInt(1,Id);
            myStmt.setString(2,LapName);
            myStmt.setInt(3,LapPrice);
            myStmt.executeUpdate();
            System.out.println("Record Inserted successfully");
            System.out.println("Do you want to insert one more record (Yes/No)");
            String option= sc.next();
            if(option.equalsIgnoreCase("No")){
                break;
            }

        }
        ResultSet rs=myStmt.executeQuery("select * from LaptopInfo");
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        connection.close();


    }

}
