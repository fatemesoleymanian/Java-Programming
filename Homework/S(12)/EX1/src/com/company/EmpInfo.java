package com.company;

import java.sql.SQLException;

@FunctionalInterface
public interface EmpInfo<T> {

    T info(T name, T education,T age ,T email ) throws SQLException, ClassNotFoundException ;

}
