package by.it.liukhtenko.training.jdbc.dao;

import by.it.liukhtenko.training.jdbc.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;

public interface BaseDao <K,T extends Entity>{
    List<T> findAll();
    T findEntityById(K id);
    boolean delete (T t);
    boolean delete (K id);
    boolean create (T t);
    T update (T t);

    default void close(Statement statement){
        try {
            if (statement != null){
                statement.close();//.close!
            }
        } catch (Exception e) {
            e.printStackTrace();
            //
        }
    }
    default void close (Connection connection){
        try {
            if (connection != null){
                //
                connection.close();
            }
        } catch (SQLException e) {
            //
           // e.printStackTrace();
        }
    }
}
