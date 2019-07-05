package com.hematac.fencingstats.dto;

import java.util.List;

public class EventDtoInput {
    public long id;
    public String name;
    public String country;
    public String organiser;
    //club or federation or committee.
    public List<Long> weaponIds;
}
