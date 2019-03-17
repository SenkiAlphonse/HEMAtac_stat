package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "coaches")
public class Coach {
  @Id
  @GeneratedValue
  private long id;

  private String nationality;

  private String diplomaId;

  private String diplomaTitle;

  private String diplomaIssuer;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<FencerCoachAffiliation> fencerCoachAffiliationHistory;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<RefereeCoachAffiliation> refereeCoachAffiliationHistory;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<CoachClubAffiliation> coachClubAffiliationHistory;

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<CoachTeamAffiliation> coachTeamAffiliationHistory;
}