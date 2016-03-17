package com.jungle.repository.mapper;

import com.jungle.entity.Record;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 16.03.2016.
 */
@SuppressWarnings("rawtypes")
public class RecordRowMapper implements RowMapper {

    @Override
    public Record mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Record(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("content"),
                rs.getDate("creation_date")
        );
    }
}
