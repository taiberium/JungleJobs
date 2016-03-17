package com.jungle.presentation;

import com.jungle.entity.Record;
import com.jungle.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * Created by User on 16.03.2016.
 */
@Controller
public class NewsRecordsController {

    private RecordService recordService;

    @Autowired
    public NewsRecordsController(RecordService recordService) {
        this.recordService = recordService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/record", produces = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    Collection<Record> findRecords() {
        return recordService.findRecords();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/record/{recordId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    Record findSingleRecord(@PathVariable Integer recordId) {
        return recordService.findOneRecord(recordId);
    }
}
