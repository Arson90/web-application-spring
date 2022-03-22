package com.example.webapplicationspring.repository;

import com.example.webapplicationspring.data.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValueRepository{

    List<Value> findAllDistinctValues(String columnName);

    List<Value> findAllDuplicateValues(String columnName);
}
