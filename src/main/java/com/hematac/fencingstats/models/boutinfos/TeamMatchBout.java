package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.*;

@Entity
@Table(name = "team_match_bout")
public class TeamMatchBout extends Bout {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_match_id")
  private TeamMatch teamMatch;

  public TeamMatch getTeamMatch() {
    return teamMatch;
  }

  public void setTeamMatch(TeamMatch teamMatch) {
    this.teamMatch = teamMatch;
  }
}
