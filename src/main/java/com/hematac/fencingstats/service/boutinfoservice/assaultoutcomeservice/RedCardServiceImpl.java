package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.RedCardRepository;
import org.springframework.stereotype.Service;

@Service
public class RedCardServiceImpl implements RedCardService {

    private RedCardRepository redCardRepository;
    private AssaultOutcomeRepository assaultOutcomeRepository;

    public RedCardServiceImpl(RedCardRepository redCardRepository, AssaultOutcomeRepository assaultOutcomeRepository){
        this.redCardRepository = redCardRepository;
        this.assaultOutcomeRepository = assaultOutcomeRepository;
    }
}
