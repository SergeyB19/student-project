package com.anton.saburov.dao;

import com.anton.saburov.domain.CountryArea;
import com.anton.saburov.domain.RegisterOffice;
import com.anton.saburov.domain.wedding.PassportOffice;
import com.anton.saburov.domain.wedding.Street;
import com.anton.saburov.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;
}
