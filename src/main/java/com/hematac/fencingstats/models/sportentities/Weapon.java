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

  private String name;

  private AthleteCategory athleteCategory;

  @ManyToMany(mappedBy = "weapons")
  private Set<Event> events = new HashSet<>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AthleteCategory getAthleteGender() {
    return athleteCategory;
  }

  public void setAthleteGender(AthleteCategory athleteCategory) {
    this.athleteCategory = athleteCategory;
  }

  public Set<Event> getEvents() {
    return events;
  }

  public void setEvents(Set<Event> events) {
    this.events = events;
  }
}
