package com.anton.saburov.dao;

import com.anton.saburov.domain.Street;
import com.anton.saburov.exception.DaoException;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DictionaryDaoImpl implements DictionaryDao {
    private static final String GET_STREET = "select street_code, street_name from jc_street where upper(street_name) like UPPER(?)";

    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jc_student",
                "postgres",
                "postgres"
        );
        return con;
    }


    public List<Street> findStreets(String pattern) throws DaoException {
        List<Street> result = new LinkedList<>();


        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(GET_STREET)) {
            stmt.setString(1, "%" + pattern + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Street str = new Street(rs.getLong("street_code"), rs.getString("street_name"));
                result.add(str);
            }

        } catch (SQLException ex) {
            throw new DaoException(ex);
        }
        return result;
    }
}
