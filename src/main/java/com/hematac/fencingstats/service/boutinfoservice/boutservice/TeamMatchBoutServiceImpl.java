package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.TeamMatchBoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamMatchBoutServiceImpl implements TeamMatchBoutService {

    private TeamMatchBoutRepository teamMatchBoutRepository;
    private BoutRepository boutRepository;

    @Autowired
    public TeamMatchBoutServiceImpl(TeamMatchBoutRepository teamMatchBoutRepository, BoutRepository boutRepository){
        this.teamMatchBoutRepository = teamMatchBoutRepository;
        this.boutRepository = boutRepository;
    }
}
