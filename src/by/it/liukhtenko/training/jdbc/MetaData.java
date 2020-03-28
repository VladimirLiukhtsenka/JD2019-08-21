package by.it.liukhtenko.training.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;

public class MetaData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "_Kitano1992!");
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        properties.put("useSSL", "false");
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/dataTest?serverTimezone=" + TimeZone.getDefault().getID(), properties);
                Statement statement = connection.createStatement()
        ) {

            String sql = "SELECT id,title From Test";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Hi> hiList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String title = resultSet.getString(2);
                hiList.add(new Hi(id, title));
            }
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());
            System.out.println(resultSetMetaData.getColumnName(2));
            System.out.println(resultSetMetaData.getColumnType(2));
            System.out.println(resultSetMetaData.getColumnTypeName(2));
            System.out.println(resultSetMetaData.isNullable(2));
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println(databaseMetaData.getDatabaseProductName());
            System.out.println(databaseMetaData.getDatabaseProductVersion());
            System.out.println(databaseMetaData.getUserName());
            System.out.println(databaseMetaData.getURL());
            System.out.println(databaseMetaData.getURL());
//            System.out.println(hiList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
