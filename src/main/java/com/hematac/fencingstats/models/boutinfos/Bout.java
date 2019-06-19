package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;
import com.hematac.fencingstats.models.sportentities.Weapon;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bouts")
public abstract class Bout {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id")
  private Event event;

  private LocalDateTime dateTimeOfBout;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "weapon_id")
  private Weapon weapon;

  @ManyToOne
  @JoinColumn(name = "bout_type_id")
  private BoutType boutType;

  //arena size/shape??

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_one_id")
  private Fencer fencerOne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fencer_two_id")
  private Fencer fencerTwo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "referee_id")
  private Referee referee;

  @OneToMany(mappedBy = "bout")
  private List<AssaultOutcome> assaultOutcomeList = new ArrayList<>();

  private BoutOutcomes boutOutcome;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public LocalDateTime getDateTimeOfBout() {
    return dateTimeOfBout;
  }

  public void setDateTimeOfBout(LocalDateTime dateTimeOfBout) {
    this.dateTimeOfBout = dateTimeOfBout;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public BoutType getBoutType() {
    return boutType;
  }

  public void setBoutType(BoutType boutType) {
    this.boutType = boutType;
  }

  public Fencer getFencerOne() {
    return fencerOne;
  }

  public void setFencerOne(Fencer fencerOne) {
    this.fencerOne = fencerOne;
  }

  public Fencer getFencerTwo() {
    return fencerTwo;
  }

  public void setFencerTwo(Fencer fencerTwo) {
    this.fencerTwo = fencerTwo;
  }

  public Referee getReferee() {
    return referee;
  }

  public void setReferee(Referee referee) {
    this.referee = referee;
  }

  public List<AssaultOutcome> getAssaultOutcomeList() {
    return assaultOutcomeList;
  }

  public void setAssaultOutcomeList(List<AssaultOutcome> assaultOutcomeList) {
    this.assaultOutcomeList = assaultOutcomeList;
  }

  public BoutOutcomes getBoutOutcome() {
    return boutOutcome;
  }

  public void setBoutOutcome(BoutOutcomes boutOutcome) {
    this.boutOutcome = boutOutcome;
  }
}
