package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.FencerTeamAffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FencerTeamAffiliationServiceImpl implements FencerTeamAffiliationService {

    private FencerTeamAffiliationRepository fencerTeamAffiliationRepository;

    @Autowired
    public FencerTeamAffiliationServiceImpl(FencerTeamAffiliationRepository fencerTeamAffiliationRepository){
        this.fencerTeamAffiliationRepository = fencerTeamAffiliationRepository;
    }
}
