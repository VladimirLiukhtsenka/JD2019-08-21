package by.it.liukhtenko.training.jdbc.dao.impl;

import by.it.liukhtenko.training.jdbc.Hi;
import by.it.liukhtenko.training.jdbc.dao.DaoException;
import by.it.liukhtenko.training.jdbc.dao.HiDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class HiDaoImpl implements HiDao {
    private static final String SQL_SELECT_ALL_HI =
            "SELECT id, title FROM Test";
    private static final String SQL_SELECT_HI_BY_LASTNAME=
            "SELECT id, title FROM Test WHERE title=?";


    @Override
    public List<Hi> findHiByLastName(String patternName) throws DaoException {
        List<Hi> his = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataTest?serverTimezone=" + TimeZone.getDefault().getID(), "root", "_Kitano1992!");
            statement = connection.prepareStatement(SQL_SELECT_HI_BY_LASTNAME);
            statement.setString(1, patternName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Hi hi = new Hi();
                hi.setId(resultSet.getInt("id"));
                hi.setTitle(resultSet.getString("title"));
                his.add(hi);
            }
        }catch (SQLException e) {
           // System.err.println("SQLException (request or table failed): " + e);
            throw new DaoException(e);
        }finally {
            close(statement);
            close(connection);
            }

        return his;
    }

    @Override
    public List<Hi> findAll() {
        return null;
    }

    @Override
    public Hi findEntityById(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Hi hi) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean create(Hi hi) {
        return false;
    }

    @Override
    public Hi update(Hi hi) {
        return null;
    }

    @Override
    public void close(Statement statement) {

    }

    @Override
    public void close(Connection connection) {

    }
}
