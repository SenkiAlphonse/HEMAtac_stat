package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.repository.boutinforepository.BoutTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class BoutTypeServiceImpl implements BoutService.BoutTypeService {

    private BoutTypeRepository boutTypeRepository;

    public BoutTypeServiceImpl(BoutTypeRepository boutTypeRepository){
        this.boutTypeRepository = boutTypeRepository;
    }
}
