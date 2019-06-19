package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.YellowCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YellowCardServiceImpl implements YellowCardService {

    private YellowCardRepository yellowCardRepository;
    private AssaultOutcomeRepository assaultOutcomeRepository;

    @Autowired
    public YellowCardServiceImpl(YellowCardRepository yellowCardRepository, AssaultOutcomeRepository assaultOutcomeRepository){
        this.yellowCardRepository = yellowCardRepository;
        this.assaultOutcomeRepository = assaultOutcomeRepository;
    }
}
