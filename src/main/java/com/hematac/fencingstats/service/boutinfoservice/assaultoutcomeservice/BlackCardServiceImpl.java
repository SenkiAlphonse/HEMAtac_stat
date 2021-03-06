package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.BlackCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackCardServiceImpl implements BlackCardService {

    private BlackCardRepository blackCardRepository;
    private AssaultOutcomeRepository assaultOutcomeRepository;

    @Autowired
    public BlackCardServiceImpl(BlackCardRepository blackCardRepository, AssaultOutcomeRepository assaultOutcomeRepository){
        this.blackCardRepository = blackCardRepository;
        this.assaultOutcomeRepository= assaultOutcomeRepository;
    }



}
