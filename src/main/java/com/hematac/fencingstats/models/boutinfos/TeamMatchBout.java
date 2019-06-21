package com.hematac.fencingstats.models.boutinfos;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class TeamMatchBout extends Bout {

  @NotNull(message = "The team bout is missing the team match ID")
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
