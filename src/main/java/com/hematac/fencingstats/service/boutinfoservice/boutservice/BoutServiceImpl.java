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

    @Override
    public BoutDtoDisplay getDtoFromEntity(Bout bout) {
        BoutDtoDisplay boutDto = new BoutDtoDisplay();

        boutDto.id = bout.getId();

        Fencer[] fencers = bout.getFencers().toArray(new Fencer[2]);

        if (!Arrays.asList(fencers).contains(null)) {
            boutDto.fencerOneName = fencers[0].getName();
            boutDto.fencerTwoName = fencers[1].getName();
        }

        boutDto.boutType = bout.getClass().getSimpleName().equals("IndividualBout") ? "Individual":"Team";

        if (bout.getBoutScheme() != null){
            boutDto.boutScheme = bout.getBoutScheme().getName();
        }

        if(bout.getAssaultOutcomeList() != null && !bout.getAssaultOutcomeList().isEmpty()) {
            boutDto.fencerOneScore = bout.getAssaultOutcomeList().stream().filter(t ->
                    t.isPointWorthy() && (t.getReceivingFencers().contains(fencers[1]))).count();
            boutDto.fencerTwoScore = bout.getAssaultOutcomeList().stream().filter(t ->
                    t.isPointWorthy() && (t.getReceivingFencers().contains(fencers[0]))).count();
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
