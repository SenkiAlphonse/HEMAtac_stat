package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.repository.boutinforepository.BoutTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoutTypeServiceImpl implements BoutTypeService {

    private BoutTypeRepository boutTypeRepository;

    @Autowired
    public BoutTypeServiceImpl(BoutTypeRepository boutTypeRepository){
        this.boutTypeRepository = boutTypeRepository;
    }
}
