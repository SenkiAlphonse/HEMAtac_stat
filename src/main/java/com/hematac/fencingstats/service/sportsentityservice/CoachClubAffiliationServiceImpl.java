package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.CoachClubAffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachClubAffiliationServiceImpl implements CoachClubAffiliationService {

    private CoachClubAffiliationRepository coachClubAffiliationRepository;

    @Autowired
    public CoachClubAffiliationServiceImpl(CoachClubAffiliationRepository coachClubAffiliationRepository){
        this.coachClubAffiliationRepository = coachClubAffiliationRepository;
    }
}
