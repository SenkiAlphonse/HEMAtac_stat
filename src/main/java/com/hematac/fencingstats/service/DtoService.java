package com.hematac.fencingstats.service;

import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.dto.FencerDtoDisplay;
import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.sportentities.Fencer;

import java.util.List;

public interface DtoService {
    BoutDtoDisplay getDtoFromBout(Bout bout);
    List<BoutDtoDisplay> getDtosFromBouts(List<Bout> bouts);

    FencerDtoDisplay getDtoFromFencer(Fencer fencer);
    List<FencerDtoDisplay> getDtosFromFencers(List<Fencer> fencers);
}
