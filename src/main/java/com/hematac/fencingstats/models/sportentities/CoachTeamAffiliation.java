package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "coach_team_affiliations")
public class CoachTeamAffiliation {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_id")
  private Team team;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_id")
  private Coach coach;

  @NotNull
  private Date startDate;

  private Date quitDate;
}
