package com.jungle.service;

import com.jungle.entity.Record;

import java.util.List;

/**
 * Created by User on 16.03.2016.
 */
public interface RecordService {

    List<Record> findRecords();

    Record findOneRecord(int id);
}
