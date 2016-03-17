package com.jungle.service.impl;

import com.jungle.entity.Record;
import com.jungle.repository.RecordRepository;
import com.jungle.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by User on 16.03.2016.
 */
@Service
public class RecordServiceImpl implements RecordService {

    private RecordRepository recordRepository;

    @Autowired
    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public List<Record> findRecords() {
        return recordRepository.findRecords();
    }

    @Override
    public Record findOneRecord(int id) {
        return recordRepository.findOneRecord(id);
    }
}
