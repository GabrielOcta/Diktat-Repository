package com.gabriel.util;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public interface DaoService<T> {

    List<T> fetchAll() throws SQLException, ClassNotFoundException;

    int addData(T t) throws SQLException, ClassNotFoundException;

    int updateData(T t) throws SQLException, ClassNotFoundException;

    int deleteData(T t) throws SQLException, ClassNotFoundException;
}
