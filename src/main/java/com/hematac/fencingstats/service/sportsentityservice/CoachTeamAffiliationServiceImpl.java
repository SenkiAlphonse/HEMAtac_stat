package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.CoachTeamAffiliationRepository;
import org.springframework.stereotype.Service;

@Service
public class CoachTeamAffiliationServiceImpl implements CoachTeamAffiliationService {

    private CoachTeamAffiliationRepository coachTeamAffiliationRepository;

    public CoachTeamAffiliationServiceImpl(CoachTeamAffiliationRepository coachTeamAffiliationRepository){
        this.coachTeamAffiliationRepository = coachTeamAffiliationRepository;
    }
}
