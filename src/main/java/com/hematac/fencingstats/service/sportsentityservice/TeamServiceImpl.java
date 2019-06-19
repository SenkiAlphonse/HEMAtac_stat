package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }
}
