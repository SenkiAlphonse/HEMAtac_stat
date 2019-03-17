package com.hematac.fencingstats.models.sportentities;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class FencerTeamAffiliation {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_id")
  private Team team;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_id")
  private Fencer fencer;

  @NotNull
  private Date startDate;

  private Date quitDate;

}
