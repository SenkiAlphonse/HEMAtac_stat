package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fencers")
public class Fencer {

  @Id
  @GeneratedValue
  private long id;

  private Handedness handedness;

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<ClubAffiliation> clubAffiliationHistory;

  @OneToMany(mappedBy = "fencer",
      cascade = CascadeType.REMOVE)
  private List<TeamAffiliation> teamAffiliationHistory;
}
