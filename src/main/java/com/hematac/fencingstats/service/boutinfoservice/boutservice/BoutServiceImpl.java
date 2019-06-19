package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoutServiceImpl implements BoutService {

    private BoutRepository boutRepository;

    @Autowired
    public BoutServiceImpl(BoutRepository boutRepository){
        this.boutRepository = boutRepository;
    }
}
