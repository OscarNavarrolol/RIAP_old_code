package com.sena.riap.service;

import com.sena.riap.entities.EventData;

import java.util.List;

public interface EventDataService {

    public List<EventData> getEventData();

    public EventData saveEventData(EventData eventData);

    public EventData getEventDataById(Long id);

    public EventData updateEventData(Long id, EventData eventData);

    public void deleteEventData(Long id);

}
