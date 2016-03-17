package com.jungle.repository;

import com.jungle.entity.Record;

import java.util.List;

/**
 * Created by User on 16.03.2016.
 */
public interface RecordRepository {

    List<Record> findRecords();

    Record findOneRecord(int id);

}
