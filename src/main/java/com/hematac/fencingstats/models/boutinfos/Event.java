package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Weapon;
import com.hematac.fencingstats.models.sportentities.Club;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "events")
public class Event {

  @Id
  @GeneratedValue
  private long id;

  private String name;

  private String country;
  //could be enum or set or else, to pick country code.

  private String organiser;
  //club or federation or committee.

  @ManyToMany(cascade = {
      CascadeType.PERSIST,
      CascadeType.MERGE,
      CascadeType.REFRESH
  })
  @JoinTable(name = "event_weapon",
      joinColumns = @JoinColumn(name = "event_id"),
      inverseJoinColumns = @JoinColumn(name = "weapon_id")
  )
  private Set<Weapon> weapons = new HashSet<>();
}
