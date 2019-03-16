package com.hematac.fencingstats.models.sportentities;

import com.hematac.fencingstats.models.boutinfos.Bout;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "referees")
public class Referee {

  @Id
  @GeneratedValue
  private long id;

  private String nationality;

  @OneToMany(mappedBy = "referee")
  private List<Bout> directedBoutList = new ArrayList<>();
}
