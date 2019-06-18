package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.repository.sportentityrepository.FederationRepository;
import org.springframework.stereotype.Service;

@Service
public class FederationServiceImpl implements FederationService {

    private FederationRepository federationRepository;

    public FederationServiceImpl(FederationRepository federationRepository){
        this.federationRepository = federationRepository;
    }
}
