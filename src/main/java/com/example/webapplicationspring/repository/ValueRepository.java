package com.example.webapplicationspring.repository;

import com.example.webapplicationspring.data.Value;
import com.example.webapplicationspring.data.ValueMapper;
import com.example.webapplicationspring.dao.ValueDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ValueRepository implements ValueDAO {

    private final JdbcTemplate jdbcTemplate;

    public ValueRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Value> findAllDistinctValues(String columnName) {
        String sql = String.format("SELECT DISTINCT ON(%s) * FROM tabela_testowa", columnName);
        return jdbcTemplate.query(sql, new ValueMapper());
    }

    @Override
    public List<Value> findAllDuplicateValues(String columnName) {
        String sql = String.format("SELECT tt.* FROM tabela_testowa AS tt " +
                "JOIN (SELECT %s FROM tabela_testowa GROUP BY %s HAVING COUNT(*)>1) AS temp " +
                "ON tt.%s=temp.%s", columnName, columnName, columnName, columnName);
        return jdbcTemplate.query(sql, new ValueMapper());
    }
}
