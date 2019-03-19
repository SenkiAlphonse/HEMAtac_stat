package com.hematac.fencingstats.models.sportentities;

import com.hematac.fencingstats.models.userhandling.User;

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

  @OneToOne(mappedBy = "fencer", cascade = CascadeType.ALL,
      fetch = FetchType.LAZY)
  private User user;


}
