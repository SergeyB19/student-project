package com.anton.saburov.dao;

import com.anton.saburov.domain.Street;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDao {
    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jc_student",
                "postgres",
                "postgres"
        );
        return con;
    }


    public List<Street> findStreets(String pattern) throws SQLException {
        List<Street> result = new LinkedList<>();

        Connection con = getConnection();
        Statement stmt = con.createStatement();
        String sql = "select street_code,street_name from" +
                "jc_street where upper(street_name) like upper('%" + pattern + "%')";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Street str = new Street(rs.getLong("street_code"), rs.getString("street_name"));
            result.add(str);
        }
        return result;
    }
}
