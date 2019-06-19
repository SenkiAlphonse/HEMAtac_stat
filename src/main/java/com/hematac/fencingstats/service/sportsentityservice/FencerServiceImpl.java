package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.models.boutinfos.IndividualBout;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.repository.sportentityrepository.FencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FencerServiceImpl implements FencerService {

    private FencerRepository fencerRepository;

    @Autowired
    public FencerServiceImpl(FencerRepository fencerRepository){
        this.fencerRepository = fencerRepository;
    }

    @Override
    public void save(Fencer fencer) {
        fencerRepository.save(fencer);
    }
}
