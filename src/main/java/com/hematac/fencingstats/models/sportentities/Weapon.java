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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getWeaponName() {
    return weaponName;
  }

  public void setWeaponName(String weaponName) {
    this.weaponName = weaponName;
  }

  public String getAthleteGender() {
    return athleteGender;
  }

  public void setAthleteGender(String athleteGender) {
    this.athleteGender = athleteGender;
  }

  public Set<Event> getEvents() {
    return events;
  }

  public void setEvents(Set<Event> events) {
    this.events = events;
  }
}
