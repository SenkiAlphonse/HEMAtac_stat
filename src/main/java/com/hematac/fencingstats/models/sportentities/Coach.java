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

  @OneToMany(mappedBy = "coach",
      cascade = CascadeType.REMOVE)
  private List<FencerCoachAffiliation> fencerAffiliationHistory;
}
