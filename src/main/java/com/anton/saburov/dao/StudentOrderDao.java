package com.anton.saburov.dao;

import com.anton.saburov.domain.wedding.StudentOrder;
import com.anton.saburov.exception.DaoException;

import java.util.List;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException;


}
