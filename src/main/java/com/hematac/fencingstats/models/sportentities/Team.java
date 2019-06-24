package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

  @Id
  @GeneratedValue
  private long id;

  private String name;

  @OneToMany(mappedBy = "team")
  private List<FencerTeamAffiliation> fencerTeamAffiliationList = new ArrayList<>();

  @OneToMany(mappedBy = "team")
  private List<CoachTeamAffiliation> coachTeamAffiliationList = new ArrayList<>();

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

  public List<FencerTeamAffiliation> getFencerTeamAffiliationList() {
    return fencerTeamAffiliationList;
  }

  public void setFencerTeamAffiliationList(List<FencerTeamAffiliation> fencerTeamAffiliationList) {
    this.fencerTeamAffiliationList = fencerTeamAffiliationList;
  }

  public List<CoachTeamAffiliation> getCoachTeamAffiliationList() {
    return coachTeamAffiliationList;
  }

  public void setCoachTeamAffiliationList(List<CoachTeamAffiliation> coachTeamAffiliationList) {
    this.coachTeamAffiliationList = coachTeamAffiliationList;
  }
}
