package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.FencerRepository;
import org.springframework.stereotype.Service;

@Service
public class FencerServiceImpl implements FencerService {

    private FencerRepository fencerRepository;

    public FencerServiceImpl(FencerRepository fencerRepository){
        this.fencerRepository = fencerRepository;
    }
}
