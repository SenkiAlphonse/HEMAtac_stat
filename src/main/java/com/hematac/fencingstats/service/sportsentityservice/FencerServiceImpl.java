package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.repository.sportentityrepository.FencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Fencer getById(long id) {
        return fencerRepository.findById(id);
    }

    @Override
    public List<Fencer> getAll() {
        return fencerRepository.findAll();
    }

    @Override
    public List<Fencer> getAll(int pageId) {
        return fencerRepository.findAllByOrderByNameAsc(PageRequest.of(pageId, 20));
    }

    @Override
    public List<Fencer> getAll(String nameFilter, int pageId) {
        return fencerRepository.findAllByNameContainingOrderByNationalityAsc(nameFilter, PageRequest.of(pageId, 20));
    }
}
