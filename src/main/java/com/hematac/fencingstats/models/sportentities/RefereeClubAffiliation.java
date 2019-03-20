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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Referee getReferee() {
    return referee;
  }

  public void setReferee(Referee referee) {
    this.referee = referee;
  }

  public Club getClub() {
    return club;
  }

  public void setClub(Club club) {
    this.club = club;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getQuitDate() {
    return quitDate;
  }

  public void setQuitDate(Date quitDate) {
    this.quitDate = quitDate;
  }
}
