package com.sena.riap.service;

import com.sena.riap.entities.EventData;

import java.util.List;

public interface EventService {

    public List<EventData> getEvents();

    public EventData saveEvent(EventData eventData);

    public EventData getEventById(Long id);

    public EventData updateEvent(Long id, EventData eventData);

    public void deleteEvent(Long id);

}
