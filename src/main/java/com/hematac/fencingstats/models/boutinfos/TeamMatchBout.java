package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TeamMatchBout extends Bout {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_match_id")
  private TeamMatch teamMatch;


}
