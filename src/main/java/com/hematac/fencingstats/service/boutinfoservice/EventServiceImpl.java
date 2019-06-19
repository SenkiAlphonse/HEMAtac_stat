package com.hematac.fencingstats.service.boutinfoservice;

import com.hematac.fencingstats.repository.boutinforepository.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }
}
