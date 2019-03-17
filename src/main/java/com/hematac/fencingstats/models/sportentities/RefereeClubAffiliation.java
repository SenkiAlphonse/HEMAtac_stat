package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "referee_club_affiliations")
public class RefereeClubAffiliation {
  @Id
  @GeneratedValue
  private long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "club_id")
  private Club club;

  @NotNull
  private Date startDate;

  private Date quitDate;
}
