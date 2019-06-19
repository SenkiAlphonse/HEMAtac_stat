package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.FencerClubAffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FencerClubAffiliationServiceImpl implements FencerClubAffiliationService {

    private FencerClubAffiliationRepository fencerClubAffiliationRepository;

    @Autowired
    public FencerClubAffiliationServiceImpl(FencerClubAffiliationRepository fencerClubAffiliationRepository){
        this.fencerClubAffiliationRepository = fencerClubAffiliationRepository;
    }
}
