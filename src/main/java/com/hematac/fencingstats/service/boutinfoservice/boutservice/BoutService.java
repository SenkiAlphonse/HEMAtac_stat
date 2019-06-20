package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.dto.BoutDtoDisplay;
import com.hematac.fencingstats.models.boutinfos.Bout;

import java.util.List;

public interface BoutService {
    List<Bout> getAll();
    List<Bout> getAll(int pageId);
    List<Bout> getAll(String nameFilter, int pageId);
    Bout getById(long id);
    BoutDtoDisplay getDtoFromEntity(Bout bout);
    List<BoutDtoDisplay> getDtosFromEntities(List<Bout> bouts);
}
