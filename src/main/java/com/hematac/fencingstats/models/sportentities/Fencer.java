package com.hematac.fencingstats.models.sportentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fencers")
public class Fencer {

  @Id
  @GeneratedValue
  private long id;
  //handedness!!
}
