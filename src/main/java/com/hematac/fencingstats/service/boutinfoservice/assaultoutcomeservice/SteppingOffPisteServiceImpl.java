package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.SteppingOffPisteRepository;
import org.springframework.stereotype.Service;

@Service
public class SteppingOffPisteServiceImpl implements SteppingOffPisteService {

    private SteppingOffPisteRepository steppingOffPisteRepository;
    private AssaultOutcomeRepository assaultOutcomeRepository;

    public SteppingOffPisteServiceImpl(SteppingOffPisteRepository steppingOffPisteRepository, AssaultOutcomeRepository assaultOutcomeRepository){
        this.steppingOffPisteRepository = steppingOffPisteRepository;
        this.assaultOutcomeRepository = assaultOutcomeRepository;
    }
}
