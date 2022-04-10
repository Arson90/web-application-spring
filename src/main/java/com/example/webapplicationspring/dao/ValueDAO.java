package com.example.webapplicationspring.dao;

import com.example.webapplicationspring.data.Value;

import java.util.List;

public interface ValueDAO {

    List<Value> findAllDistinctValues(String columnName);

    List<Value> findAllDuplicateValues(String columnName);
}
