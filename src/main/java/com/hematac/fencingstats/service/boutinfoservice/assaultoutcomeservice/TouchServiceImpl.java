package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.TouchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TouchServiceImpl implements TouchService {

    private TouchRepository touchRepository;
    private AssaultOutcomeRepository assaultOutcomeRepository;

    @Autowired
    public TouchServiceImpl(TouchRepository touchRepository, AssaultOutcomeRepository assaultOutcomeRepository){
        this.touchRepository = touchRepository;
        this.assaultOutcomeRepository = assaultOutcomeRepository;
    }
}
