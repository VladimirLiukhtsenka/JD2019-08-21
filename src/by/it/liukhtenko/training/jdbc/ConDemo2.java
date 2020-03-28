package by.it.liukhtenko.training.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConDemo2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/dataTest", "root", "_Kitano1992!");
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ){
            String sql = "SELECT * From Test";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Hi> hiList = new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                if (id == 4){
                    /*
                    // insert row
                    resultSet.moveToInsertRow();
                    resultSet.updateInt(1,3);
                    resultSet.updateString(2,"Привет!Добавили строку!");
                    resultSet.insertRow(); //фиксируем изменения
                    resultSet.moveToCurrentRow();//возвращаемся в текущую строку

                     */
                    //поменяли поле title в рекорде с id=4; (update row)
                    resultSet.updateString("title","Hi SQL!");
                    resultSet.updateRow();
                }
                String title = resultSet.getString(2);
                hiList.add(new Hi(id,title));

            }
            System.out.println(hiList);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
