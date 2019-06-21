package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.repository.boutinforepository.BoutSchemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoutSchemeServiceImpl implements BoutSchemeService {

    private BoutSchemeRepository boutSchemeRepository;

    @Autowired
    public BoutSchemeServiceImpl(BoutSchemeRepository boutSchemeRepository){
        this.boutSchemeRepository = boutSchemeRepository;
    }
}
