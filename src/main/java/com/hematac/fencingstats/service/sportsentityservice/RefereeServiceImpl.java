package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefereeServiceImpl implements RefereeService {

    private RefereeRepository refereeRepository;

    @Autowired
    public RefereeServiceImpl(RefereeRepository refereeRepository){
        this.refereeRepository = refereeRepository;
    }
}
