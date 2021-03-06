package com.hematac.fencingstats.service.boutinfoservice.assaultoutcomeservice;

import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.AssaultOutcomeRepository;
import com.hematac.fencingstats.repository.boutinforepository.assaultoutcomerepository.OtherOutcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherOutcomeServiceImpl implements OtherOutcomeService {

    private OtherOutcomeRepository otherOutcomeRepository;
    private AssaultOutcomeRepository assaultOutcomeRepository;

    @Autowired
    public OtherOutcomeServiceImpl(OtherOutcomeRepository otherOutcomeRepository, AssaultOutcomeRepository assaultOutcomeRepository){
        this.otherOutcomeRepository = otherOutcomeRepository;
        this.assaultOutcomeRepository = assaultOutcomeRepository;
    }
}
