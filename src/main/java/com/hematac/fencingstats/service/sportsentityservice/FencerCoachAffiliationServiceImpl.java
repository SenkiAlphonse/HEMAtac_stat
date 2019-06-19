package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.FencerCoachAffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FencerCoachAffiliationServiceImpl implements FencerCoachAffiliationService {

    private FencerCoachAffiliationRepository fencerCoachAffiliationRepository;

    @Autowired
    public FencerCoachAffiliationServiceImpl(FencerCoachAffiliationRepository fencerCoachAffiliationRepository){
        this.fencerCoachAffiliationRepository = fencerCoachAffiliationRepository;
    }
}
