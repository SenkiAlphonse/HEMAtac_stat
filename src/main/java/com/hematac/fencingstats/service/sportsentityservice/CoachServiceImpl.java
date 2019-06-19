package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachServiceImpl implements CoachService {

    private CoachRepository coachRepository;

    @Autowired
    public CoachServiceImpl(CoachRepository coachRepository){
        this.coachRepository = coachRepository;
    }
}
