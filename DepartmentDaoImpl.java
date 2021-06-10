package com.gabriel.dao;

import com.gabriel.entity.Department;
import com.gabriel.util.DaoService;
import com.gabriel.util.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public class DepartmentDaoImpl implements DaoService<Department> {

    @Override
    public List<Department> fetchAll() throws SQLException, ClassNotFoundException {
        List<Department> departments = new ArrayList<>();
        String query = "SELECT id, name FROM departement";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()){
                        Department department = new Department();
                        department.setId(rs.getInt("id"));
                        department.setName(rs.getString("name"));
                        departments.add(department);
                    }
                }
            }
        }
        return departments;
    }

    @Override
    public int addData(Department department) throws SQLException, ClassNotFoundException {
        int result = 0;
        String query = "INSERT INTO departement(name) VALUES(?)";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1,department.getName());
                if(ps.executeUpdate() != 0){
                    connection.commit();
                    result = 1;
                }
                else {
                    connection.rollback();
                }
            }
        }
        return result;
    }

    @Override
    public int updateData(Department department) throws SQLException, ClassNotFoundException {
        int result = 0;
        String query = "UPDATE departement SET name = ? WHERE id = ?";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, department.getName());
                ps.setInt(2,department.getId());
                if(ps.executeUpdate() != 0){
                    connection.commit();
                    result = 1;
                }
                else {
                    connection.rollback();
                }
            }
        }
        return result;
    }

    @Override
    public int deleteData(Department department) throws SQLException, ClassNotFoundException {
        int result = 0;
        String query = "DELETE FROM departement WHERE id = ?";
        try (Connection connection = MySQLConnection.createConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setInt(1,department.getId());
                if(ps.executeUpdate() != 0){
                    connection.commit();
                    result = 1;
                }
                else {
                    connection.rollback();
                }
            }
        }
        return result;
    }
}
