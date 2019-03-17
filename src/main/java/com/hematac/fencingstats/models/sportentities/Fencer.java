package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fencers")
public class Fencer {

  @Id
  @GeneratedValue
  private long id;

  private String nationality;

  private Handedness handedness;

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<FencerClubAffiliation> fencerClubAffiliationHistory;

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<FencerCoachAffiliation> fencerCoachAffiliationHistory;

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<FencerTeamAffiliation> fencerTeamAffiliationHistory;
}
