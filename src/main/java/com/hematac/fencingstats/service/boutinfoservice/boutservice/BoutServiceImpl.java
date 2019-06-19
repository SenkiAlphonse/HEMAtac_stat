package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.boutinfos.FencersOfBout;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BoutServiceImpl implements BoutService {

    private BoutRepository boutRepository;

    @Autowired
    public BoutServiceImpl(BoutRepository boutRepository){
        this.boutRepository = boutRepository;
    }

    @Override
    public List<Bout> getAll() {
        return boutRepository.findAll();
    }

    @Override
    public Bout getById(long id) {
        return boutRepository.findById(id);
    }

    @Override
    public BoutDtoDisplay getDtoFromEntity(Bout bout) {
        BoutDtoDisplay boutDto = new BoutDtoDisplay();

        boutDto.id = bout.getId();

        boutDto.fencerOneName = bout.getFencerOne().getName();
        boutDto.fencerTwoName = bout.getFencerTwo().getName();

        boutDto.fencerOneScore = bout.getAssaultOutcomeList().stream().filter(t ->
                t.isPointWorthy()
                        && (t.getReceivedBy().equals(FencersOfBout.FENCER_TWO)
                            || t.getReceivedBy().equals(FencersOfBout.BOTH)))
                .count();
        boutDto.fencerTwoScore = bout.getAssaultOutcomeList().stream().filter(t ->
                t.isPointWorthy()
                        && (t.getReceivedBy().equals(FencersOfBout.FENCER_ONE)
                            || t.getReceivedBy().equals(FencersOfBout.BOTH)))
                .count();

        boutDto.event = bout.getEvent().getName();

        boutDto.date = bout.getDateTimeOfBout().toString();

        return boutDto;
    }

    @Override
    public List<BoutDtoDisplay> getDtosFromEntities(List<Bout> bouts){
        if (bouts == null || bouts.isEmpty()) {
            return Collections.emptyList();
        }

        List<BoutDtoDisplay> boutDtos = new ArrayList<>();

        for (Bout bout : bouts) {
            boutDtos.add(getDtoFromEntity(bout));
        }

        return boutDtos;
    }
}
