package com.sena.riap.service;

import com.sena.riap.entities.Event;

import java.util.List;

public interface EventService {

    public List<Event> getEvents();

    public Event saveEvent(Event event);

    public Event getEventById(Long id);

    public Event updateEvent(Long id,Event event);

    public void deleteEvent(Long id);

}
