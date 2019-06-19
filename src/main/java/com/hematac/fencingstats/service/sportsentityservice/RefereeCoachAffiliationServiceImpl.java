package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.RefereeClubAffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefereeCoachAffiliationServiceImpl implements RefereeCoachAffiliationService {

    private RefereeClubAffiliationRepository refereeClubAffiliationRepository;

    @Autowired
    public RefereeCoachAffiliationServiceImpl(RefereeClubAffiliationRepository refereeClubAffiliationRepository){
        this.refereeClubAffiliationRepository = refereeClubAffiliationRepository;
    }
}
