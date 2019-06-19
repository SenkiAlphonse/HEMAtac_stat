package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.IndividualBoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndividualBoutServiceImpl implements IndividualBoutService {

    private IndividualBoutRepository individualBoutRepository;
    private BoutRepository boutRepository;

    @Autowired
    public IndividualBoutServiceImpl(IndividualBoutRepository individualBoutRepository, BoutRepository boutRepository){
        this.individualBoutRepository = individualBoutRepository;
        this.boutRepository = boutRepository;
    }
}
