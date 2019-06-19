package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.RefereeClubAffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefereeClubAffiliationServiceImpl implements RefereeClubAffiliationService {

    private RefereeClubAffiliationRepository refereeClubAffiliationRepository;

    @Autowired
    public RefereeClubAffiliationServiceImpl(RefereeClubAffiliationRepository refereeClubAffiliationRepository){
        this.refereeClubAffiliationRepository = refereeClubAffiliationRepository;
    }
}
