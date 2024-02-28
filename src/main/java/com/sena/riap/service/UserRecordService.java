package com.sena.riap.service;

import com.sena.riap.entities.Record;
import com.sena.riap.entities.UserRecord;

import java.util.List;

public interface UserRecordService {


    public List<Record> getUserRecord();

    public Record saveUserRecord(Record record);

    public Record getUserRecordById(Long id);

    public Record updateUserRecord(Long id,Record record);

    public void deleteUserRecord(Long id);
    List<UserRecord> getUserRecordsByRecordId(Long recordId);

    List<UserRecord> getUserRecordsByUserId(Long userId);


}
