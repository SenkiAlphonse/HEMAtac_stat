package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Referee;
import com.hematac.fencingstats.models.sportentities.Weapon;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
  @JoinColumn(name = "bout_scheme_id")
  private BoutScheme boutScheme;

  //arena size/shape??
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "bout_fencer",
          joinColumns = @JoinColumn(name = "bout_id"),
          inverseJoinColumns = @JoinColumn(name = "fencer_id")
  )
  private Set<Fencer> fencers = new HashSet<>();

  @OneToMany(mappedBy="bout")
  private List<AssaultOutcome> assaultOutcomes = new ArrayList<>();

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

  public Set<Fencer> getFencers() {
    return fencers;
  }

  public void setFencers(Set<Fencer> fencers) {
    this.fencers = fencers;
  }

  public List<AssaultOutcome> getAssaultOutcomes() {
    return assaultOutcomes;
  }

  public void setAssaultOutcomes(List<AssaultOutcome> assaultOutcomes) {
    this.assaultOutcomes = assaultOutcomes;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public BoutScheme getBoutScheme() {
    return boutScheme;
  }

  public void setBoutScheme(BoutScheme boutScheme) {
    this.boutScheme = boutScheme;
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
