package com.hematac.fencingstats.models.sportentities;

import com.hematac.fencingstats.models.boutinfos.AssaultOutcome;
import com.hematac.fencingstats.models.boutinfos.Bout;
import com.hematac.fencingstats.models.userhandling.User;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "fencers")
public class Fencer {

  @Id
  @GeneratedValue
  private long id;

  @NotNull(message = "Fencer's name is required")
  private String name;

  private Locale nationality;

  private Handedness handedness;

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<FencerClubAffiliation> fencerClubAffiliationHistory = new ArrayList<>();

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<FencerCoachAffiliation> fencerCoachAffiliationHistory = new ArrayList<>();

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<FencerTeamAffiliation> fencerTeamAffiliationHistory = new ArrayList<>();

  @ManyToMany(mappedBy = "fencers")
  private Set<Bout> bouts = new HashSet<>();

  @ManyToMany(mappedBy = "receivingFencers")
  private Set<AssaultOutcome> assaultOutcomesReceived = new HashSet<>();

  @OneToOne(mappedBy = "iAmaFencer", cascade = CascadeType.ALL,
      fetch = FetchType.LAZY)
  private User user;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Locale getNationality() {
    return nationality;
  }

  public void setNationality(Locale nationality) {
    this.nationality = nationality;
  }

  public Handedness getHandedness() {
    return handedness;
  }

  public void setHandedness(Handedness handedness) {
    this.handedness = handedness;
  }

  public List<FencerClubAffiliation> getFencerClubAffiliationHistory() {
    return fencerClubAffiliationHistory;
  }

  public void setFencerClubAffiliationHistory(List<FencerClubAffiliation> fencerClubAffiliationHistory) {
    this.fencerClubAffiliationHistory = fencerClubAffiliationHistory;
  }

  public List<FencerCoachAffiliation> getFencerCoachAffiliationHistory() {
    return fencerCoachAffiliationHistory;
  }

  public void setFencerCoachAffiliationHistory(List<FencerCoachAffiliation> fencerCoachAffiliationHistory) {
    this.fencerCoachAffiliationHistory = fencerCoachAffiliationHistory;
  }

  public List<FencerTeamAffiliation> getFencerTeamAffiliationHistory() {
    return fencerTeamAffiliationHistory;
  }

  public void setFencerTeamAffiliationHistory(List<FencerTeamAffiliation> fencerTeamAffiliationHistory) {
    this.fencerTeamAffiliationHistory = fencerTeamAffiliationHistory;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Set<Bout> getBouts() {
    return bouts;
  }

  public void setBouts(Set<Bout> bouts) {
    this.bouts = bouts;
  }

  public Set<AssaultOutcome> getAssaultOutcomesReceived() {
    return assaultOutcomesReceived;
  }

  public void setAssaultOutcomesReceived(Set<AssaultOutcome> assaultOutcomesReceived) {
    this.assaultOutcomesReceived = assaultOutcomesReceived;
  }
}
