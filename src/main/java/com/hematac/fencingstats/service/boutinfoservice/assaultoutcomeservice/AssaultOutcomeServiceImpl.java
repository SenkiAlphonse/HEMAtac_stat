package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssaultOutcomeServiceImpl implements AssaultOutcomeService {

    private AssaultOutcomeRepository assaultOutcomeRepository;

    @Autowired
    public AssaultOutcomeServiceImpl(AssaultOutcomeRepository assaultOutcomeRepository){
        this.assaultOutcomeRepository = assaultOutcomeRepository;
    }
}
