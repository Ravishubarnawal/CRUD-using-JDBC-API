package CRUD;
import java.sql.*;
public class LaptopRepo {
    public void create(Laptop laptop) throws Exception {
        String Query = "INSERT INTO LaptopInfo (Id,LapName,LapPrice) VALUES (?,?,?)";
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP", "root", "");
        PreparedStatement statement = connection.prepareStatement(Query);
        statement.setInt(1, laptop.getLapId());
        statement.setString(2, laptop.getLapName());
        statement.setInt(3, laptop.getLapPrice());
        statement.executeUpdate();
    }
    public Laptop read(int Id) throws Exception {
        String sql = "SELECT * FROM LaptopInfo WHERE Id = ?";
        Laptop laptop = null;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP", "root", "");
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, Id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String lapName = resultSet.getString("LapName");
            int lapPrice = resultSet.getInt("LapPrice");
            laptop = new Laptop(Id, lapName, lapPrice);
        }
        return laptop;
    }
    public void update(Laptop laptop) throws Exception {
        String sql = "UPDATE LaptopInfo SET LapName =?,LapPrice = ? WHERE Id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP", "root", "");
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, laptop.getLapName());
        statement.setInt(2, laptop.getLapPrice());
        statement.setInt(3, laptop.getLapId());
        statement.executeUpdate();
        }
    public void delete(int Id) throws Exception {
        String sql = "DELETE FROM LaptopInfo WHERE id = ?";
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAPTOP", "root", "");
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, Id);
        statement.executeUpdate();
        System.out.println("The desired input Lap Id is Deleted From Database");
    }

}