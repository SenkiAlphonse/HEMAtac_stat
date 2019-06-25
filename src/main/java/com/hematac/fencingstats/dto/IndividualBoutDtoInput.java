package com.hematac.fencingstats.dto;

import javax.validation.constraints.NotNull;

public class IndividualBoutDtoInput {

    public long eventId;

    @NotNull(message = "Empty parameter: bout scheme (e.g. pool or elimination)")
    public long boutSchemeId;
    public String date;

    @NotNull(message = "Empty parameter: fencer one name")
    public long fencerOneId;
    @NotNull(message = "Empty parameter: fencer two name")
    public long fencerTwoId;
}
