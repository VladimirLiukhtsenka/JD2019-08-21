package by.it.liukhtenko.training.jdbc.dao;

import by.it.liukhtenko.training.jdbc.Hi;

import java.util.List;

public interface HiDao extends BaseDao <Integer, Hi>{
    List <Hi> findHiByLastName(String patternName) throws DaoException;
}
