package com.hematac.fencingstats.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BoutDtoInput {

    //fencers should be objects too, later.
    // moer identifying fields needed.

    @NotBlank(message = "Empty parameter: fencer one name")
    public String fencerOneName;
    @NotBlank(message = "Empty parameter: fencer two name")
    public String fencerTwoName;

    //@NotNull(message = "Missing parameter: quantity")
}
