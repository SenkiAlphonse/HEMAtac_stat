package com.hematac.fencingstats.service;

import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.dto.FencerDtoDisplay;
import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.FencerClubAffiliation;
import com.hematac.fencingstats.models.sportentities.FencerCoachAffiliation;
import com.hematac.fencingstats.models.sportentities.FencerTeamAffiliation;
import com.hematac.fencingstats.repository.boutinforepository.boutrepository.BoutRepository;
import com.hematac.fencingstats.repository.sportentityrepository.FencerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class DtoServiceImpl implements DtoService {

    private BoutRepository boutRepository;
    private FencerRepository fencerRepository;

    public DtoServiceImpl(BoutRepository boutRepository, FencerRepository fencerRepository){
        this.boutRepository = boutRepository;
        this.fencerRepository = fencerRepository;
    }

    @Override
    public BoutDtoDisplay getDtoFromBout(Bout bout) {
        BoutDtoDisplay boutDto = new BoutDtoDisplay();

        boutDto.id = bout.getId();

        Fencer[] fencers = bout.getFencers().toArray(new Fencer[2]);

        if (!Arrays.asList(fencers).contains(null)) {
            boutDto.fencerOne = getDtoFromFencer(fencers[0]);
            boutDto.fencerTwo = getDtoFromFencer(fencers[1]);
        }

        boutDto.boutType = bout.getClass().getSimpleName().equals("IndividualBout") ? "Individual":"Team";

        if (bout.getBoutScheme() != null){
            boutDto.boutScheme = bout.getBoutScheme().getBoutSchemeType().toString();
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
    public List<BoutDtoDisplay> getDtosFromBouts(List<Bout> bouts){
        if (bouts == null || bouts.isEmpty()) {
            return Collections.emptyList();
        }

        List<BoutDtoDisplay> boutDtos = new ArrayList<>();

        for (Bout bout : bouts) {
            boutDtos.add(getDtoFromBout(bout));
        }

        return boutDtos;
    }

    @Override
    public FencerDtoDisplay getDtoFromFencer(Fencer fencer) {
        FencerDtoDisplay fencerDto = new FencerDtoDisplay();

        fencerDto.id = fencer.getId();
        fencerDto.name = fencer.getName();

        if(fencer.getNationality() != null) {
            fencerDto.nationality = fencer.getNationality().getDisplayCountry();
        }

        if(fencer.getHandedness() != null) {
            fencerDto.handedness = fencer.getHandedness().toString();
        }

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
    public List<FencerDtoDisplay> getDtosFromFencers(List<Fencer> fencers) {
        if (fencers == null || fencers.isEmpty()) {
            return Collections.emptyList();
        }

        List<FencerDtoDisplay> fencerDtos = new ArrayList<>();

        for (Fencer fencer : fencers) {
            fencerDtos.add(getDtoFromFencer(fencer));
        }

        return fencerDtos;
    }
}
