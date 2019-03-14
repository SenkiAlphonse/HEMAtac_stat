package com.hematac.fencingstats.models.sportentities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

  @Id
  @GeneratedValue
  private long id;

  @OneToMany(mappedBy = "team")
  private List<TeamAffiliation> teamAffiliationList = new ArrayList<>();
}
