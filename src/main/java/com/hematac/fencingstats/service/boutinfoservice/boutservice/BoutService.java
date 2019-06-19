package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.IndividualBoutRepository;
import org.springframework.stereotype.Service;

public interface BoutService {
    @Service
    class BoutServiceImpl implements BoutService {

        private BoutRepository boutRepository;

        public BoutServiceImpl(BoutRepository boutRepository){
            this.boutRepository = boutRepository;
        }
    }

    interface IndividualBoutService {
    }

    @Service
    class IndividualBoutServiceImpl implements IndividualBoutService {

        private IndividualBoutRepository individualBoutRepository;
        private BoutRepository boutRepository;

        public IndividualBoutServiceImpl(IndividualBoutRepository individualBoutRepository, BoutRepository boutRepository){
            this.individualBoutRepository = individualBoutRepository;
            this.boutRepository = boutRepository;
        }
    }

    interface BoutTypeService {
    }
}
