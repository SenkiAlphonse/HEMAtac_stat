package com.hematac.fencingstats.models.sportentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Locale;

@Entity
@Table(name = "federations")
public class Federation {
  @Id
  @GeneratedValue
  private long id;

  private String name;

  private String abbreviation;

  private Locale nationality;
  //nationality nelegyen string...


}
