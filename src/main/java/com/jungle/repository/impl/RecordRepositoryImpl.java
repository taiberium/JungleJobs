package com.jungle.repository.impl;

import com.jungle.entity.Record;
import com.jungle.repository.RecordRepository;
import com.jungle.repository.mapper.RecordRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 16.03.2016.
 */
@Repository
public class RecordRepositoryImpl implements RecordRepository {

    protected JdbcOperations jdbcOperations;

    private static final String SELECT_FROM_TABLE = "SELECT * FROM record";

    @Autowired
    public RecordRepositoryImpl(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public List<Record> findRecords() {
        /*
        * if you want to run the query through preparedStatement
        * then need to use overloaded method with null arg,
        * info about that you can find in javadoc
        * */
        SqlRowSet rowSet = jdbcOperations.queryForRowSet(
                SELECT_FROM_TABLE,
                null
        );
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
        return records;
    }

    @Override
    public Record findOneRecord(int id) {
        /*
        * if you want to run the query through preparedStatement
        * then need to use overloaded method with null arg,
        * info about that you can find in javadoc
        * */
        return (Record) jdbcOperations.queryForObject(
                String.format(SELECT_FROM_TABLE + " WHERE id = %s", id),
                new RecordRowMapper(),
                null
        );
    }
}
