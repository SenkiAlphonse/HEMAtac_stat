package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import org.springframework.stereotype.Service;

@Service
public class AssaultOutcomeServiceImpl implements AssaultOutcomeService {

    private AssaultOutcomeRepository assaultOutcomeRepository;

    public AssaultOutcomeServiceImpl(AssaultOutcomeRepository assaultOutcomeRepository){
        this.assaultOutcomeRepository = assaultOutcomeRepository;
    }
}
