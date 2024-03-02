package com.sena.riap.service;

import com.sena.riap.entities.Course;

import java.util.List;

public interface RecordService {

    public List<Course> getRecord();

    public Course saveRecord(Course course);

    public Course getRecordById(Long id);

    public Course updateRecord(Long id, Course course);

    public void deleteRecord(Long id);

}
