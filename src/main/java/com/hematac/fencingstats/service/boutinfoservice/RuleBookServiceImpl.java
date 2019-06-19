package com.hematac.fencingstats.service.boutinfoservice;

import com.hematac.fencingstats.repository.boutinforepository.RuleBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleBookServiceImpl implements RuleBookService {

    private RuleBookRepository ruleBookRepository;

    @Autowired
    public RuleBookServiceImpl(RuleBookRepository ruleBookRepository){
        this.ruleBookRepository = ruleBookRepository;
    }
}
