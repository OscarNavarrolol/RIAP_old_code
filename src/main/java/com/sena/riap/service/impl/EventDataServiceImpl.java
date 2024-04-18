package com.sena.riap.service.impl;

import com.sena.riap.entities.EventData;
import com.sena.riap.repository.EventDataRepository;
import com.sena.riap.service.EventDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventDataServiceImpl implements EventDataService {

    @Autowired
    private EventDataRepository eventDataRepository;

    @Override
    public List<EventData> getEventData() {
        return eventDataRepository.findAll();
    }

    @Override
    public EventData saveEventData(EventData eventData) {
        return eventDataRepository.save(eventData);
    }

    @Override
    public EventData getEventDataById(Long id) {
        return eventDataRepository.findById(id).orElse(null);
    }

    @Override
    public EventData updateEventData(Long id, EventData eventData) {
        EventData eventExisting = eventDataRepository.findById(id).orElse(null);

        if (eventExisting != null){
            eventExisting.setDate(eventData.getDate());
            eventExisting.setObjective(eventData.getObjective());
            eventExisting.setStartTime(eventData.getStartTime());
            eventExisting.setEndTime(eventData.getEndTime());
            eventExisting.setLocation(eventData.getLocation());
            return eventDataRepository.save(eventExisting);
        }
        return null;
    }

    @Override
    public void deleteEventData(Long id) {
        eventDataRepository.deleteById(id);
    }

    @Override
    public List<EventData> findEventsByCourseNumber(int courseNumber) {
        return eventDataRepository.findEventsByCourseNumber(courseNumber);
    }
}
