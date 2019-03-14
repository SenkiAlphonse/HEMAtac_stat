package com.hematac.fencingstats.models.sportentities;

import com.hematac.fencingstats.models.boutinfos.Event;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "weapons")
public class Weapon {

  @Id
  @GeneratedValue
  private long id;

  private String weaponName;

  private String athleteGender;

  @ManyToMany(mappedBy = "weapons")
  private Set<Event> events = new HashSet<>();
}
