package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.CoachTeamAffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachTeamAffiliationServiceImpl implements CoachTeamAffiliationService {

    private CoachTeamAffiliationRepository coachTeamAffiliationRepository;

    @Autowired
    public CoachTeamAffiliationServiceImpl(CoachTeamAffiliationRepository coachTeamAffiliationRepository){
        this.coachTeamAffiliationRepository = coachTeamAffiliationRepository;
    }
}
