package com.hematac.fencingstats.service.boutinfoservice.boutservice;

import com.hematac.fencingstats.models.boutinfos.Bout;

import java.util.List;

public interface BoutService {
    List<Bout> getAll();
    List<Bout> getAll(int pageId);
    List<Bout> getAll(String nameFilter, int pageId);
    List<Bout> getAll(String nameFilter1, String nameFilter2, int pageId);
    Bout getById(long id);
}
