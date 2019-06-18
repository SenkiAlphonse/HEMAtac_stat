package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.FencerCoachAffiliationRepository;
import org.springframework.stereotype.Service;

@Service
public class FencerCoachAffiliationServiceImpl implements FencerCoachAffiliationService {

    private FencerCoachAffiliationRepository fencerCoachAffiliationRepository;

    public FencerCoachAffiliationServiceImpl(FencerCoachAffiliationRepository fencerCoachAffiliationRepository){
        this.fencerCoachAffiliationRepository = fencerCoachAffiliationRepository;
    }
}
