package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.boutinfos.FencersOfBout;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoutServiceImpl implements BoutService {

    private BoutRepository boutRepository;

    @Autowired
    public BoutServiceImpl(BoutRepository boutRepository){
        this.boutRepository = boutRepository;
    }

    @Override
    public List<Bout> getAll(){
        return boutRepository.findAll();
    }

    @Override
    public List<Bout> getAll(int pageId) {
        return boutRepository.findAllByOrderByDateTimeOfBoutDesc(PageRequest.of(pageId, 3));
    }

    @Override
    public List<Bout> getAll(String nameFilter, int pageId) {
        return boutRepository.findDistinctByFencers_NameContainingIgnoreCaseOrderByDateTimeOfBoutDesc(nameFilter, PageRequest.of(pageId, 3));
    }

    @Override
    public List<Bout> getAll(String nameFilter1, String nameFilter2, int pageId) {
        return boutRepository.findDistinctByFencers_NameContainingAndFencers_NameContainingAllIgnoreCaseOrderByDateTimeOfBoutDesc(nameFilter1, nameFilter2, PageRequest.of(pageId, 3));
    }

    @Override
    public Bout getById(long id) {
        return boutRepository.findById(id);
    }
}
