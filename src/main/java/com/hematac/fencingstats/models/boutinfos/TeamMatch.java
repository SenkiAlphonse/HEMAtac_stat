package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;
import com.hematac.fencingstats.models.sportentities.Team;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class TeamMatch {

  @Id
  @GeneratedValue
  private long id;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_one_id")
  private Team teamOne;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_two_id")
  private Team teamTwo;

  @OneToMany(mappedBy = "teamMatch")
  private List<TeamMatchBout> boutList = new ArrayList<TeamMatchBout>();
}
