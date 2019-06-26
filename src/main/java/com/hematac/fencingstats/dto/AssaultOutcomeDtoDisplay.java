package com.hematac.fencingstats.dto;

import java.util.List;

public class AssaultOutcomeDtoDisplay {

    public long id;
    private long boutId;
    private long eventId;
    private List<FencerDtoDisplay> receivingFencers;
    private boolean pointWorthy;
}
