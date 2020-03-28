package by.it.liukhtenko.training.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConDemo3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/dataTest", "root", "_Kitano1992!");
        ) {
            String sql = "INSERT INTO Test (id, title)values (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 33);
            preparedStatement.setString(2, "Вредоносный запрос ;)");
            int rowsUpdate = preparedStatement.executeUpdate();
            System.out.println(rowsUpdate);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
