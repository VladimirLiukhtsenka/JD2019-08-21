package by.it.liukhtenko.training.jdbc;

import java.sql.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.*;

public class BatchMain {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "_Kitano1992!");
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        properties.put("useSSL", "false"); // FIXME: 23.12.2019  timezone and other in properties

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dataTest?serverTimezone=" + TimeZone.getDefault().getID(), properties);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.addBatch("INSERT INTO location VALUES (201, 'Karaganda')");
            statement.addBatch("INSERT INTO location VALUES (202, 'Lviv')");
            int[] updateCounts = statement.executeBatch();
            connection.commit();
            System.out.println(Arrays.toString(updateCounts));
        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (connection != null) {
                    connection.setAutoCommit(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
