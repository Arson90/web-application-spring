package com.example.webapplicationspring.data;

import org.springframework.jdbc.core.RowMapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValueMapper implements RowMapper<Value> {

    @Override
    public Value mapRow(ResultSet rs, int rowNum) throws SQLException {
        Value value = new Value();
        value.setId(BigInteger.valueOf(rs.getInt("id")));
        value.setFirstColumn(rs.getString("kolumna1"));
        value.setSecondColumn(rs.getString("kolumna2"));
        value.setThirdColumn(rs.getString("kolumna3"));
        value.setFourthColumn(BigInteger.valueOf(rs.getInt("kolumna4")));
        return value;
    }
}
