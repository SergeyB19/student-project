package com.anton.saburov.dao;

import com.anton.saburov.domain.Street;
import com.anton.saburov.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
}
