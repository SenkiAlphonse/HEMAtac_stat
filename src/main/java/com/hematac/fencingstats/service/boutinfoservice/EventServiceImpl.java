package com.hematac.fencingstats.service.boutinfoservice;

import com.hematac.fencingstats.repository.boutinforepository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }
}
