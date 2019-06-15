package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.CoachRepository;
import org.springframework.stereotype.Service;

@Service
public class CoachServiceImpl implements CoachService {

    private CoachRepository coachRepository;

    public CoachServiceImpl(CoachRepository coachRepository){
        this.coachRepository = coachRepository;
    }
}
