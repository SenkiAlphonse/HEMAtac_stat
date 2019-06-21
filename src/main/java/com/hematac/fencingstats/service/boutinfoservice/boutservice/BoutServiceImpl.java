package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.boutinfos.FencersOfBout;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
    public List<Bout> getAll(){
        return boutRepository.findAll();
    }

    @Override
    public List<Bout> getAll(int pageId) {
        return boutRepository.findAllByOrderByDateTimeOfBoutDesc(PageRequest.of(pageId, 3));
    }

    @Override
    public List<Bout> getAll(String nameFilter, int pageId) {
        return boutRepository.findByFencerOne_NameContainingOrFencerTwo_NameContainingAllIgnoreCase(nameFilter, nameFilter, PageRequest.of(pageId, 3));
    }

    @Override
    public List<Bout> getAll(String nameFilter1, String nameFilter2, int pageId) {
        return boutRepository.findByFencerOne_NameContainingOrFencerTwo_NameContainingAllIgnoreCase(nameFilter1, nameFilter2, PageRequest.of(pageId, 3));
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
        boutDto.boutType = bout.getClass().getSimpleName().equals("IndividualBout") ? "Individual":"Team";

        if (bout.getBoutScheme() != null){
            boutDto.boutScheme = bout.getBoutScheme().getName();
        }

        if(bout.getAssaultOutcomeList() != null && !bout.getAssaultOutcomeList().isEmpty()) {
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
        }

        if(bout.getEvent() != null) {
            boutDto.event = bout.getEvent().getName();
        }

        if(bout.getDateTimeOfBout() != null) {
            boutDto.date = bout.getDateTimeOfBout().toString();
        }

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
