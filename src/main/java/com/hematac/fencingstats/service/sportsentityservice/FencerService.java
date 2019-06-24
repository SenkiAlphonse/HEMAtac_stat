package com.hematac.fencingstats.service.sportsentityservice;

import com.hematac.fencingstats.dto.FencerDtoDisplay;
import com.hematac.fencingstats.models.sportentities.Fencer;

import java.util.List;

public interface FencerService {
    void save(Fencer fencer);
    List<Fencer> getAll();
    List<Fencer> getAll(int pageId);
    List<Fencer> getAll(String nameFilter, int pageId);
    Fencer getById(long id);
    FencerDtoDisplay getDtoFromEntity(Fencer fencer);
    List<FencerDtoDisplay> getDtosFromEntities(List<Fencer> fencers);
}
