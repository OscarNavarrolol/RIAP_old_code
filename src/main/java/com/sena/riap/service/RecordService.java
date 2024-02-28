package com.sena.riap.service;

import com.sena.riap.entities.Program;
import com.sena.riap.entities.Record;

import java.util.List;

public interface RecordService {

    public List<Record> getRecord();

    public Record saveRecord(Record record);

    public Record getRecordById(Long id);

    public Record updateRecord(Long id,Record record);

    public void deleteRecord(Long id);

}
