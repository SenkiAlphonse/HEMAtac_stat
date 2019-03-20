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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Referee getReferee() {
    return referee;
  }

  public void setReferee(Referee referee) {
    this.referee = referee;
  }

  public Coach getCoach() {
    return coach;
  }

  public void setCoach(Coach coach) {
    this.coach = coach;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
