package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Ref;
import java.util.Date;

@Entity
@Table(name = "referee_coach")
public class RefereeCoachAffiliation {
  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "coach_id")
  private Coach coach;

  @NotNull
  private Date startDate;

  private Date endDate;

}
