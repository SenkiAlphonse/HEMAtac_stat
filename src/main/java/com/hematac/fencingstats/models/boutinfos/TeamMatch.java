package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Fencer;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class TeamMatch {

  @Id
  @GeneratedValue
  private long id;

  private List<Fencer> teamOne = new ArrayList<Fencer>();
  private List<Fencer> teamTwo = new ArrayList<Fencer>();

  private List<TeamMatchBout> boutList = new ArrayList<TeamMatchBout>();
}
