package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Team;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team_matches")
public class TeamMatch {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_one_id")
  private Team teamOne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_two_id")
  private Team teamTwo;

  @OneToMany(mappedBy = "teamMatch")
  private List<TeamMatchBout> boutList = new ArrayList<TeamMatchBout>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Team getTeamOne() {
    return teamOne;
  }

  public void setTeamOne(Team teamOne) {
    this.teamOne = teamOne;
  }

  public Team getTeamTwo() {
    return teamTwo;
  }

  public void setTeamTwo(Team teamTwo) {
    this.teamTwo = teamTwo;
  }

  public List<TeamMatchBout> getBoutList() {
    return boutList;
  }

  public void setBoutList(List<TeamMatchBout> boutList) {
    this.boutList = boutList;
  }
}
