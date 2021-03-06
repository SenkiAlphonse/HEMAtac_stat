package com.hematac.fencingstats.service.boutinfoservice;

import com.hematac.fencingstats.repository.boutinforepository.TeamMatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamMatchServiceImpl implements TeamMatchService {

    private TeamMatchRepository teamMatchRepository;

    @Autowired
    public TeamMatchServiceImpl(TeamMatchRepository teamMatchRepository){
        this.teamMatchRepository = teamMatchRepository;
    }
}
