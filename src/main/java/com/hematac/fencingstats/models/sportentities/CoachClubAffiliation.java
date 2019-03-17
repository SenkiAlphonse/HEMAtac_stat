package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "coach_club_affiliations")
public class CoachClubAffiliation {

  @Id
  @GeneratedValue
  private long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "coach_id")
  private Coach coach;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "club_id")
  private Club club;

  @NotNull
  private Date startDate;

  private Date quitDate;
}
