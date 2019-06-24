package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.dto.FencerDtoDisplay;
import com.hematac.fencingstats.models.sportentities.*;
import com.hematac.fencingstats.repository.sportentityrepository.FencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
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

    @Override
    public FencerDtoDisplay getDtoFromEntity(Fencer fencer) {
        FencerDtoDisplay fencerDto = new FencerDtoDisplay();

        fencerDto.id = fencer.getId();
        fencerDto.name = fencer.getName();
        fencerDto.nationality = fencer.getNationality().getDisplayCountry();
        fencerDto.handedness = fencer.getHandedness().toString();

        FencerCoachAffiliation lastCoach = fencer.getFencerCoachAffiliationHistory().stream().reduce((first, second) -> second).orElse(null);
        if(lastCoach != null) {
            fencerDto.lastCoach = lastCoach.getCoach().getName();
        }

        FencerClubAffiliation lastClub = fencer.getFencerClubAffiliationHistory().stream().reduce((first, second) -> second).orElse(null);
        if(lastClub != null){
            fencerDto.lastClub = lastClub.getClub().getName();
        }

        FencerTeamAffiliation lastTeam = fencer.getFencerTeamAffiliationHistory().stream().reduce((first, second) -> second).orElse(null);
        if(lastTeam != null){
            fencerDto.lastTeam = lastTeam.getTeam().getName();
        }

        return fencerDto;
    }

    @Override
    public List<FencerDtoDisplay> getDtosFromEntities(List<Fencer> fencers) {
        if (fencers == null || fencers.isEmpty()) {
            return Collections.emptyList();
        }

        List<FencerDtoDisplay> fencerDtos = new ArrayList<>();

        for (Fencer fencer : fencers) {
            fencerDtos.add(getDtoFromEntity(fencer));
        }

        return fencerDtos;
    }
}
