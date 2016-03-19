package com.jungle.repository.mapper;

import com.jungle.entity.Record;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * Created by User on 16.03.2016.
 */

public class RecordRowMapper implements RowMapper {

    public static List<Record> mapRecords(SqlRowSet rowSet) {
        List<Record> records = new ArrayList<>();
        while (rowSet.next()) {
            records.add(
                    new Record(
                            rowSet.getInt("id"),
                            rowSet.getString("title"),
                            rowSet.getString("content"),
                            rowSet.getDate("creation_date")
                    )
            );
        }
        return unmodifiableList(records);
    }

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
