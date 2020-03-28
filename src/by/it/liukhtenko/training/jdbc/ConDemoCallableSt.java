package by.it.liukhtenko.training.jdbc;

import java.sql.*;

public class ConDemoCallableSt {
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
            String sql = "{call findlastname (?,?)}";
            CallableStatement statement = connection.prepareCall(sql);
            statement.setInt(1,5);
            statement.registerOutParameter(2, Types.VARCHAR);
            statement.execute();
            String lastName = statement.getNString(2);
            System.out.println(lastName);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
